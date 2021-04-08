package stringmanipulation;


public class Stringrev {
    public static void main(String[] args) {
        String input = "Swati Maurya";
        String revString = "";
        char[] temp = input.toCharArray();
        for (int i = 0; i <= input.length() - 1; i++) {
            revString = revString + temp[i];
        }
        System.out.println(revString);
        }

    }

