import java.io.IOException;
import java.util.logging.*;

public class Main2_2 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(Main2_2.class.getName());
        FileHandler hand = new FileHandler("log.txt");
        logger.addHandler(hand);
        SimpleFormatter SF = new SimpleFormatter();
        hand.setFormatter(SF);
        int[] array;
        String sarray = "";
        array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 12));
            sarray = sarray + Integer.toString(array[i]) + ", ";
        }
        System.out.println(sarray);
        System.out.println("------------------------");
        while (true) {
            int count = 1;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int dummy = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = dummy;
                    count++;
                }
            }
            String sarray2 = "";
            for (int i = 0; i < array.length; i++) {
                sarray2 = sarray2 + Integer.toString(array[i]) + ", ";
            }
            if (count == 1) break;
            logger.info(sarray2);
        }
        System.out.println("------------------------");
        String sarray3 = "";
        for (int i = 0; i < array.length; i++) {
            sarray3 = sarray3 + Integer.toString(array[i]) + ", ";
        }
        System.out.println(sarray3);
    }
}
