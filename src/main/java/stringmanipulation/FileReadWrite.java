package stringmanipulation;


import java.io.*;

public class FileReadWrite {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("Welcome");
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        FileWriter fileWriter = new FileWriter("FileWrites");
        PrintWriter printWriter = new PrintWriter(fileWriter);
        String strRead;
        while ((strRead = bufferedReader.readLine()) != null) {
            if (!strRead.isEmpty()) {
                printWriter.println(strRead);
            }

        }
        System.out.println("Reading the file is succesfully");
        System.out.println("File copied successfully");
        fileInputStream.close();
        printWriter.close();
    }
}




//        FileOutputStream fileOutputStream = new FileOutputStream("Hello");
//        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
//        BufferedOutputStream bufferedOutputStream  = new BufferedOutputStream(dataOutputStream);