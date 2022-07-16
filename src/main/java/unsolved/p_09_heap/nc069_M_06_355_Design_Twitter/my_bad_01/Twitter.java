package unsolved.p_09_heap.nc069_M_06_355_Design_Twitter.my_bad_01;

import java.util.*;

public class Twitter {

    Map<Integer, Set<Integer>> followers = new HashMap<>();

    Map<Integer, LinkedList<List<Integer>>> newFeeds = new HashMap<>();


    public Twitter() {

    }

    public void postTweet(int userId, int tweetId) {
        followers.computeIfAbsent(userId, k -> new HashSet<>());
        followers.get(userId).add(userId);

        for (int follower : followers.get(userId)) {
            newFeeds.computeIfAbsent(follower, k -> new LinkedList<>());
            LinkedList<List<Integer>> newFeed = newFeeds.get(follower);
            newFeed.addFirst(List.of(userId, tweetId));
            if (newFeed.size() > 10) newFeed.removeLast();
        }
    }

    public List<Integer> getNewsFeed(int userId) {
        List<Integer> newsFeed = new ArrayList<>();
        newFeeds.computeIfAbsent(userId, k -> new LinkedList<>());
        for (List<Integer> userTweet : newFeeds.get(userId)) {
            newsFeed.add(userTweet.get(1));
        }
        return newsFeed;
    }

    public void follow(int followerId, int followeeId) {
        followers.computeIfAbsent(followeeId, k -> new HashSet<>());
        followers.get(followeeId).add(followerId);

        newFeeds.computeIfAbsent(followerId, k -> new LinkedList<>());
        

    }

    public void unfollow(int followerId, int followeeId) {
        if (followers.containsKey(followeeId)) followers.get(followeeId).remove(followerId);

        for (List<Integer> userTweet : newFeeds.get(followerId)) {
            if (userTweet.get(0) == followeeId) newFeeds.get(followerId).remove(userTweet);
        }
    }
}
