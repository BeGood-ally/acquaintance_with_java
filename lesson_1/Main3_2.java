import java.util.ArrayList;

public class Main3_2 {
    public static void main(String[] args) {
        ArrayList a = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            a.add((int) (Math.random() * 10));
        }
        System.out.println(a);
        for (int i = 0; i < a.size(); i++){
            if(((int)a.get(i)%2) == 0 || (int)a.get(i) == 2){
                a.remove(i);
            }
        }
        System.out.println(a);
    }
}
