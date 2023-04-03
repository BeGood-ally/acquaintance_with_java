import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main4_2 {
    public static int first(Queue qAin){
        ArrayList copy = new ArrayList(qAin);
        return (int) copy.get(copy.size() - 1);
    }
    public static int dequeue(Queue qAin2){
        ArrayList copy2 = new ArrayList(qAin2);
        int ret = (int) copy2.get(copy2.size() - 1);
        copy2.remove(copy2.size() - 1);
        qAin2.clear();
        for (int i = 0; i < copy2.size(); i++){
            qAin2.add(copy2.get(i));
        }
        return ret;
    }
    public static void enqueue(Queue qAin3, int x){
        ArrayList copy3 = new ArrayList(qAin3);
        copy3.add(0,x);
        qAin3.clear();
        for (int i = 0; i < copy3.size(); i++){
            qAin3.add(copy3.get(i));
        }
    }
    public static void main(String[] args) {
        Queue qA = new LinkedList();
        for (int i = 0; i < 10; i++){
            qA.add((int) (Math.random() * 10));
        }
        System.out.println(qA);
        System.out.println(first(qA));
        System.out.println(dequeue(qA));
        System.out.println(qA);
        enqueue(qA, 5);
        System.out.println(qA);
    }
}
