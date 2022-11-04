package pl.coderslab;


import org.apache.commons.lang3.ArrayUtils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RemoveTask {
    public static String [][] removeTask(String [][] task){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select number to remove");
        try {
            task = ArrayUtils.remove(task, scanner.nextInt());
        } catch (InputMismatchException ex){
            System.out.println("Argument is not a number");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Element not exist in tab");
        } return task;
    }
}
