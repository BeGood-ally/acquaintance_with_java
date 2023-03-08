import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Random;


public class Main_3 {
    public static void main(String[] args) {
        System.out.println("введите выражение вида: q+w=e, где q,w,e>=0\nи некоторые цифры в левой части заменены на \"?\"");
        Scanner equation = new Scanner(System.in);
        String equation_with_gaps = equation.nextLine();
        String equation_gapless = equation_with_gaps.replaceAll("\\s", "");
        Pattern equation_at_whole_P = Pattern.compile("([1-9][\\?]|[\\?][0-9]|[1-9][0-9])[\\\\+]([1-9][\\?]|[\\?][0-9]|[1-9][0-9])[\\\\=][1-9][0-9]");
        Matcher equation_at_whole_M = equation_at_whole_P.matcher(equation_gapless);
        if(equation_at_whole_M.matches()){
            String[]left_right = equation_gapless.split("[=]");
            String left_part_of_equation = left_right[0];
            String right_part_of_equation = left_right[1];
            String[]around_plus_double = left_part_of_equation.split("[+]");
            String[]around_plus_solo = new String[4];
            String[]right_part_of_equation_solo = right_part_of_equation.split("");
            String[] solo1 = around_plus_double[0].split("");
            String[] solo2 = around_plus_double[1].split("");
            System.arraycopy(solo1, 0, around_plus_solo, 0, 2);
            System.arraycopy(solo2, 0, around_plus_solo, 2, 2);
            ArrayList around_plus_solo_integ = new ArrayList();
            for (int i = 0; i < around_plus_solo.length; i++) {
                if (around_plus_solo[i].equals("?")) {
                    around_plus_solo_integ.add(around_plus_solo[i]);
                }
                else{
                    around_plus_solo_integ.add(Integer.parseInt(around_plus_solo[i]));
                }
            }
            for (int i = 0; i < right_part_of_equation_solo.length; i++){
                around_plus_solo_integ.add(Integer.parseInt(right_part_of_equation_solo[i]));
            }
            //находим значение "?"
            if(around_plus_solo_integ.get(0).equals("?")){
                if(around_plus_solo_integ.get(2).equals("?")){
                    if(Integer.parseInt(around_plus_solo[1]) + Integer.parseInt(around_plus_solo[3]) == Integer.parseInt(right_part_of_equation_solo[1])) {
                        double mem4 = Double.parseDouble(right_part_of_equation_solo[0]);
                        int mem0 = (int) (Math.random() * mem4);
                        int mem2 = (int) mem4 - mem0;
                        if(mem0 == 0){
                            System.out.println(around_plus_solo[1] + "+" + String.valueOf(mem2) + around_plus_solo[3]);
                        }
                        else if(mem2 == 0){
                            System.out.println(String.valueOf(mem0) + around_plus_solo[1] + "+" + around_plus_solo[3]);
                        }
                        else{
                            System.out.println(String.valueOf(mem0) + around_plus_solo[1] + "+" + String.valueOf(mem2) + around_plus_solo[3]);
                        }
                    }
                    else if(Integer.parseInt(around_plus_solo[1]) + Integer.parseInt(around_plus_solo[3]) == (Integer.parseInt(right_part_of_equation_solo[1]) + 10)){
                        double mem4 = Double.parseDouble(right_part_of_equation_solo[0]);
                        int mem0 = (int) (Math.random() * mem4);
                        if(mem0 < (int) mem4) {
                            int mem2 = (int) mem4 - mem0 - 1;
                            if(mem0 == 0){
                                System.out.println(around_plus_solo[1] + "+" + String.valueOf(mem2) + around_plus_solo[3]);
                            }
                            else if(mem2 == 0){
                                System.out.println(String.valueOf(mem0) + around_plus_solo[1] + "+" + around_plus_solo[3]);
                            }
                            else{
                                System.out.println(String.valueOf(mem0) + around_plus_solo[1] + "+" + String.valueOf(mem2) + around_plus_solo[3]);
                            }
                        }
                        else{
                            int mem2 = (int) mem4 - mem0;
                            System.out.println(String.valueOf(mem0-1) + around_plus_solo[1] + "+" + around_plus_solo[3]);
                        }
                    }
                    else{
                        System.out.println("Решения нет");
                    }
                }
            }
        }
        else {
            System.out.println("уравнение не соответствует шаблону");
        }
    }
}
