package HW1;

public class q2 {
    public static String starsLeftAligned(int rows) {
        String result = "";
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                result += "*";
            }
            result += "\n";
        }
        return result;
    }

    public static String starsRightAligned(int rows) {
        String result = "";
        for (int i = 0; i < rows; i++) {
            for (int j = rows - i; j > 1; j--) {
                result += " ";
            }
            for (int k = 0; k <= i; k++) {
                result += "*";
            }
            result += "\n";
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(starsLeftAligned(5));
        System.out.println(starsRightAligned(4));
    }
}
