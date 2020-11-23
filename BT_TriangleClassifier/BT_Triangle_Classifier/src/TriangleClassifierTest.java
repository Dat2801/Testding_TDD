import javax.lang.model.element.NestingKind;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @org.junit.jupiter.api.Test
    void number() {
       int a = 2;
       int b = 2;
       int c = 2;
       String expected = "Tam giác đều";

       Object result =TriangleClassifier.number(a,b,c);
       assertEquals(expected, result);

    }
    @org.junit.jupiter.api.Test
    void number1() {
        int a = 2;
        int b =2;
        int c = 3;
        String expected = "Tam giác cân";

        Object result = TriangleClassifier.number(a,b,c);
        assertEquals(expected, result);
    }
    @org.junit.jupiter.api.Test
    void number2() {
        int a = 3;
        int b = 4;
        int c = 5;
        String expected = "Tam giác thường";

        Object result = TriangleClassifier.number(a, b, c);
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void number3() {
        int a = 3;
        int b = 6;
        int c = 3;
        String expected = "Không phải tam giác";

        Object result = TriangleClassifier.number(a, b, c);
        assertEquals(expected, result);
    }
}