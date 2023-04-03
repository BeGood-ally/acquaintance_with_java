import java.util.ArrayList;

public class Main3_3 {
    public static int max_arr(ArrayList arr){
        int max = 0;
        for(int i = 0; i < arr.size(); i++){
            if ((int)arr.get(i)>max) {
                max = (int)arr.get(i);
            }
        }
        return max;
    }
    public static int min_arr(ArrayList arr){
        int min = 11;
        for(int i = 0; i < arr.size(); i++){
            if ((int)arr.get(i)<min) {
                min = (int)arr.get(i);
            }
        }
        return min;
    }
    public static int middle_arr(ArrayList arr){
        int max = max_arr(arr);
        int min = min_arr(arr);
        int average = (max + min)/2;
        int diff = 11;
        int middle = 0;
        for(int i = 0; i < arr.size(); i++){
            if (Math.abs(average - (int)arr.get(i)) < diff) {
                diff = Math.abs(average - (int)arr.get(i));
                middle = (int)arr.get(i);
            }
        }
        return middle;
    }
    public static void main(String[] args) {
        ArrayList a = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            a.add((int) (Math.random() * 10));
        }
        System.out.println(a);
        System.out.println(max_arr(a));
        System.out.println(min_arr(a));
        System.out.println(middle_arr(a));
    }
}
