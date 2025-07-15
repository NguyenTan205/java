public class Calculator {

    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';

    public static int calculate(int firestOperand, int secondOperand, char operator) {
        switch (operator) {
            case ADDITION:
                return firestOperand + secondOperand;
            case SUBTRACTION:
                return firestOperand - secondOperand;
            case MULTIPLICATION:
                return firestOperand * secondOperand;
            case DIVISION:
                if (secondOperand != 0)
                    return firestOperand / secondOperand;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}
