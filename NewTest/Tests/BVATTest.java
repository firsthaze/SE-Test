import org.junit.Test;

import static org.junit.Assert.*;

public class BVATTest {
    private Main _main = new Main();

    @Test
    public void letterGrade1() {
        char grade = _main.letterGrade(101);
        assertEquals('X', grade);
    }

    @Test
    public void letterGrade2() {
        char grade = _main.letterGrade(100);
        assertEquals('A', grade);
    }

    @Test
    public void letterGrade3() {
        char grade = _main.letterGrade(99);
        assertEquals('A', grade);
    }

    @Test
    public void letterGrade4() {
        char grade = _main.letterGrade(91);
        assertEquals('A', grade);
    }

    @Test
    public void letterGrade5() {
        char grade = _main.letterGrade(90);
        assertEquals('A', grade);
    }

    @Test
    public void letterGrade6() {
        char grade = _main.letterGrade(89);
        assertEquals('B', grade);
    }

    @Test
    public void letterGrade7() {
        char grade = _main.letterGrade(81);
        assertEquals('B', grade);
    }

    @Test
    public void letterGrade8() {
        char grade = _main.letterGrade(80);
        assertEquals('B', grade);
    }

    @Test
    public void letterGrade9() {
        char grade = _main.letterGrade(79);
        assertEquals('C', grade);
    }

    @Test
    public void letterGrade10() {
        char grade = _main.letterGrade(71);
        assertEquals('C', grade);
    }

    @Test
    public void letterGrade11() {
        char grade = _main.letterGrade(70);
        assertEquals('C', grade);
    }

    @Test
    public void letterGrade12() {
        char grade = _main.letterGrade(69);
        assertEquals('D', grade);
    }

    @Test
    public void letterGrade13() {
        char grade = _main.letterGrade(61);
        assertEquals('D', grade);
    }

    @Test
    public void letterGrade14() {
        char grade = _main.letterGrade(60);
        assertEquals('D', grade);
    }

    @Test
    public void letterGrade15() {
        char grade = _main.letterGrade(59);
        assertEquals('F', grade);
    }

    @Test
    public void letterGrade16() {
        char grade = _main.letterGrade(1);
        assertEquals('F', grade);
    }

    @Test
    public void letterGrade17() {
        char grade = _main.letterGrade(0);
        assertEquals('F', grade);
    }

    @Test
    public void letterGrade18() {
        char grade = _main.letterGrade(-1);
        assertEquals('X', grade);
    }

}