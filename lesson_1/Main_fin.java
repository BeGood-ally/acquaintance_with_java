import java.util.*;

public class Main_fin {
    private static int release_year;

    public static void main(String[] args) {
        Set<Object> Nouts = new HashSet();
        Set<Integer>Critetia = new HashSet();
        Set<String>Variants = new HashSet<>();
        HashMap<Integer, String> choise = new HashMap<>();
        ArrayList<String>result = new ArrayList<>();
        Set<String>results = new HashSet<>();
        Nout.abc[0] = new Nout("ASUS VivoBook",2019, "windows", 15.6, "AMD Ryzen 5", 8, "ssd", 512, 56999);
        Nout.abc[1] = new Nout("DEXP Aquilon", 2020, "linux", 14, "Intel Celeron N4020", 4, "ssd", 128, 15999);
        Nout.abc[2] = new Nout("Acer Swift 1", 2020, "macos", 14, "Intel Pentium Silver N6000", 4, "hdd", 512, 27999);
        Nout.abc[3] = new Nout("Acer Extensa 15", 2020, "windows", 15.6, "Intel Pentium Silver N5030", 4, "ssd", 256, 32999);
        Nout.abc[4] = new Nout("Lenovo IdeaPad 3", 2019, "linux", 15.6, "Intel Pentium Gold 7505", 8, "hdd", 1024, 37999);
        Nout.abc[5] = new Nout("Infinix InBook X2", 2022, "macos", 14, "Intel Core i3-1115G4", 8, "ssd", 512, 34999);
        Nout.abc[6] = new Nout("MSI Katana GF76", 2020, "linux", 17.3, "Intel Core i5-1115G4", 16, "ssd", 1024, 70999);
        System.out.println("введите критерии выбора ноутбука:\n"
                + "1. год выпуска\n"
                + "2. операционная система\n"
                + "3. диагональ экрана\n"
                + "4. процессор\n"
                + "5. объем оперативной памяти\n"
                + "6. тип накопителя данных\n"
                + "7. объем памяти накопителя\n"
                + "8. цена\n"
                + "9. найти ноутбуки");
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("выберите критерий или нажмите \"9\" для завершения");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (number > 0 && number < 9) {
                    if(Critetia.contains(number)){
                        System.out.println("вы уже выбирали этот критерий");
                        continue;
                    }
                    else {
                        Critetia.add(number);
                        Scanner scan = new Scanner(System.in);
                        if (number == 1) {
                            for (int i = 0; i < Nout.abc.length; i++) {
                                Variants.add(String.valueOf(Nout.abc[i].release_year));
                            }
                        }
                        else if (number == 2) {
                            for (int i = 0; i < Nout.abc.length; i++){
                                Variants.add(String.valueOf(Nout.abc[i].operation_system));
                            }
                        }
                        else if (number == 3) {
                            for (int i = 0; i < Nout.abc.length; i++){
                                Variants.add(String.valueOf(Nout.abc[i].screen_size));
                            }
                        }
                        else if (number == 4) {
                            for (int i = 0; i < Nout.abc.length; i++){
                                Variants.add(String.valueOf(Nout.abc[i].processor));
                            }
                        }
                        else if (number == 5) {
                            for (int i = 0; i < Nout.abc.length; i++){
                                Variants.add(String.valueOf(Nout.abc[i].RAM_volume));
                            }
                        }
                        else if (number == 6) {
                            for (int i = 0; i < Nout.abc.length; i++){
                                Variants.add(String.valueOf(Nout.abc[i].SD_type));
                            }
                        }
                        else if (number == 7) {
                            for (int i = 0; i < Nout.abc.length; i++){
                                Variants.add(String.valueOf(Nout.abc[i].SD_volume));
                            }
                        }
                        else if (number == 8) {
                            for (int i = 0; i < Nout.abc.length; i++){
                                Variants.add(String.valueOf(Nout.abc[i].cost));
                            }
                        }
                        else continue;
                            System.out.println("выберите возможные варианты критерия");
                            System.out.println(Variants);
                            String varik = scan.nextLine();
                            if(Variants.contains(varik)){
                                choise.put(number, varik);
                                Variants.clear();
                            }
                            else System.out.println("такого варианта нет");
                        }
                    }
                    else if (number == 9) break;
                }
                else {
                System.out.println("вы ввели неверный символ, запустите программу и постарайтесь еще раз");
                break;
                }
            }
        if(choise.containsKey(1)){
            for (int i = 0; i < Nout.abc.length; i++) {
                if(String.valueOf(Nout.abc[i].release_year).contains(choise.get(1))){
                    result.add(String.valueOf(Nout.abc[i].name));
                    results.add(String.valueOf(Nout.abc[i].name));
                }
            }
        }
        if(choise.containsKey(2)){
            for (int i = 0; i < Nout.abc.length; i++) {
                if(String.valueOf(Nout.abc[i].operation_system).contains(choise.get(2))){
                    result.add(String.valueOf(Nout.abc[i].name));
                    results.add(String.valueOf(Nout.abc[i].name));
                }
            }
        }
        if(choise.containsKey(3)){
            for (int i = 0; i < Nout.abc.length; i++) {
                if(String.valueOf(Nout.abc[i].screen_size).contains(choise.get(3))){
                    result.add(String.valueOf(Nout.abc[i].name));
                    results.add(String.valueOf(Nout.abc[i].name));
                }
            }
        }
        if(choise.containsKey(4)){
            for (int i = 0; i < Nout.abc.length; i++) {
                if(String.valueOf(Nout.abc[i].processor).contains(choise.get(4))){
                    result.add(String.valueOf(Nout.abc[i].name));
                    results.add(String.valueOf(Nout.abc[i].name));
                }
            }
        }
        if(choise.containsKey(5)){
            for (int i = 0; i < Nout.abc.length; i++) {
                if(String.valueOf(Nout.abc[i].RAM_volume).contains(choise.get(5))){
                    result.add(String.valueOf(Nout.abc[i].name));
                    results.add(String.valueOf(Nout.abc[i].name));
                }
            }
        }
        else if(choise.containsKey(6)){
            for (int i = 0; i < Nout.abc.length; i++) {
                if(String.valueOf(Nout.abc[i].SD_type).contains(choise.get(6))){
                    result.add(String.valueOf(Nout.abc[i].name));
                    results.add(String.valueOf(Nout.abc[i].name));
                }
            }
        }
        if(choise.containsKey(7)){
            for (int i = 0; i < Nout.abc.length; i++) {
                if(String.valueOf(Nout.abc[i].SD_volume).contains(choise.get(7))){
                    result.add(String.valueOf(Nout.abc[i].name));
                    results.add(String.valueOf(Nout.abc[i].name));
                }
            }
        }
        if(choise.containsKey(8)){
            for (int i = 0; i < Nout.abc.length; i++) {
                if(String.valueOf(Nout.abc[i].cost).contains(choise.get(8))){
                    result.add(String.valueOf(Nout.abc[i].name));
                    results.add(String.valueOf(Nout.abc[i].name));
                }
            }
        }
        ArrayList<String>Show_Result = new ArrayList<>();
        for(String temp:results){
            int count = 0;
            String nfm = temp;
            for (int j = 0; j < result.size(); j++){
                if(result.get(j).equals(nfm)){
                    count++;
                }
            }
            if (count == choise.size()){
                Show_Result.add(nfm);
            }
        }
        System.out.println("под ваш запрос подходят следующие экземпляры:");
        for (int i = 0; i < Show_Result.size(); i++) {
            System.out.println(Show_Result.get(i));
        }
    }
}
