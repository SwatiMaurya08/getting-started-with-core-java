package interview;

import java.util.ArrayList;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package interview
 * @date 3/19/2021
 */
public class MainClass {
    public static void main(String[] args) {
        ArrayList<Fruits> fruitsList = new ArrayList<Fruits>();
        fruitsList.add(new Fruits("Banana"));
        fruitsList.add(new Fruits("Apple"));
        fruitsList.add(new Fruits("Banana"));
        fruitsList.add(new Fruits("Orange"));
        fruitsList.add(new Fruits("Apple"));
        System.out.println(fruitsList);
        for (Fruits fruits : fruitsList) {
            System.out.print(fruits.getName() + "  ");
        }
        System.out.println();
        fruitsList.add(4, new Fruits("Grapes"));
        for (Fruits fruits : fruitsList) {
            System.out.print(fruits.getName() + "  ");
        }
        System.out.println(fruitsList.contains(new Fruits("Banana")));
        System.out.println();
        System.out.println(fruitsList.contains(fruitsList.get(0)));
        System.out.println(fruitsList);

        Object[] temp = fruitsList.toArray();
        System.out.println(temp);
        for (Object object : temp) {

            System.out.println(object.toString());
            Fruits fruit = (Fruits) object;
            System.out.println(fruit.getName());

        }
    }

    public void Veg() {
        ArrayList<Integer> integers = new ArrayList<Integer>();
        ArrayList<Double> doubles = new ArrayList<Double>();

        ArrayList<Long> longs = new ArrayList<Long>();
        longs.add(46546L);

        ArrayList<Float> floats = new ArrayList<Float>();
        floats.add(10.45f);
        floats.add(56.45f);
        floats.add((float) 655.78);

        ArrayList<String> strings = new ArrayList<String>();
        strings.add(new String("Rose"));
        strings.add("Lotus");

        ArrayList<Exception> exceptions =  new ArrayList<Exception>();
        exceptions.add(new Exception("IOException"));
        exceptions.add(new Exception("SQLException"));
        for(Exception e : exceptions){

        }


    }
}


