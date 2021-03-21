package stringmanipulation;

import java.util.ArrayList;

public class StringListCount {
    public static void main(String[] args) {
        ArrayList<String> flowers = new ArrayList<String>();
        int Rose = 0;
        int Lily = 0;
        int Lotus = 0;

        flowers.add("Rose");
        flowers.add("Rose");
        flowers.add("Lotus");
        flowers.add("Lily");
        flowers.add("Lotus");
        flowers.add("Rose");
        flowers.add("Lily");
        flowers.add("Rose");

        System.out.println(flowers);
        for (String flower : flowers) {
            if (flower.equals("Rose")) {
                Rose++;
            }
            if(flower.equals("Lotus")){
                Lotus++;
            }
            if (flower.equals("Lily")){
              Lily++;
            }
        }
            System.out.println("The count of Rose is : " + Rose);
            System.out.println("The count of Lotus is : " + Lotus);
            System.out.println("The count of Lily is : " + Lily);
        }
    }
