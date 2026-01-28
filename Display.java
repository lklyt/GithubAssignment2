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
        for (int i = 0 ; i < arrSize ; i++){
            array[i] = rng.nextInt(0,101);
        }

        while(option != 5){
        System.out.print("1- Find Minimum \n2- Find Maximum \n3- Elements Differange From Average \n4- Sum With Odd Even Index \n 5- Exit \nChoose an option: ");
        option = in.nextInt();
        if()
        }

    }
}
