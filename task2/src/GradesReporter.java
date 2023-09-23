import java.text.NumberFormat;
public class GradesReporter {
    public static final int PERCENTAGE = 100;

    private GradesCalculator calculator;

    public GradesReporter(GradesCalculator calculator) {
        this.calculator = calculator;
    }

    public void displayTotalMarks() {
        System.out.println("Total marks: " + calculator.totalMarks());
    }

    public void displayAveragePercentage() {
        System.out.println("Average percentage: " + NumberFormat
                .getPercentInstance()
                .format(calculator.averagePercentage() / PERCENTAGE));
    }

    public void displayFinalResults() {
        if (calculator.averagePercentage() < 65) {
            System.out.println("Final Grade: F");
        } else if (calculator.averagePercentage() <= 69) {
            System.out.println("Final Grade: D");
        } else if (calculator.averagePercentage() <= 79) {
            System.out.println("Final Grade: C");
        } else if (calculator.averagePercentage() <= 89) {
            System.out.println("Final Grade: B");
        } else if (calculator.averagePercentage() <= 100) {
            System.out.println("Final Grade: A");
        }
    }

}
