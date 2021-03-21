package stringmanipulation;

import java.util.ArrayList;

public class StringList {
    public static void main(String[] args){
        ArrayList<Vegetables> vegetablesList = new ArrayList<Vegetables>();
         vegetablesList.add(new Vegetables("Potato"));
        vegetablesList.add(new Vegetables("Tomato"));
        vegetablesList.add(new Vegetables("Carrot"));
        vegetablesList.add(new Vegetables("Onion"));
        vegetablesList.add(new Vegetables("Tomato"));
        vegetablesList.add(new Vegetables("Spinach"));

        System.out.println(vegetablesList);

        for(Vegetables vegetables:vegetablesList){
            System.out.print(vegetables.getVeg() + "  ");
            }
        }

    }

