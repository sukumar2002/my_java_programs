import java.util.Scanner;

public class StudentGradeSystemUsingLambda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        int subjects = 5;
        System.out.println("Enter marks for " + subjects + " subjects:");
        for (int i = 1; i <= subjects; i++) {
            System.out.print("Subject " + i + ": ");
            int marks = scanner.nextInt();
            total += marks;
        }
        
        double average = total / (double) subjects;

        // Lambda to calculate grade based on average
        StudentMarks s = avg -> {
            if (avg > 90) return "A";
            else if (avg > 70) return "B";
            else if (avg > 50) return "C";
            else if (avg > 35) return "D";
            else return "Fail";
        };

        System.out.println("Average Marks: " + average);
        System.out.println("Final Grade: " + s.calculateGrade(average));
        scanner.close();
    }
}

@FunctionalInterface
interface StudentMarks {
    String calculateGrade(double averageMarks);
}
