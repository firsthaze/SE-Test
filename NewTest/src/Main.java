import java.util.Scanner;

public class Main {
    public static void main(String[] argv) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your grade: ");
            int score = Integer.parseInt(scanner.next());
            System.out.printf("Your grade is %s ! \n", letterGrade(score));
        }
    }
    public static char letterGrade(int score) {
        char grade;
        if (score <0 || score > 100)    grade = 'X';
        else if (score>=90 && score <=100)    grade = 'A';
        else if (score>=80 && score <90)    grade = 'B';
        else if (score>=70 && score <80)    grade = 'C';
        else if (score>=60 && score <70)    grade = 'D';   else    grade ='F';
        return grade;
    }
}
