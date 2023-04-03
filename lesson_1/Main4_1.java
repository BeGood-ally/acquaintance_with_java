import java.util.LinkedList;

public class Main4_1 {
    public static LinkedList reverse (LinkedList Llis){
        LinkedList<Integer> Llisrev = new LinkedList<>();
        for (int i = 0; i < Llis.size(); i++){
            Llisrev.add((Integer) Llis.get((Llis.size() - i) - 1));
        }
        return Llisrev;
    }
    public static void main(String[] args) {
        LinkedList<Integer> ulis = new LinkedList<>();
        for (int i = 0; i < 10; i++){
            ulis.add((int) (Math.random() * 10));
        }
        System.out.println(ulis);
        System.out.println(reverse(ulis));
    }
}
