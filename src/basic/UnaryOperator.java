package basic;

public class UnaryOperator {
    // Increment operator: ++ always add 1
    // PreIncrement: ++number
    // PostIncrement: number++

    // Decrement Operator: -- Decrease -1
    // PreDecrement : --number
    // PostDecrement : number--

    public static void main(String[] args) {

        int number =10;
        --number;
        System.out.println(number);
        number++;
        System.out.println(number);
        ++number;
        System.out.println(number++);
        System.out.println(number);

    }
}
