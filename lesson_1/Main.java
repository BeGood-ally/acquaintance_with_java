import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ввод числа пользователем
        System.out.println("Hello, enter a integer");
        Scanner income = new Scanner(System.in);
        int num = income.nextInt();
        //вывод суммы чисел до данного числа
        int sum = 1;
        for(int i = 2; i < num + 1; i++){
            sum = sum + i;
        }
        System.out.println(sum);
        //вывод произведения чисел до данного числа
        int mul = 1;
        for(int i = 2; i < num + 1; i++){
            mul = mul * i;
        }
        System.out.println(mul);
        //вывод чисел от 1 до 1000
        for(int i = 1; i < 1001; i++){
            System.out.println(i);
        }
    }
}
