package javaproblemsolvingstring;

public class StringLetterCount {
    public static void main(String[] args) {
        String inputString = "swatimaurya";
        int[] counter = new int[256];
        for (int i = 0; i < inputString.length(); i++) {
            counter[(int) inputString.charAt(i)]++;
        }
        for(int i = 0; i < 256; i++){
           if(counter[i] != 0) {
               System.out.println((char) i +  "     " + counter[i]);
           }
        }
    }

}
