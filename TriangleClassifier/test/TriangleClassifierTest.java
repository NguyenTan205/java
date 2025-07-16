import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void tamGiacThuong() {
        double a = 3;
        double b = 4;
        double c = 5;
        String expected = "Tam giac thuong";

        String result = TriangleClassifier.checkTriangle(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    void tamGiacDeu() {
        double a = 2;
        double b = 2;
        double c = 2;
        String expected = "Tam Giac deu";

        String resault = TriangleClassifier.checkTriangle(a, b, c);
        assertEquals(expected, resault);
    }

    @Test
    void tamGiacCan() {
        double a = 2;
        double b = 2;
        double c = 3;
        String expected = "Tam Giac can";
        String resault = TriangleClassifier.checkTriangle(a, b, c);
        assertEquals(expected, resault);
    }

    @Test
    void khongPhaiTamGiac () {
        double a = -1;
        double b = 2;
        double c = 1;
        String expected = "Khong phai la tam giac";
        String resault = TriangleClassifier.checkTriangle(a, b, c);
        assertEquals(expected, resault);
    }
}