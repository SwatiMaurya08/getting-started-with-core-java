package stringmanipulation;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class BasicsofMethod {
    public static void main(String[] abc) {
        //input as String array type
        // return  type void
        // int addition = Method("Swati");
        //  System.out.println("Addtion : " + addition);
        ArrayList<String> vegetableList = new ArrayList<String>();
        vegetableList.add("onion");
        vegetableList.add("potato");
        vegetableList.add("potato");
        vegetableList.add("potato");
        vegetableList.add("onion");
        vegetableList.add("chilli");
        vegetableList.add("chilli");
        vegetableList.add("Brinjal");
        vegetableList.add("chilli");
        vegetableList.add("Brinjal");
        vegetableList.add("LadyFinger");
        vegetableList.add("Brinjal");
        vegetableList.add("LadyFinger");
        vegetableList.add("LadyFinger");
        vegetableList.add("Brinjal");
        Method1(vegetableList);
    }

    public static int Method(String input) {
        //input as String type
        // return integer
        //convert string into char[] - 's','w','a','t','i'
        char[] charArray = input.toCharArray();
        //convert char[] into ASCII  - (int)'s' (int)'w'
        int add = 0;
        for (int i = 0; i < (charArray.length); i++) {
            char ch = charArray[i];
            add = add + (int) ch;
            System.out.println(ch + " = " + (int) ch);
        }
        return add;

    }

    public static void Method1(ArrayList<String> inputArrayList) {
        //input ad ArrayList<String>
        //return int
        //[onion,potato,tomato,chilli,carrot]
        //iterate the veg in array string list
        //unique list
        Set<String> uniqueNameSet = new HashSet<String>(inputArrayList);
        System.out.println(uniqueNameSet);
        //iterate the uniqueNameSet
        for (String str : uniqueNameSet) {
            //get a str from uniqueNameSet
            //declare counter
            int count = 0;
            //iterate the inputArrayList
            for (String str2 : inputArrayList) {
                //get a str2 from inputArrayList
                //compare str2 with str
                if (str2.equalsIgnoreCase(str)) {
                    //if they are equals inc the counter
                    count++;
                }
            }
            //print counter
            System.out.println(str + "  " + count);
        }
    }
}
