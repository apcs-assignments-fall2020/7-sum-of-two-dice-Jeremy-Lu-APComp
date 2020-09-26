import java.util.Scanner;
import java.util.Random; //imports the random module

public class MyMain {

    // Rolls a single die
    // Returns a random integer between 1 and 6
    public static int rollDie() {
        Random dice_roll = new Random();
        int number;
        int output = 0;
        output = dice_roll.nextInt(6) + 1;
        return output;
    }

    // Rolls two dice n times
    // This method returns an int array of size 11, where each element is
    // the number of times a certain sum of two dice was rolled
    public static int[] sumOfTwoDice(int n) {
        int[] arr_sum = new int[11];
        for(int a  = 0; a < n; a++){
            int b = rollDie() + rollDie();
            arr_sum[b-2]++;
        }
        return(arr_sum);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input an integer: ");
        int n = scan.nextInt();
        int[] a = sumOfTwoDice(n);
        for(int b = 0; b < 11; b++){
            System.out.println("% of rolls where sum == " + (b+2) + ": " + ((double)a[b]/n)*100);
        }
        System.out.println("Your roll is: " + rollDie()); //rollDie method
    }
}
