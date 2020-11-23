public class TriangleClassifier {
    public static Object number(int a, int b, int c) {
        if (a < b + c && b < a + c && c < a + b) {
            if (a == b && b == c && c == a) return "Tam giác đều";
            else if (a == b || b == c || c == a) return "Tam giác cân";
            else if (a != b && b != c && c != a) return "Tam giác thường";
            else return "Không phải tam giác";
        }
        return "Không phải tam giác";
    }
}
