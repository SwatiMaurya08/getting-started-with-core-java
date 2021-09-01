package DailyCodingProblems;


public class StringPermutation {
    static boolean canFormPalindrome(String str)
    {
         int NO_OF_CHARS = 256;
         int[] count = new int[NO_OF_CHARS];


        for (int i = 0; i < str.length(); i++)
            count[(int)(str.charAt(i))]++;

        // Count odd occurring characters
        int odd = 0;
        for (int i = 0; i < NO_OF_CHARS; i++) {
            if ((count[i] & 1 ) == 1)
                odd++;

            if (odd > 1)
                return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        if (canFormPalindrome("carrace"))
            System.out.println("Yes");
        else
            System.out.println("No");

        if (canFormPalindrome("daily"))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
