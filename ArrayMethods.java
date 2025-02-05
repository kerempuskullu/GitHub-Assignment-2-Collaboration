public class ArrayMethods {
    //Finds teh maximum value throughout the array
    public static void findMax(){

    }

    //Finds the minimum value throughout the array
    public static void findMin(){

    }

    //Finds the avarage of teh array and displays how much each element differs from the avarage
    public static double[] differencesFromAvarage(int[] intArray){
        double average = 0;
        for (int i=0; i<intArray.length; i++) {
            average += intArray[i];
        }
        average = average/intArray.length;
        double[] outputArray = new double[intArray.length];
        for (int i=0; i<intArray.length; i++) {
            outputArray[i] = intArray[i] - average;
        }
        return outputArray;
    }

    //Calcuates the sum of od and even indexed elements
    public static int sumOfOddIndexedElements(int[] intArray){
        int output = 0;
        for (int i=1; i<intArray.length; i+=2) {
            output += intArray[i];
        }
        return output;
    }

    public static int sumOfEvenIndexedElements(int[] intArray){
        int output = 0;
        for (int i=0; i<intArray.length; i+=2) {
            output += intArray[i];
        }
        return output;
    }
}
