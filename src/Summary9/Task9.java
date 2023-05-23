package Summary9;

import java.io.*;

public class Task9 {
    public static void main(String[] args) throws IOException {
        String filePath = "C:/Users/hp/IdeaProjects/Tasks/src/Summary9/testFile.txt";
        String textToWrite = "Hello, World2!";

        try (FileOutputStream fileOutputStream = new FileOutputStream(filePath)){
            fileOutputStream.write(textToWrite.getBytes());
            System.out.println("Succeeded");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)){
            System.out.println(bufferedReader.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("=============================");

        File file = new File("C:/Users/hp/IdeaProjects/Tasks/src/Summary9/task2.txt");
        System.out.println("file exists: " + file.createNewFile());
        System.out.println("file deleted: " + file.delete());
        System.out.println("file exists: " + file.exists());
    }
}
