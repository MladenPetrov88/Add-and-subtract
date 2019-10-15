import java.util.Scanner;

public class AddAndSubtract {

    public static int subtractThirdNumberFromFirstTwoNumber (int firstNumber, int secondNumber, int thirdNumber) {
        int sum = firstNumber + secondNumber;
        int subtract = sum - thirdNumber;

        return subtract;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        int result = subtractThirdNumberFromFirstTwoNumber(firstNumber, secondNumber, thirdNumber);
        System.out.println(result);

    }
}
