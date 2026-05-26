package LinkedHashSetProgramms;

import java.util.LinkedHashSet;
import java.util.Set;

public class OnlineCourse {

    public static void main(String[] args) {

        Set<String> course = new LinkedHashSet<>();
        course.add("Java Course");
        course.add("Testing Course");
        course.add("Testing Course");
        course.add("AI Course");
        course.add("AI Course");
        System.out.println(course);
    }
}
