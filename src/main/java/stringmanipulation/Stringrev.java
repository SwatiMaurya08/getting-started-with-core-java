package stringmanipulation;


public class Stringrev {
    public static void main(String[] args) {
        String input = "Swati Maurya";
        String revString = "";
        char[] temp = input.toCharArray();
        for (int i = input.length() - 1; i >= 0; i--) {
            revString = revString + temp[i];
        }
        System.out.println(revString);


        //        String input = "Adarsh Maurya";
//        char[] ch = input.toCharArray();
//        for(int i = 0; i < input.length(); i++){
//            System.out.print(ch[i] + "  ");
//        }


//        String input = "Hello Welcome to the Core Java";
//        String[] temp = input.split(" ");
//        for(int i = (temp.length)-1; i>=0 ; i-- ){
//            System.out.print(temp[i]+ " " );
//        }
    }

}

