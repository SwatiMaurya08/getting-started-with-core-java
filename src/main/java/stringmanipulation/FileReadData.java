package stringmanipulation;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class FileReadData {
    public static void main(String[] args) throws IOException {
        countWords();
        countOccurrencesOfEachWord();

    }

    private static void countWords() throws IOException {
        FileInputStream fstream = new FileInputStream("Welcome");
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
        String strLine;
        //Read File Line By Line
        int wordsCount = 0;
        while ((strLine = br.readLine()) != null) {
            if (!strLine.isEmpty()) {
                //split the line with space or dash
                String[] words = strLine.split(" ");
                wordsCount = wordsCount + words.length;
                // Print the content on the console
                System.out.println(strLine);
                System.out.println("---------------------------------------------");
            }
        }
        System.out.println("The total words count separated by space are : " + wordsCount);
        //Close the input stream
        fstream.close();
    }

    private static void countOccurrencesOfEachWord() throws IOException {
        //read the line from the file
        FileInputStream fileInputStream = new FileInputStream("Welcome");
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        Set<String> setOfWords = new HashSet<String>();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            if (!line.isEmpty()) {
                //split the lines
                line = line.replaceAll("\\p{Punct}", "");
                String[] strOccurence = line.split(" ");
                for (String str : strOccurence) {
                    setOfWords.add(str);
                }
            }
        }
        fileInputStream.close();
        //then iterate the unique words with all lines
        for (String uniqueWord : setOfWords) {
            fileInputStream = new FileInputStream("Welcome");
            inputStreamReader = new InputStreamReader(fileInputStream);
            bufferedReader = new BufferedReader(inputStreamReader);
            String lines;
            int count = 0;
            while ((lines = bufferedReader.readLine()) != null) {
                if (!lines.isEmpty()) {
                    //split the lines
                    lines = lines.replaceAll("\\p{Punct}", "");
                    String[] strOccurence = lines.split(" ");
                    for (String str : strOccurence) {
                        //compare the unique words with other words in line
                        if (uniqueWord.equals(str)) {
                            //if they are equals increment the count of that specific word
                            count++;
                        }
                    }
                }
            }
            //print the count
            System.out.println(uniqueWord + " " + count);
            fileInputStream.close();
        }
    }
}





