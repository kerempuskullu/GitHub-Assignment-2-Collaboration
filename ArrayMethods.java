public class ArrayMethods {
    //Finds the maximum value throughout the array
    public static int findMax(int[] intArray){
        int maxx = 0;
        for(int i = 0; i < intArray.length; i++){
            maxx = Math.max(maxx, intArray[i]);
        }
        return maxx;
    }

    //Finds the minimum value throughout the array
    public static int findMin(int[] intArray){
        int minn = Integer.MAX_VALUE;
        for(int i = 0; i < intArray.length; i++){
            minn = Math.min(minn, intArray[i]);
        }
        return minn;
    }

    //Finds the avarage of teh array and displays how much each element differs from the avarage
    public static double[] differencesFromAverage(int[] intArray){
        double average = 0;
        for (int i = 0; i < intArray.length; i++) {
            average += intArray[i];
        }
        average = average/intArray.length;
        double[] outputArray = new double[intArray.length];
        for (int i = 0; i < intArray.length; i++) {
            outputArray[i] = intArray[i] - average;
        }
        return outputArray;
    }

    //Calcuates the sum of od and even indexed elements
    public static int sumOfOddIndexedElements(int[] intArray){
        int output = 0;
        for (int i = 1; i < intArray.length; i += 2) {
            output += intArray[i];
        }
        return output;
    }

    public static int sumOfEvenIndexedElements(int[] intArray){
        int output = 0;
        for (int i = 0; i < intArray.length; i+=2) {
            output += intArray[i];
        }
        return output;
    }
}
