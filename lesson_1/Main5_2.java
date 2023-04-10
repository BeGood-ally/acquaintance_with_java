import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class Main5_2 {
    public static void main(String[] args) {
        HashMap<String, Integer> names = new HashMap<String, Integer>();
        ArrayList<String> stuff_arr = new ArrayList<>();
        String stuff_st = "Иван Иванов," +
                "Светлана Петрова," +
                "Кристина Белова," +
                "Анна Мусина," +
                "Анна Крутова," +
                "Иван Юрин," +
                "Петр Лыков," +
                "Павел Чернов," +
                "Петр Чернышов," +
                "Мария Федорова," +
                "Марина Светлова," +
                "Мария Савина," +
                "Мария Рыкова," +
                "Марина Лугова," +
                "Анна Владимирова," +
                "Иван Мечников," +
                "Петр Петин," +
                "Иван Ежов";
        String[] workers = stuff_st.split(",");
        for(int i = 0; i < workers.length; i++){
            String[] employee = workers[i].split(" ");
            stuff_arr.add(employee[0]);
        }
        System.out.println(stuff_arr);
        while(!stuff_arr.isEmpty()){
            String begin = stuff_arr.get(0);
            int count = 0;
            for(int i = 0; i < stuff_arr.size(); i++){
                if(stuff_arr.get(i).equals(begin)){
                    count++;
                    stuff_arr.set(i, "0");
                }
            }
            names.put(begin, count);
            stuff_arr.remove(0);
            while (stuff_arr.contains("0")){
                stuff_arr.remove("0");
            }
        }
        System.out.println(names);
    }
}
