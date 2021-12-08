import java.util.Scanner;

public class SumDigit {
    public static void main(String[] args) {
        System.out.println("Введите целое число");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int sum = 0;
        sum(number, sum);

    }
    public static void sum(int number, int sum){
        if(number != 0){
            sum += number % 10;
            sum(number / 10, sum);
        }
        else System.out.println("Sum = " + sum);
    }
}
