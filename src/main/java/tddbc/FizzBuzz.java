package tddbc;

public class FizzBuzz {
    public String convert(int num) {
        if (num % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(num);
    }
}
