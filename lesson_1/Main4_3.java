import java.util.Scanner;
import java.util.Stack;

public class Main4_3 {
    public static void show(Stack st){
        System.out.println(st);
    }
    public static void remove(Stack st){
        String ud = (String) st.pop();
        System.out.println("удалено действие" + ud);
    }
    public static void main(String[] args) {
        Stack<String> activity = new Stack<>();
        while(true) {
            Scanner income = new Scanner(System.in);
            System.out.println("Введите первое число");
            int first = income.nextInt();
            System.out.println("Введите действие:+,-,* либо /");
            String action = income.next();
            System.out.println("Введите второе число");
            int second = income.nextInt();
            double answear = 0;
            switch (action) {
                case "+":
                    System.out.println(first + second);
                    answear = first + second;
                    break;
                case "-":
                    System.out.println(first - second);
                    answear = first - second;
                    break;
                case "*":
                    System.out.println(first * second);
                    answear = first * second;
                    break;
                case "/":
                    if (second == 0) {
                        System.out.println("на ноль делить нельзя");
                        break;
                    } else {
                        System.out.println(first / second);
                        answear = first / second;
                        break;
                    }
            }
            String act = String.format("%d %s %d = %f", first, action, second, answear);
            activity.add(act);

            System.out.println("выберите следующее действие:\n" +
                    "1 - продолжение работы с калькулятором\n" +
                    "2 - просмотр действий и продолжение работы с калькулятором\n" +
                    "3 - отмена последнего действия\n" +
                    "4 - завершение работы с калькулятором");

            String but = income.next();

            if(but=="1"){
                continue;
            }
            else if(but=="2"){
                show(activity);
            } else if(but=="3"){
                remove(activity);
            } else if(but=="4"){
                break;
            } else{
                System.out.println("будем считать что это один");
            }
        }

    }
}
