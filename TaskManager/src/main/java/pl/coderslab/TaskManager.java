package pl.coderslab;

import java.util.Scanner;

import static pl.coderslab.AddTask.addTask;
import static pl.coderslab.ExitProgram.exitProgram;
import static pl.coderslab.ListTask.listTask;
import static pl.coderslab.LoadTask.loadTask;
import static pl.coderslab.RemoveTask.removeTask;
import static pl.coderslab.ShowOption.showOptions;

public class TaskManager {
    public static void main(String[] args) {
        String[][] task = loadTask("tasks.csv");
        showOptions();
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()){
        String input = scan.nextLine();
        switch (input) {
            case "add":
                task = addTask(task);
                break;
            case "remove":
                task = removeTask(task);
                System.out.println(ConsoleColors.RED + "Task has been removed");
                break;
            case "list":
                listTask(task);
                break;
            case "exit":
                exitProgram(task, "tasks.csv");
                System.out.println(ConsoleColors.RED + "Bye, bye.");
                System.exit(0);
                break;
            default:
        }
        showOptions();
        }
    }
    }




