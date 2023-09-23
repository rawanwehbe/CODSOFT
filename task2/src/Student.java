import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    public static final int NB_OF_SUBJECTS = 5;
    private Scanner scan;
    private ArrayList<Double> grades;

    public Student() {
        scan = new Scanner(System.in);
        grades = new ArrayList<>();
    }

    public void inputGrades() {
        for (int i = 0; i < NB_OF_SUBJECTS; i++) {
            System.out.print("enter grade of subject(out of 100) " + (i + 1) + ": ");
            grades.add(scan.nextDouble());
        }
    }

    public ArrayList<Double> getGrades() {
        return grades;
    }

}
