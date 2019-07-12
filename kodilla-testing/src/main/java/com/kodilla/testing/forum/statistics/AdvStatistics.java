package com.kodilla.testing.forum.statistics;

public class AdvStatistics {
    private int usersCount;
    private int postCount;
    private int commentCount;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
        usersCount = statistics.usersNames().size();
        postCount = statistics.postsCount();
        commentCount = statistics.commentsCount();
        if (statistics.usersNames().size() != 0) {
            averagePostsPerUser = statistics.postsCount() / (double) statistics.usersNames().size();
        } else {
            averagePostsPerUser = 0;
        }
        if (statistics.usersNames().size() != 0) {
            averageCommentsPerUser = statistics.commentsCount() / (double) statistics.usersNames().size();
        } else {
            averageCommentsPerUser = 0;
        }
        if (statistics.postsCount() != 0) {
            averageCommentsPerPost = statistics.commentsCount() / (double)statistics.postsCount();
        } else {
            averageCommentsPerPost = 0;
        }
    }

    public int getUsersCount() {
        return usersCount;
    }

    public int getPostCount() {
        return postCount;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }
}
