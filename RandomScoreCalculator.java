import java.util.Random;
import java.util.Scanner;

public class RandomScoreCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        int[] numbers = generateRandomNumbers(size);
        System.out.println("Generated numbers:");
        printArray(numbers);
        int score = calculateScore(numbers);
        System.out.println("Total score: " + score);
    }

    // Generate an array of random numbers between 0 and 99
    public static int[] generateRandomNumbers(int size) {
        int[] numbers = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            numbers[i] = rand.nextInt(100);
        }
        return numbers;
    }

    // Print the contents of an array
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Calculate the score based on the generated random numbers
    public static int calculateScore(int[] numbers) {
        int score = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 10 == 4 || numbers[i] % 10 == 9) {
                score += 1;
            } else if (numbers[i] % 7 == 0) {
                score += 2;
            }
        }
        return score;
    }
}