package Chapter5;

import java.util.Scanner;

public class ClaassAverage {
    public static void main(String[] args) {
        Scanner spencer = new Scanner(System.in);
        System.out.println("Enter the number of students in the class");
        int studentNumber = spencer.nextInt();

        int[] scores = new int[studentNumber];

        System.out.println("Enter the scores of the Students");
        for (int i = 0; i < studentNumber; i++) {
            scores[i] = spencer.nextInt();
        }
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        double average = (double) sum / studentNumber;
        int highest = scores[0];
        int lowest = scores[0];
        for (int score : scores) {
            if (score > highest) {
                highest = score;
            }
            if (score < lowest) {
                lowest = score;
            }
        }
        System.out.println("Average score: " + average);
        System.out.println("Highest score: " + average);
        System.out.println("Lowest score: " + lowest);


    }

}
