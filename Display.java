import java.util.Random;
import java.util.Scanner;

public class Display {


    public static  int[] averageDiff(int[] nums){

        int sum = 0;
        int count = 0;

        for (int i= 0; i< nums.length; i++) {
            sum+= nums[i];
            count++;
        }

        int average = sum/count;

        for (int i= 0; i< nums.length; i++) {
            nums[i] = nums[i] - average;
        }

        return nums;
    }


    public static void main(String[] args) {
        Random rng = new Random();

        Scanner scn = new Scanner(System.in);
        int option = 0;
        int arrSize;
        System.out.print("Enter an array size: ");
        arrSize = scn.nextInt();
        int[] array = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            array[i] = rng.nextInt(0, 101);
        }

        while (option != 6) {
            System.out.print(
                    "1- Find Minimum \n2- Find Maximum \n3- Elements Differance From Average \n4- Sum With Odd Index \n5-Sum With Even Index \n6- Exit \nChoose an option: ");
            option = scn.nextInt();
            if (option == 1) {
                int min = min(array);
                System.out.println("Minimum number: " + min);
            } else if (option == 2) {
                int max = max(array);
                System.out.println("Maximum number: " + max);
            } else if (option == 3) {
                int[] dif = averageDiff(array);
                System.out.print("{");
                for (int i = 0; i < arrSize; i++) {
                    System.out.print(dif[i]);
                    if (i != arrSize - 1) {
                        System.out.print( ", ");
                    }
                }
                System.out.println("}");
            } else if (option == 4) {
                int oddSum = oddSum(array);
                System.out.println("Sum of odd indexes: " + oddSum);
            } else if (option == 5) {
                int evenSum = evenSum(array);
                System.out.println("Sum of even indexes: " + evenSum);
            } else if (option == 6) {
                System.out.println("Program ended.");
            }
        }

    }

    public static int max(int[] nums) {
        int max = -100000;
        for (int i : nums) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static int min(int[] nums) {
        int min = 100000;
        for (int i : nums) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    public static int oddSum(int[] x) {
        int oddsum = 0;
        for (int i = 0; i < x.length; i = i + 2) {
            oddsum += x[i];
        }
        return oddsum;
    }

    public static int evenSum(int[] x) {
        int evensum = 0;
        for (int i = 1; i < x.length; i = i + 2) {
            evensum += x[i];
        }
        return evensum;

    }
}
