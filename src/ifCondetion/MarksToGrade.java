package ifCondetion;
import java.util.Scanner;

public class MarksToGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a mark from 1 to 100: ");
        double mark = scanner.nextDouble();

        String grade;
        if (mark >= 80 && mark <=100) {
            grade = "A";
        } else if (mark >= 60 && mark < 80) {
            grade = "B";
        } else if (mark >= 40 && mark < 60) {
            grade = "C";
        } else {
            grade = "F";
        }
        System.out.println("Grade: " + grade);
    }
}
