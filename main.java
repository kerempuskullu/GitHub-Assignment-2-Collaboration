import java.util.Random;
import java.util.Scanner;

public class Main{

    public static Scanner sc = new Scanner(System.in);
    public static int[] array;


    // Creates the array and fills it with random integers from 0 to 100
    public static void initializeProgram(){
        System.out.print("Enter the array size: ");
        int arraySize = sc.nextInt();
        array = new int[arraySize];

        Random random = new Random();
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(101);
        }
    }

    //prints out the menu
    public static void printMenu(){
        System.out.println("Choose an option: ");
        System.out.println("1- Find the maximum element in the array");
        System.out.println("2- Find the minimum element in the array");
        System.out.println("3- Display how much the elements of the array differs from the average");
        System.out.println("4- Find the sum of the elements with odd and even numbered indexes separately");
        System.out.println("5- Exit");        
    }
    
    // Handles the user input 
    public static void run(){

        int choice;
        do {
            printMenu();
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    findMax();
                    break;
                case 2:
                    findMin();
                    break;
                case 3:
                    differenceFromAverage();
                    break;
                case 4:
                    sumOfOddandEvenElements();
                    break;
            }
        } while (choice != 5);
        
    }

    public static void main(String[] args) {
        
        initializeProgram();
        run();
        
    }

}
