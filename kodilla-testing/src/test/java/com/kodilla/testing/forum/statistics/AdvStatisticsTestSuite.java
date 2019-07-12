package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AdvStatisticsTestSuite {
    @Test
    public void testAdvStatisticsWithMock100Users() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        AdvStatistics advStatistics = new AdvStatistics();
        List<String> resultListOf100Users = forumUserList(100);
        when(statisticsMock.usersNames()).thenReturn(resultListOf100Users);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(30);

        //When
        advStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(100, advStatistics.getUsersCount());
        Assert.assertEquals(0, advStatistics.getPostCount());
        Assert.assertEquals(30, advStatistics.getCommentCount());
        Assert.assertEquals(0, advStatistics.getAveragePostsPerUser(), 0.001);
        Assert.assertEquals(0.3, advStatistics.getAverageCommentsPerUser(), 0.001);
        Assert.assertEquals(0, advStatistics.getAverageCommentsPerPost(), 0.001);
    }

    @Test
    public void testAdvStatisticsWithMock0Users() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        AdvStatistics advStatistics = new AdvStatistics();
        List<String> resultListOf0Users = forumUserList(0);
        when(statisticsMock.usersNames()).thenReturn(resultListOf0Users);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(30);

        //When
        advStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, advStatistics.getUsersCount());
        Assert.assertEquals(0, advStatistics.getPostCount());
        Assert.assertEquals(30, advStatistics.getCommentCount());
        Assert.assertEquals(0, advStatistics.getAveragePostsPerUser(), 0.001);
        Assert.assertEquals(0, advStatistics.getAverageCommentsPerUser(), 0.001);
        Assert.assertEquals(0, advStatistics.getAverageCommentsPerPost(), 0.001);
    }

    @Test
    public void testAdvStatisticsWithMock0Posts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        AdvStatistics advStatistics = new AdvStatistics();
        List<String> resultListOf100Users = forumUserList(100);
        when(statisticsMock.usersNames()).thenReturn(resultListOf100Users);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(200);

        //When
        advStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(100, advStatistics.getUsersCount());
        Assert.assertEquals(0, advStatistics.getPostCount());
        Assert.assertEquals(200, advStatistics.getCommentCount());
        Assert.assertEquals(0, advStatistics.getAveragePostsPerUser(), 0.001);
        Assert.assertEquals(2.0, advStatistics.getAverageCommentsPerUser(), 0.001);
        Assert.assertEquals(0, advStatistics.getAverageCommentsPerPost(), 0.001);
    }

    @Test
    public void testAdvStatisticsWithMock1000Posts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        AdvStatistics advStatistics = new AdvStatistics();
        List<String> resultListOf100Users = forumUserList(100);
        when(statisticsMock.usersNames()).thenReturn(resultListOf100Users);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(30);

        //When
        advStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(100, advStatistics.getUsersCount());
        Assert.assertEquals(1000, advStatistics.getPostCount());
        Assert.assertEquals(30, advStatistics.getCommentCount());
        Assert.assertEquals(10, advStatistics.getAveragePostsPerUser(), 0.001);
        Assert.assertEquals(0.3, advStatistics.getAverageCommentsPerUser(), 0.001);
        Assert.assertEquals(0.03, advStatistics.getAverageCommentsPerPost(), 0.001);
    }

    @Test
    public void testAdvStatisticsWithMockCommentsLessThanPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        AdvStatistics advStatistics = new AdvStatistics();
        List<String> resultListOf100Users = forumUserList(100);
        when(statisticsMock.usersNames()).thenReturn(resultListOf100Users);
        when(statisticsMock.postsCount()).thenReturn(50);
        when(statisticsMock.commentsCount()).thenReturn(30);

        //When
        advStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(100, advStatistics.getUsersCount());
        Assert.assertEquals(50, advStatistics.getPostCount());
        Assert.assertEquals(30, advStatistics.getCommentCount());
        Assert.assertEquals(0.5, advStatistics.getAveragePostsPerUser(), 0.001);
        Assert.assertEquals(0.3, advStatistics.getAverageCommentsPerUser(), 0.001);
        Assert.assertEquals(0.6, advStatistics.getAverageCommentsPerPost(), 0.001);
    }

    @Test
    public void testAdvStatisticsWithMockCommentsMoreThanPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        AdvStatistics advStatistics = new AdvStatistics();
        List<String> resultListOf100Users = forumUserList(100);
        when(statisticsMock.usersNames()).thenReturn(resultListOf100Users);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(30);

        //When
        advStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(100, advStatistics.getUsersCount());
        Assert.assertEquals(10, advStatistics.getPostCount());
        Assert.assertEquals(30, advStatistics.getCommentCount());
        Assert.assertEquals(0.1, advStatistics.getAveragePostsPerUser(), 0.001);
        Assert.assertEquals(0.3, advStatistics.getAverageCommentsPerUser(), 0.001);
        Assert.assertEquals(3, advStatistics.getAverageCommentsPerPost(), 0.001);
    }

    private List<String> forumUserList(int count) {
        List<String> resultList = new ArrayList<>();
        for (int n = 1; n <= count; n++) {
            resultList.add("Name" + n);
        }
        return resultList;
    }
}
