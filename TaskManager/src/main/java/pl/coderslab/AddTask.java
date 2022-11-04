package pl.coderslab;

import java.util.Arrays;
import java.util.Scanner;

public class AddTask {
    public static String [][] addTask(String [][] task){
        Scanner  scanner = new Scanner(System.in);
        System.out.println("Please add task description");
        task = Arrays.copyOf(task, task.length+1);
        task [task.length-1] = new String [3];
        task[task.length-1][0] = scanner.nextLine();
        System.out.println("Please add task due data");
        task[task.length-1][1] = " " + scanner.nextLine();
        System.out.println("Is your task is important: true/false");
        task[task.length-1][2] = " " + scanner.nextLine();
        System.out.println("Task has been added");
        System.out.println();
        return task;
    }
}
