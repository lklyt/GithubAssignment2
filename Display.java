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

    public static int oddsum (int[] x){
    int oddsum =0;
    for (int i=0; i<x.length; i+2){
        oddsum += x[i]
    }
    System.out.println ("The sum of elements in the odd numbered indexes are: " + oddsum)
}

public static int evensum (int []){
    int evensum =0;
    for (int i=1; i<x.length; i+2){
        evensum += x[i]
    }
    System.out.println ("The sum of elements in the even numbered indexes are: " + evensum)

}
}
