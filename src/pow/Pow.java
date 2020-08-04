package pow;

public class Pow {
    public static void main(String[] args) {
        System.out.println(pow(27, -3));

    }

    public static double pow(double value, int powValue) {
        if (powValue == 0) return 1;
        if (powValue > 0) {
            if (powValue == 1) {
                return value;
            } else {
                return value * pow(value, powValue - 1);
            }
        } else {
            if (value == 0) throw new NullPointerException();
            if (powValue == -1) {
                return 1 / value;
            } else {
                return 1 / value * pow(value, powValue + 1);
            }

        }
    }

}
