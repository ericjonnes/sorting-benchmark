//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.time.Duration;
import java.util.Scanner;
import java.time.LocalTime;

public class SortingAlgorithms {
    public static int[] selectionSort(int[] array){

        int minIndex;
        for(int i = 0; i < array.length; i++){
            minIndex = i;
            for(int j = i + 1; j<array.length; j++){
                if(array[j] < array[minIndex]){
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
        return array;
    }

    public static int[] bubbleSort(int[] array){
        for(int i = 0; i<array.length-1; i++){
            for(int j = 0; j<array.length-2; j++){
                int temp =array[j];
                if(temp > array[j+1]){
                    array[j] = array[j + 1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }

    public SortingAlgorithms() {
        super();
    }

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);

        //PROGRAM CODE FOR 1
        System.out.print("Enter size of Arrays to Bubble Sort: ");
        int numOfArrays_B = myScan.nextInt();

        int[] array1 = new int[numOfArrays_B];

        for(int i = 0; i < array1.length; i++){
            array1[i] = (int) (Math.random() * 50);
        }

        System.out.println("\nInitial Array:");
        for(int i = 0; i<array1.length; i++){
            System.out.print(array1[i] + ",  ");
        }
        //bubble sort
        for (int i = 0; i < array1.length-1; i++){
            for(int j = 0; j < array1.length-1-i; j++){
                int temp = array1[j];
                if(temp > array1[j+1]){
                    array1[j] =array1[j+1];
                    array1[j+1] = temp;
                }


            }
        }
        //new list
        System.out.println("\nBubble Sorted Array: ");
        for(int i = 0; i < array1.length; i++){
            System.out.print(array1[i] + ",  ");
        }



        //PROGRAM CODE FOR 2
        System.out.println("\n\n[SELCTION SORT]:");
        System.out.println("Enter size of Array to Selection Sort: " );
        int numOfArrays_S = myScan.nextInt();

        int[] array2 = new int[numOfArrays_S];
        for(int i = 0; i <array2.length; i++){
            array2[i] = (int)(Math.random() * 50);
        }

        System.out.println("\n Initial Array:");
        for(int i = 0; i < array2.length; i++){
            System.out.print(array2[i] + ", ");
        }


        int minIndex;
        for(int i = 0; i < array2.length; i++){
            minIndex = i;
            for(int j =  i + 1; j < array2.length; j++){
                if(array2[j] < array2[minIndex]){
                    minIndex = j;
                }
            }
            int temp = array2[i];
            array2[i] = array2[minIndex];
            array2[minIndex] = temp;
        }

        System.out.println("\n Selection Sorted Array: ");
        for(int i = 0; i < array2.length; i++){
            System.out.print(array2[i] + ", ");
        }

        //RUNNING TIME
        System.out.println("\n\n[RUNNING TIME]");
        //PROGRAM CODE FOR 3(BUBBLE SORT)
        Duration runningTime = Duration.ZERO;
        //Bubble Sort – ArraySize[500]
        System.out.println("Bubble Sort Array Size of 500: ");
        for(int i = 0; i < 1000; i++){
            int arrayB500[] = new int[500];
            //500 Bubble Sort
            for(int j = 0; j < arrayB500.length; j ++){
                arrayB500[j] = (int)(Math.random() * 500);
            }
            LocalTime currentTime = LocalTime.now();
            bubbleSort(arrayB500);
            LocalTime endTime = LocalTime.now();

            Duration totalTIme = Duration.between(currentTime,endTime);
            runningTime = runningTime.plus(totalTIme);

        }
        Duration avgBubble500 = runningTime.dividedBy(1000);
        System.out.println("–– Average Time to Bubble Sort Array Size of 500: " +
                "\n-- " + avgBubble500.toString() );
        runningTime = Duration.ZERO;


        //Bubble Sort – ArraySize[2500]
        System.out.println("Bubble Sort Array Size of 1000");
        for(int i = 0; i < 1000; i++){
            int[] arrayB2500 = new int[2500];
            for(int j = 0; j < arrayB2500.length; j++){
                arrayB2500[j] = (int)(Math.random() * 2500);
            }

            LocalTime currentTime = LocalTime.now();
            bubbleSort(arrayB2500);
            LocalTime endTime = LocalTime.now();

            Duration totalTime = Duration.between(currentTime, endTime);
            runningTime = runningTime.plus(totalTime);
        }
        Duration avgBubble2500 = runningTime.dividedBy(1000);
        System.out.println("--Average Time to Bubble Sort Array Size 2500: " +
                "\n-- " + avgBubble2500.toString());
        runningTime = Duration.ZERO;


        //Bubble Sort – ArraySize[5000]
        System.out.println("Bubble Sort Array Size of 5000:");
        for(int i = 0; i < 1000; i++) {
            int[] arrayB5000 = new int[5000];
            for (int j = 0; j < arrayB5000.length; j++) {
                arrayB5000[j] = (int) (Math.random() * 5000);
            }

            LocalTime currentTime = LocalTime.now();
            bubbleSort(arrayB5000);
            LocalTime endTime = LocalTime.now();

            Duration totalTime = Duration.between(currentTime, endTime);
            runningTime = runningTime.plus(totalTime);
            totalTime = Duration.ZERO;

        }
        Duration avgBubble5000 = runningTime.dividedBy(1000);
        System.out.println("-- Average Time to Bubble Sort Array Size of 5000: " +
                "\n-- " + avgBubble5000.toString());
        runningTime = Duration.ZERO;



        //
        //PROGRAM CODE FOR 4 (SELECTION SORT)
        //Selection Sort – ArraySize[500]
        System.out.println("Selection Sort Array Size of 500:");
        for(int i =0; i < 1000; i++){
            int[] arrayS500 = new int[500];
            for(int j = 0; j < arrayS500.length; j++){
                arrayS500[j] = (int)(Math.random() * 500);
            }
            LocalTime currentTime = LocalTime.now();
            selectionSort(arrayS500);
            LocalTime endTime = LocalTime.now();
            Duration totaleTime = Duration.between(currentTime,endTime);
            runningTime = runningTime.plus(totaleTime);
            totaleTime = Duration.ZERO;
        }
        Duration avgSelction500 = runningTime.dividedBy(1000);
        System.out.println("-- Average Time to Selection Sort Array Size of 500: " +
                "\n-- " + avgSelction500.toString());
        runningTime = Duration.ZERO;

        //Selection Sort – ArraySize[2500]
        System.out.println("Selection Sort Array Size of 2500: ");
        for(int i = 0; i < 1000; i++){
            int[] arrayS2500 = new int[2500];
            for(int j = 0; j < arrayS2500.length; j++){
                arrayS2500[j] = (int)(Math.random() * 2500);
            }

            LocalTime currentTime = LocalTime.now();
            selectionSort(arrayS2500);
            LocalTime endTime = LocalTime.now();
            Duration totalTime = Duration.between(currentTime,endTime);
            runningTime = runningTime.plus(totalTime);
            totalTime = Duration.ZERO;
        }
        Duration avgSelection2500 = runningTime.dividedBy(1000);
        System.out.println("-- Average Time to Selection Sort Array Size 2500: " +
                "\n-- " + avgSelection2500);
        runningTime = Duration.ZERO;

        //Selection Sort – ArraySize[5000]
        for(int i = 0; i < 1000; i++){
            int[] arrayS5000 = new int[5000];
            for(int j = 0; j < arrayS5000.length; j++){
                arrayS5000[j] = (int)(Math.random() * 5000);
            }

            LocalTime currentTime = LocalTime.now();
            selectionSort(arrayS5000);
            LocalTime endTime = LocalTime.now();

            Duration totalTime = Duration.between(currentTime,endTime);
            runningTime = runningTime.plus(totalTime);
            totalTime = Duration.ZERO;

        }
        Duration avgSelection5000 = runningTime.dividedBy(1000);
        System.out.println("-- Average Time to Selection Sort Array Size 5000: " +
                "\n-- " + avgSelection5000.toString());
    }
}