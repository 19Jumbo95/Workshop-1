package pl.coderslab;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LoadTask {
    public static String[][] loadTask(String pathFile) {
        Path path = Paths.get(pathFile);
        while (!Files.exists(path)) {
            System.out.println("File not exist");
        }
        List<String> tasks = null;
        try {
            tasks = Files.readAllLines(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String[][] task = new String[tasks.size()][tasks.get(0).split(",").length];
        for (int i = 0; i < tasks.size(); i++) {
            String[] split = tasks.get(i).split(",");
            for (int j = 0; j < split.length; j++) {
                task[i][j] = split[j];
            }
        }
        return task;
    }
}
