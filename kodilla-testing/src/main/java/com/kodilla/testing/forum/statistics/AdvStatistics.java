package com.kodilla.testing.forum.statistics;

import java.util.List;

public class AdvStatistics {
    Statistics statistics;
//    private int countUsers;
//    private int countPosts;
//    private int countComments;
//    private double averagePostsPerUser;
//    private double averageCommentsPerUser;
//    private double averageCommentsPerPost;

    public AdvStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public Statistics calculateAdvStatistics(Statistics statistics) {
        int countUsers = statistics.usersNames().size();
        int countPosts = statistics.postsCount();
        int countComments = statistics.commentsCount();
        double averagePostsPerUser = countPosts / countUsers;
        double averageCommentsPerUser = countComments / countUsers;
        double averageCommentsPerPost = countComments / countPosts;
        return null;
    }

//    public void showStatistics() {
//        System.out.println("Srednia PU ");
//    }
//
//    public Statistics getStatistics() {
//        return statistics;
//    }
//
//    public double getAveragePostsPerUser() {
//        return averagePostsPerUser;
//    }
//
//    public double getAverageCommentsPerUser() {
//        return averageCommentsPerUser;
//    }
//
//    public double getAverageCommentsPerPost() {
//        return averageCommentsPerPost;
//    }
}
