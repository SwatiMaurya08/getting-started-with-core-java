package javacollections;

import java.util.ArrayList;

public class JavaArrayList {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Apple");//Adding object in arraylist
        fruits.add("Mango");
        fruits.add("Grapes");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Grapes");
        fruits.add("Banana");
        fruits.add("Watermelon");
        //Printing the arraylist object
        System.out.println(fruits);

        for(String fruit : fruits){  //Traversing list through for-each loop
            System.out.println(fruit);
        }
    }
}
