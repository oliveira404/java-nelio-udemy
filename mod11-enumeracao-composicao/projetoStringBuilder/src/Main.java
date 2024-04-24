import entities.Comment;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sff = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow! That's awesome!");

        Post p1 = new Post(sff.parse("21/06/2018 13:05:44"),
                "Treveling to New Zealand",
                "I'm going to visit this wonderful country!",
                12);


        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println(p1);

    }
}