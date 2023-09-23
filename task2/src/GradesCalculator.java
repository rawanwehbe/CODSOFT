public class GradesCalculator {
    private Student student;

    public GradesCalculator(Student student) {
        this.student = student;
    }

    public double totalMarks() {
        return student.getGrades().stream().mapToDouble(f -> f).sum();
    }

    public double averagePercentage() {
        return totalMarks() / Student.NB_OF_SUBJECTS;
    }

}
