
import java.util.Random;
import java.util.Scanner;

public class Main{

    public static Scanner sc = new Scanner(System.in);
    public static int[] ar;


    // Creates the array and fills it with random integers from 0 to 100
    public static void initializeProgram(){
        System.out.print("Please enter the array size: ");
        int arraySize = sc.nextInt();
        a = new int[arraySize];

        Random random = new Random();
        for(int i = 0; i< list.length; i++){
            list[i] = random.nextInt( 101);
        }
    }

    //prints out the menu
    public static void printMenu(){
        System.out.println();
        System.out.println("1- Find the maximum");
        System.out.println("2- Find the minimum");
        System.out.println("3- Display how much each elementof the array differs from the avarage ");
        System.out.println("4- Find the sum of the elements with odd and even numbered indexes");
        System.out.println("5- Exit");
        
    }
    
    // Handles teh user input 
    public static void run(){

        int choice;
        do {
            printMenu();
            System.out.print("Enter which operation you would like to do:");
            choice = sc.nextInt();
        

            switch(choice){
                case 1:
                    findMax();
                    break;
                case 2:
                    findMin();
                    break;
                case 3:
                    differenceFromAvarage();
                    break;
                case 4:
                    sumOfOddandEvenElements();
                    break;
            

            }

            
        } while (choice != 5);
        
    }

    //Finds teh maximum value throughout the array
    public static void findMax(){

    }

    //Finds the minimum value throughout the array
    public static void findMin(){

    }

    //Finds the avarage of teh array and displays how much each element differs from the avarage
    public static void differenceFromAvarage(){

    }

    //Calcuates the sum of od and even indexed elements
    public static void sumOfOddandEvenElements(){

    }

    public static void main(String[] args) {
        
        initializeProgram();
        run();
        

    }

}
