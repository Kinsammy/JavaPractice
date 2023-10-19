package schoolStudentData;

public class App {
    public static void main(String[] args) {
        var student = new StudentAssessment();
        student.firstScreen();

        for (int stud= 1; stud <=student.getNumberOfStudent(); stud++){
            for (int sub = 1; sub <= student.getNumberOfSubject(); sub++) {
                student.secondScreen(stud, sub);
            }
        }
        student.displayBoard();
    }
}
