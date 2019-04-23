package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import com.kodilla.testing.forum.statistics.AdvStatistics;
import com.kodilla.testing.forum.statistics.Statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;

public class AdvStatisticsTestSuite {
    @Test
    public void testAdvStatisticsWithMock() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        AdvStatistics advStatistics = new AdvStatistics(statisticsMock);
        List<ForumUser> resultListOf1000Users = forumUserList(5);
//        //When
//        double result = resultListOf1000Users.size() / advStatistics.calculateAdvStatistics(statisticsMock).postsCount();
//        //Then
//        Assert.assertEquals(0, result);
    }

    private List<ForumUser> forumUserList(int count) {
        List<ForumUser> resultList = new ArrayList<>();
        for (int n = 1; n <= count; n++) {
            ForumUser forumUser = new ForumUser("Name" + n, "John Smith" + n);
            resultList.add(forumUser);
        }
        return resultList;
    }

//    private List<ForumComment> forumCommentList(int count) {
//        List<ForumComment> resultList = new ArrayList<>();
//        for (int n = 1; n <= count; n++) {
//            ForumComment forumComment = new ForumComment(0 + n,"Comment Body" + n, "John Smith" + n);
//            resultList.add(forumComment);
//        }
//        return resultList;
//    }

    private List<ForumPost> forumPostList(int count) {
        List<ForumPost> resultList = new ArrayList<>();
        for (int n = 1; n <= count; n++) {
            ForumPost forumPost = new ForumPost("Post Body" + n, "John Smith" + n);
            resultList.add(forumPost);
        }
        return resultList;
    }
}
