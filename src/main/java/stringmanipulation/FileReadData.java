package stringmanipulation;

import java.io.*;

public class FileReadData {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("D:\\Welcome.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            int i;
            while ((i = fileReader.read()) != -1) {
                System.out.println((char) i);
                fileReader.close();
            }
        }
    }
}
