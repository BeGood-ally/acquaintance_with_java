import java.awt.*;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class Main2_1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("select * from students where ");
        HashMap<String, String> js = new HashMap<>();
        js.put("name","Ivanov");
        js.put("country","Russia");
        js.put("city","Moscow");
        js.put("age","null");
        for (Map.Entry<String, String> d : js.entrySet()){
            String key = d.getKey();
            String value = d.getValue();
            if (value != "null") {
                sb.append(key + "=\"" + value + "\" and ");
            }
        }
        sb.delete(sb.length() - 4, sb.length());
        System.out.println(sb);
    }
}
