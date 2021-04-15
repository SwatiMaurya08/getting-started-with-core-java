package javacollections;

import java.util.LinkedList;

public class JavaLinkedList {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Blue");
        colors.add("Pink");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Black");
        System.out.println(colors);

        colors.getFirst();
        System.out.println(colors);


        colors.indexOf("Black");
        System.out.println(colors);


        colors.addFirst("Orange");
        System.out.println(colors);


        colors.descendingIterator();
        System.out.println(colors);


        colors.addLast("Purple");
        System.out.println(colors);


    }
}
