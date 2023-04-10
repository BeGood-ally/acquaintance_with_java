import java.util.HashSet;
import java.util.Set;

public class Nout {
    String name;
    int release_year;
    String operation_system;
    double screen_size;
    String processor;
    int RAM_volume;
    String SD_type;
    int SD_volume;
    int cost;
    static Nout[]abc = new Nout[7];

        public Nout(String name, int release_year, String operation_system, double screen_size,
        String processor, int RAM_volume, String SD_type,
        int SD_volume, int cost){
            this.name = name;
            this.release_year = release_year;
            this.operation_system = operation_system;
            this. screen_size = screen_size;
            this. processor = processor;
            this. RAM_volume = RAM_volume;
            this. SD_type = SD_type;
            this. SD_volume = SD_volume;
            this. cost = cost;

        }
    //public void plus_to_set(Object obj){
        //Nouts.add(obj);
    //}
    public int getRelease_year(){
        return release_year;
    }
}
