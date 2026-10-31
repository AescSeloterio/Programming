//—Quiz Score Calculator—

public class CommonArrayOperations {

    public static void main(String[] args) {

        int[] scores = {80, 85, 90, 88, 95};

        System.out.println("First Score: " + scores[0]);

        scores[0] = 92;
        System.out.println("Updated First Score: " + scores[0]);

        System.out.println("Number of Scores: " + scores.length);

        int sum = 0;

        for (int score : scores) {
            sum += score;
        }

        double average = (double) sum / scores.length;

        System.out.println("Average Score: " + average);

    }
}