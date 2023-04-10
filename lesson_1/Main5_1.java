import java.util.ArrayList;
import java.util.HashMap;

public class Main5_1 {
    public static void supplement(HashMap tel, String human, String ... numbs){
        ArrayList<String>numbers = new ArrayList<String>();
        for(int i = 0; i < numbs.length; i++){
            numbers.add(numbs[i]);
        }
        tel.put(human, numbers);
    }
    public static void show_tel(HashMap tel, String name){
        System.out.println(tel.get(name));
    }

    public static void get_out(HashMap tel, String name){
        tel.remove(name);
    }
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> tel_guide = new HashMap<String, ArrayList<String>>();
        supplement(tel_guide, "Сергеев Сергей Сергеевич", "456", "678");
        show_tel(tel_guide, "Сергеев Сергей Сергеевич");
        System.out.println(tel_guide);
        get_out(tel_guide, "Сергеев Сергей Сергеевич");
        System.out.println(tel_guide.isEmpty());
    }
}
