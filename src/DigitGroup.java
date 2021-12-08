import java.util.Scanner;

public class DigitGroup {
    public static void main(String[] args) {

        System.out.println("Введите три целых числа");
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int sum2 = 0;
        int sum3 = 0;
        for(int n = scanner.nextInt(); n != 0; n /= 10) {sum += (n % 10);}
        for(int i = scanner.nextInt(); i != 0; i /= 10) {sum2 += (i % 10);}
        for(int j = scanner.nextInt(); j != 0; j /= 10) {sum3 += (j % 10);}
        if(sum == sum2 && sum2 == sum3){
            System.out.println("первая группа: " + sum + "; " + sum2 + "; " + sum3);
        } else if(sum == sum2){
            System.out.println("вторая группа: " + sum + "; " + sum2);
            System.out.println("третья группа: " + sum3);
        } else if(sum == sum3){
            System.out.println("вторая группа: " + sum + "; " + sum3);
            System.out.println("третья группа: " + sum2);
        } else if(sum2 == sum3) {
            System.out.println("вторая группа: " + sum2 + "; " + sum3);
            System.out.println("третья группа: " + sum);
        } else System.out.println("равных групп нет: " + sum + "; " + sum2 + "; " + sum3);
    }
}
