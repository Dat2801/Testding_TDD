public class NextDay_Calculator {
    public static int findNextDay(int number){
        switch (number){
            case 1: return 2;
            case 31:
            case 30:
            case 28:
            case 29:
                return 1;
        }return 1;
    }
}
