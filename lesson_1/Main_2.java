import java.util.Scanner;

public class Main_2 {
    public static void main(String[] args) {
        Scanner income = new Scanner(System.in);
        System.out.println("Введите первое число");
        int first = income.nextInt();
        System.out.println("Введите действие:+,-,* либо /");
        String action = income.next();
        System.out.println("Введите второе число");
        int second = income.nextInt();
        switch (action){
            case "+":
                System.out.println(first+second);
                break;
            case "-":
                System.out.println(first-second);
                break;
            case "*":
                System.out.println(first*second);
                break;
            case "/":
                System.out.println(first/second);
                break;
        }
    }
}
