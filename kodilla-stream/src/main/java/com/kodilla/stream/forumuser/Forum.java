package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theForumUser = new ArrayList<>();

    public Forum() {
        theForumUser.add(new ForumUser(34, "Auston Matthews", 'M', 1997, 9, 17, 223));
        theForumUser.add(new ForumUser(91, "John Tavares", 'M', 1990, 9, 20, 209));
        theForumUser.add(new ForumUser(87, "Sidney Crosby", 'M', 1987, 8, 7, 200));
        theForumUser.add(new ForumUser(8, "Alex Ovechkin", 'M', 1985, 9, 17, 235));
        theForumUser.add(new ForumUser(97, "Connor McDavid", 'M', 1997, 1, 13, 193));
        theForumUser.add(new ForumUser(29, "Patrick Laine", 'M', 1998, 4, 19, 206));
        theForumUser.add(new ForumUser(88, "Patrick Kane", 'M', 1988, 11, 19, 177));
        theForumUser.add(new ForumUser(911, "Steven Stamkos", 'M', 1990, 2, 7, 194));
        theForumUser.add(new ForumUser(9, "Molly Petterson", 'F', 1979, 10, 5, 5));
        theForumUser.add(new ForumUser(10, "Wendy Cole", 'F', 2000, 6, 14, 155));
        theForumUser.add(new ForumUser(11, "Mark Morano", 'M', 1999, 5, 3, 13));
        theForumUser.add(new ForumUser(12, "Holly Webb", 'F', 1996, 3, 1, 1455));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theForumUser);
    }
}
