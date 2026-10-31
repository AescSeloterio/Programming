//—Attendance Example—

public class ArraysInJava {

    public static void main(String[] args) {

        int[] attendance = {35, 32, 36, 34, 33};

        System.out.println("Weekly Attendance:");

        for (int i = 0; i < attendance.length; i++) {

            System.out.println("Day " + (i + 1)
                    + ": " + attendance[i] + " students");

        }
    }
}