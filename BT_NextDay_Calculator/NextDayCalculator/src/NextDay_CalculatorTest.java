import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDay_CalculatorTest {

    @org.junit.jupiter.api.Test
    void findNextDay0() {
        int number = 1;
        int expected = 2;

        int result = NextDay_Calculator.findNextDay(number);
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void findNextDay1() {
        int number = 31;
        int expected = 1;

        int result = NextDay_Calculator.findNextDay(number);
        assertEquals(expected, result
        );
    }
    @org.junit.jupiter.api.Test
    void findNextDay2(){
        int number = 30;
        int expected = 1;

        int result = NextDay_Calculator.findNextDay(number);
        assertEquals(expected, result);
}
    @org.junit.jupiter.api.Test
    void findNextDay3(){
        int number = 28;
        int expected = 1;

        int result = NextDay_Calculator.findNextDay(number);
        assertEquals(expected, result);
    }
    @org.junit.jupiter.api.Test
    void findNextDay4() {
        int number = 29;
        int expected = 1;

        int result = NextDay_Calculator.findNextDay(number);
        assertEquals(expected, result);
    }
    @org.junit.jupiter.api.Test
    void findNextDay5() {
        int number = 31;
        int expected = 1;

        int result = NextDay_Calculator.findNextDay(number);
        assertEquals(expected, result);
    }
    @org.junit.jupiter.api.Test
    void findNextDay6() {
        int number = 30;
        int expected = 31;

        int result = NextDay_Calculator.findNextDay(number);
        assertEquals(expected, result);
    }
}