package unsolved.p_09_heap.nc069_M_06_355_Design_Twitter;

import org.junit.Test;
import unsolved.p_09_heap.nc069_M_06_355_Design_Twitter.Twitter;

import java.util.List;

import static org.junit.Assert.*;

public class TwitterTest {


    @Test
    public void test_1(){
        Twitter twitter = new Twitter();
        twitter.postTweet(1, 5); // User 1 posts a new tweet (id = 5).
        twitter.getNewsFeed(1);  // User 1's news feed should return a list with 1 tweet id -> [5]. return [5]
        twitter.follow(1, 2);    // User 1 follows user 2.
        twitter.postTweet(2, 6); // User 2 posts a new tweet (id = 6).
        assertEquals(List.of(6,5), twitter.getNewsFeed(1));// User 1's news feed should return a list with 2 tweet ids -> [6, 5]. Tweet id 6 should precede tweet id 5 because it is posted after tweet id 5.
        twitter.unfollow(1, 2);
        assertEquals(List.of(5), twitter.getNewsFeed(1));// User 1's news feed should return a list with 1 tweet id -> [5], since user 1 is no longer following user 2.
    }


    @Test
    public void test_2(){
        Twitter twitter = new Twitter();
        twitter.postTweet(1, 1);
        assertEquals(List.of(1), twitter.getNewsFeed(1));
        twitter.follow(2, 1);
        assertEquals(List.of(1), twitter.getNewsFeed(2));
    }
}