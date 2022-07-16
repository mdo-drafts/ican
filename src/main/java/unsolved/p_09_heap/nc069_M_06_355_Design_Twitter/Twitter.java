package unsolved.p_09_heap.nc069_M_06_355_Design_Twitter;

import java.util.*;

public class Twitter {
    Map<Integer, Set<Integer>> followerMap = new HashMap<>();
    Map<Integer, LinkedList<Tweet>> tweetMap = new HashMap<>();
    int cnt = 0;

    public void postTweet(int userId, int tweetId) {
        followerMap.computeIfAbsent(userId, k -> new HashSet<>());
        followerMap.get(userId).add(userId);

        tweetMap.computeIfAbsent(userId, k -> new LinkedList<>());
        tweetMap.get(userId).addFirst(new Tweet(cnt++, tweetId));
    }

    public List<Integer> getNewsFeed(int userId) {
        if (!followerMap.containsKey(userId)) return new LinkedList<>();
        PriorityQueue<Tweet> feed = new PriorityQueue<>((t1, t2) -> t2.time - t1.time);
        followerMap.get(userId).stream()
                .filter(f -> tweetMap.containsKey(f))
                .forEach(f -> feed.addAll(tweetMap.get(f)));
        List<Integer> res = new LinkedList<>();
        while (feed.size() > 0 && res.size() < 10) res.add(feed.poll().id);
        return res;
    }

    public void follow(int followerId, int followeeId) {
        followerMap.computeIfAbsent(followerId, k -> new HashSet<>());
        followerMap.get(followerId).add(followeeId);
    }

    public void unfollow(int followerId, int followeeId) {
        if (followerMap.containsKey(followerId) && followeeId != followerId)
            followerMap.get(followerId).remove(followeeId);
    }

    class Tweet {
        int time;
        int id;

        Tweet(int time, int id) {
            this.time = time;
            this.id = id;
        }
    }
}
