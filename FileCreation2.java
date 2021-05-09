package LegionQA.AdvancedJava.DicePlay2;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

public class FileCreation2 {
    String fileName = "C:\\QAClasses\\src\\main\\java\\LegionQA\\AdvancedJava\\DicePlay\\DiceGameResult2.txt";

    public void file() throws IOException {
        File createFile = new File(fileName);
        createFile.createNewFile();
        System.out.println("");
        System.out.println("File  <<<  DiceGameResult2.txt  >>>  created");
    }

    public void fileLog(HashMap<String, Integer>winner,String name, int diceNumber) throws IOException {
        PrintWriter fileWriter = new PrintWriter(fileName);
        fileWriter.println("Players with score: " + winner);
        fileWriter.println("---------------------------------------------------");
        fileWriter.println("The winner is: " + name);
        fileWriter.println("His score is: " + diceNumber);
        fileWriter.println("---------------------------------------------------");
        fileWriter.close();
    }
}
