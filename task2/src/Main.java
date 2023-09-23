
public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        GradesCalculator calculator = new GradesCalculator(student);
        GradesReporter gradesReporter = new GradesReporter(calculator);

        student.inputGrades();
        gradesReporter.displayTotalMarks();
        gradesReporter.displayAveragePercentage();
        gradesReporter.displayFinalResults();

    }
}