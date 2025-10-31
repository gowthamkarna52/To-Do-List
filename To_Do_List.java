import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.Scanner;

public class To_Do_List{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        try{
        ArrayList<String> tasks= new ArrayList<>();
        int choice;

        do{
            System.out.println("===To-Do List Menu===");
            System.out.println("1.View Tasks");
            System.out.println("2.Add Task");
            System.out.println("3.Delete Task");
            System.out.println("4.Exit");
            System.out.println("Choose an Option (1-4): ");
            choice =sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    if(tasks.isEmpty()) System.out.println("No Tasks yet.");
                    else{ 
                        for(int i=0;i<tasks.size();i++) 
                        System.out.println((i+1)+"."+tasks.get(i));
                    }
                    break;
                case 2:
                    System.out.println("Enter Task: ");
                    String task=sc.nextLine();
                    tasks.add(task);
                    System.out.println("Task added.");
                    break;
                case 3:
                    if(tasks.isEmpty()) System.out.println("No Tasks to delete.");
                    else{ 
                        for(int i=0;i<tasks.size();i++) 
                        System.out.println((i+1)+"."+tasks.get(i));
                        System.out.println("Enter task number to delete: ");
                        int index=sc.nextInt();
                        sc.nextLine();
                        if(index>0 && index<=tasks.size()){ 
                            String removed=tasks.remove(index-1);
                            System.out.println("Deleted: "+ removed);
                        }
                        else{
                            System.out.println("Invalid task number.");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option.");                  
            }
        }  
        while(choice!=4);
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input. Please enter a number.");
        }
        catch(Exception e){
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
        finally{
            System.out.println("===================PROGRAM ENDED===================");
            sc.close();
        }  
    }
}
