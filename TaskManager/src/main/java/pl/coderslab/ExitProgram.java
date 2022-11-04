package pl.coderslab;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;


public class ExitProgram {
    public static void exitProgram(String[][] task, String fileName){
        Path path = Paths.get(fileName);
        String[] newArray = new String[task.length];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = String.join(",", task[i]);
        }
        try {
            Files.write(path, Arrays.asList(newArray));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
