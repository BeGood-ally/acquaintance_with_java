import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class check {
    public static void main(String[] args) {
        Set<Integer> a = new HashSet();
        Set<Integer> b = new HashSet();
        HashMap<Integer,Integer> has = new HashMap<>();
        a.add(1);
        a.add(2);
        a.add(3);
        b.add(2);
        b.add(3);
        b.add(4);
        b.add(4);
        b.add(4);
        System.out.println(b);
        a.retainAll(b);
        System.out.println(a);
        has.put(1,1);
        has.put(2,3);
        has.put(3,7);
        has.put(4,5);
        has.put(5,2);
        System.out.println(has.values().contains(2));
    }
}
