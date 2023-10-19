package schoolStudentData;

import java.util.Scanner;

public class StudentAssessment {
    Scanner scanner = new Scanner(System.in);
    private int numberOfStudent;
    private int numberOfSubject;
    private int[][] scores;

    public int getNumberOfStudent() {
        return numberOfStudent;
    }

    public void setNumberOfStudent(int numberOfStudent) {
        this.numberOfStudent = numberOfStudent;
    }

    public int getNumberOfSubject() {
        return numberOfSubject;
    }

    public void setNumberOfSubject(int numberOfSubject) {
        this.numberOfSubject = numberOfSubject;
    }

    public void firstScreen(){
        System.out.println("How many students do you have?");
        numberOfStudent = scanner.nextInt();
        System.out.println("How many subject do subject do they offer?");
        numberOfSubject = scanner.nextInt();
        scores = new int[numberOfStudent][numberOfSubject];
        savingMode();
    }

    private void savingMode() {
        System.out.println("""
                Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>
                Saved successfully
                """);
    }

    public void secondScreen(int stud, int sub) {
        System.out.printf("Entering score for student %d%n",stud);
        System.out.printf("Enter score for subject %d%n", sub);
        int mark = scanner.nextInt();
        scores[stud-1][sub-1] = mark;
        savingMode();
    }

    public void displayBoard(){
        System.out.printf("%-17s%-10s%-10s%-10s%-10s%-10s%s%n",
                "STUDENT", "SUB1", "SUB3","SUB3","TOT", "AVG","POS");
        for (int row = 0; row < numberOfStudent; row++) {
            System.out.printf("Student%-10d", row + 1);
            for (int column = 0; column < numberOfSubject; column++) {
                System.out.printf("%-10d", scores[row][column]);
            }
            System.out.printf("%-10d%-10d%d",
                    totalScorePerStudent(row + 1), averageScorePerStudent(row + 1),
                    getPositionPerStudent(row + 1));
            System.out.println();
        }
    }

    private int getPositionPerStudent(int i) {
        return 0;
    }

    private int averageScorePerStudent(int studentNumber) {
       return totalScorePerStudent(studentNumber) / numberOfSubject;
    }

    private int totalScorePerStudent(int studentNumber) {
        int totalScore = 0;
        for (int index= 0; index < getNumberOfSubject(); index++) {
            totalScore += scores[studentNumber - 1][index];
        }
        return totalScore;
    }
}
