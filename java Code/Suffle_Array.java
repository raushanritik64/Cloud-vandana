// Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it. 

import java.util.Random;

public class Shuffle {
    public static void main(String[] args) {
        int[] orgArray = {1, 2, 3, 4, 5, 6, 7};
        int[] sdArray = orgArray.clone();
        
        sffl(sdArray);
        
        for (int num : sdArray) {
            System.out.print(num + " ");
        }
    }
    
    public static void sffl(int[] array) {
        int n = array.length;
        Random random = new Random();

        for (int i = n - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}