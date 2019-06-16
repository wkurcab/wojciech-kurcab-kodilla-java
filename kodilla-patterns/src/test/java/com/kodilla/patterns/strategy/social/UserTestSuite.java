package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User mike = new Millenials("Mike Meyers");
        User bob = new YGeneration("Bob Builder");
        User corey = new ZGeneration("Corey Price");

        //When
        String mikeShare = mike.sharePost();
        System.out.println("Mike share: " + mikeShare);
        String bobShare = bob.sharePost();
        System.out.println("Bob share: " + bobShare);
        String coreyShare = corey.sharePost();
        System.out.println("Corey share: " + coreyShare);

        //Then
        Assert.assertEquals("Facebook", mikeShare);
        Assert.assertEquals("Twitter", bobShare);
        Assert.assertEquals("Snapchat", coreyShare);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User mike = new Millenials("Mike Meyers");

        //When
        String mikeShare = mike.sharePost();
        System.out.println("Mike share: " + mikeShare);
        mike.setNewSocialPublisher(new TwitterPublisher());
        mikeShare = mike.sharePost();
        System.out.println("Mike new share: " + mikeShare);

        //Then
        Assert.assertEquals("Twitter", mikeShare);
    }
}
