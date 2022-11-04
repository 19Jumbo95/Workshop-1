package pl.coderslab;

public class ListTask {
    public static void listTask(String [][] task){
        for (int i = 0; i < task.length; i++) {
            System.out.print(i + " : ");
            for (int i1 = 0; i1 < task[i].length; i1++) {
                System.out.print(task[i][i1] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
