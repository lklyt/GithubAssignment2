import java.util.Random;
import java.util.Scanner;

public class Display {

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
                    "1- Find Minimum \n2- Find Maximum \n3- Elements Differange From Average \n4- Sum With Odd Index \n5-Sum With Even Index \n6- Exit \nChoose an option: ");
            option = scn.nextInt();
            if (option == 1) {
                int min = min(array);
                System.out.println("Minimum number: " + min);
            } else if (option == 2) {
                int max = max(array);
                System.out.println("Maximum number: " + max);
            } else if (option == 3) {
                int[] dif = averageDif(array);
                System.out.print("{");
                for (int i = 0; i < arrSize; i++) {
                    if (i != arrSize - 1) {
                        System.out.print(dif[i] + ", ");
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
}
