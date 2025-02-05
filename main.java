import java.util.Random;
import java.util.Scanner;

public class main{

    public static Scanner sc = new Scanner(System.in);
    public static int[] array;


    // Creates the array and fills it with random integers from 0 to 100
    public static void initializeProgram(){
        System.out.print("Enter the array size: ");
        int arraySize = sc.nextInt();
        array = new int[arraySize];

        System.out.print("Your randomly generated array is: ");
        Random random = new Random();
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(101);
            System.out.print(array[i] + ", ");
        }
        System.out.println();
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
                System.out.print("Maximum element of the array is: ");
                    System.out.println(ArrayMethods.findMax(array));
                    break;
                case 2:
                    System.out.print("Minumum element of the array is: ");
                    System.out.println(ArrayMethods.findMin(array));
                    break;
                case 3:
                    System.out.print("The differences from averages are: ");
                    double[] diffsFromAverage = ArrayMethods.differencesFromAverage(array);
                    for (int i = 0; i < diffsFromAverage.length; i++) {
                        System.out.print(diffsFromAverage[i] + " ");
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Sum of odd indexed elements are : " + ArrayMethods.sumOfOddIndexedElements(array));
                    System.out.println("Sum of even indexed elements are : " + ArrayMethods.sumOfEvenIndexedElements(array));
                    break;
            }
        } while (choice != 5);
        
    }

    public static void main(String[] args) {
        
        initializeProgram();
        run();
        
    }

}
