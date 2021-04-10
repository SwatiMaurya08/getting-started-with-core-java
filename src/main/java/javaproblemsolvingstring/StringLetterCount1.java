package javaproblemsolvingstring;

public class StringLetterCount1 {
    public static void main(String[] args) {
        String inputString = "goodmorning";
        int countLetter = 0;
        for(char letter = 'a'; letter <= 'z' ;letter++ ){
            for(int i= 0 ; i<inputString.length();i++){
                if(inputString.charAt(i) == letter){
                   countLetter++ ;
                }
            }
        }
        System.out.println(countLetter);
    }
}
