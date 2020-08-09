package pow;

public class Pow {
    public static void main(String[] args) {
        System.out.println(pow(6, -6));

    }

    public static double pow(double value, int powValue) {
        double result = 1;
        if(powValue ==0)
            return 1;
        if (powValue < 0){
            if (value == 0) throw new NullPointerException();
            powValue = - powValue;
            value = 1/value;
        }

        if(powValue ==1)
            return value;
        result = pow(value, powValue/2);
        result *= result;

        if(powValue%2!=0){
             result *= value;
        }
        return result;

    }
}


