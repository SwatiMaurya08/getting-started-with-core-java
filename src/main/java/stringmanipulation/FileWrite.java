package stringmanipulation;

import java.io.*;

public class FileWrite {
    public static void main(String[] args) throws IOException {
        String fileContent = "Hello Learner !! Welcome to Core Java";
        File file = new File("File");
        PrintWriter printWriter = new PrintWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(printWriter);
        bufferedWriter.write(fileContent);
        System.out.println("File writes done successfully");
        bufferedWriter.close();
    }
}
