package Practise15;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Tasks15 {
    public static void main(String[] args) {

    }
    public static void inputString(String text){
        if (text.length() > 10) throw new InvalidDataException("text is longer than 10 symbols!");
        else {
            System.out.println("your text is: " + text);
        }

    }
    public static void process(List<SomeObject> someObjects) throws ProcessFailedException {
        List <SomeObject> problems = new ArrayList<>();
        boolean isProblem = false;
        for (SomeObject obj : someObjects) {
            try {
                System.out.println(obj);
            } catch (Exception e) {
                problems.add(obj);
                isProblem = true;
            }
        }
        if (isProblem){
            System.out.println("There were problems with following objects: ");
            problems.forEach(System.out::println);
            throw new ProcessFailedException("something wrong!");
        }

    }
//    Задача 3: Уровень сложности 7/10
//    Напишите код для чтения данных из файла и записи в другой файл.
//    Ваш код должен корректно обрабатывать следующие ситуации:
//    Исходный файл не существует.
//    Невозможно открыть файл для чтения (например, из-за отсутствия прав доступа).
//    Невозможно открыть файл для записи.
//    Происходит ошибка во время чтения или записи.
//    В каждом из этих случаев ваш код должен выбрасывать пользовательское исключение,
//    которое содержит информацию о том, что пошло не так, а также подробную информацию
//    о первоначальном исключении (если оно есть).
    //https://github.com/Shonmikl/Eklers/blob/master/src/_2023_05_22/EXCEPTIONTASKS.txt

    public static void readAndWrite (String pathRead, String pathWrite) throws FileNotFoundException, ReadFileException, WhileReadingFileException, WritingFileException {
        List <String> infoInput = readFromFile(pathRead);
        writeIntoFile(infoInput, pathWrite);
    }

    private static void writeIntoFile(List<String> infoInput, String pathWrite) throws FileNotFoundException, WritingFileException {
        if (infoInput.isEmpty()){
            throw new InvalidDataException("file is empty");
        }
        if (pathWrite == null){
            throw new FileNotFoundException("File not found");
        }
        try (FileOutputStream fileOutputStream = new FileOutputStream(pathWrite)){
            for (String string:infoInput) {
                fileOutputStream.write(string.getBytes());
            }
        } catch (IOException writingFileException) {
            throw new WritingFileException("Problem while file writing");
        }
    }

    private static List<String> readFromFile(String pathRead) throws ReadFileException, FileNotFoundException, WhileReadingFileException {
        List <String> infoFromFile = new ArrayList<>();
        if (pathRead == null){
            throw new FileNotFoundException("File not found");
        }
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(pathRead))){
            String line;
            while ((line = bufferedReader.readLine()) != null){
                infoFromFile.add(line);
            }
            if (infoFromFile.isEmpty()){
                throw new WhileReadingFileException("Problem while file reading");
            }
        }
        catch (IOException ioException){
            throw new ReadFileException("Can't read file");
        }
        return infoFromFile;
    }
}
