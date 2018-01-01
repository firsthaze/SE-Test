import org.junit.Test;

import static org.junit.Assert.*;

public class EPTTest {
    private Main _main = new Main();
    @Test
    public void letterGrade1() {
        char grade = _main.letterGrade(90);
        assertEquals('A', grade);
    }

    @Test
    public void letterGrade2() {
        char grade = _main.letterGrade(80);
        assertEquals('B', grade);
    }

    @Test
    public void letterGrade3() {
        char grade = _main.letterGrade(70);
        assertEquals('C', grade);
    }

    @Test
    public void letterGrade4() {
        char grade = _main.letterGrade(60);
        assertEquals('D', grade);
    }

    @Test
    public void letterGrade5() {
        char grade = _main.letterGrade(59);
        assertEquals('F', grade);
    }

    @Test
    public void letterGrade6() {
        char grade = _main.letterGrade(-50);
        assertEquals('X', grade);
    }

}