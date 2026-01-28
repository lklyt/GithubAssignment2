import java.util.Random;

public class Display {
    public static void main(String[] args) {
        Random rng = new Random();

        
        int[] array = new int[arrSize];
        for (int i = 0 ; i < arrSize ; i++){
            array[i] = rng.nextInt(0,101);
        }
    }
}
