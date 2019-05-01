package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum theForum = new Forum();
        LocalDate now = LocalDate.now();
        LocalDate twentyYearsBehind = LocalDate.now().minusYears(20);
        Period period = Period.between(now, twentyYearsBehind);
        Map<Integer, ForumUser> theResultMapOfForumUsers = theForum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
//                .filter(forumUser -> forumUser.getBirthDate().isBefore(Period.between(LocalDate.now(), LocalDate.now().minusYears())))
//                .filter(forumUser -> forumUser.getBirthDate().isBefore(LocalDate.of(1999, 4, 27)))
                .filter(forumUser -> forumUser.getQuantityOfPosts() > 1)
                .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser));

        System.out.println("# elements: " + theResultMapOfForumUsers.size());
        theResultMapOfForumUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

        System.out.println(now.getYear() + " : " + twentyYearsBehind.getYear());
    }
}
