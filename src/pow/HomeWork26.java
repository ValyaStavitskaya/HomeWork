package pow;

import java.util.ArrayList;
import java.util.List;

public class HomeWork26 {
    public static void main(String[] args) {
        List<Double> numbers = new ArrayList<>();
        numbers.add(1.0);
        numbers.add(-5.0);
        numbers.add(-2.0);
        numbers.add(6.0);
        System.out.println(SumSquares(numbers));

    }

    public static Double mean(List<Double> numbers) {
        Double result = 0.0;
        for (Double a : numbers)
            result += a;
        result = result / numbers.size();
        return result;

    }

    public static Double SumSquares(List<Double> numbers) {
        Double result = 0.0;
        for (Double a : numbers)
            if (a > 0 && a % 2 == 0)
                result +=a*a;
        return result;

    }
}
