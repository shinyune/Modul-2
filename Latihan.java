import java.util.ArrayList;

import javax.xml.crypto.Data;

public class Latihan {
    
    public static void main(String[] args) {
        
        ArrayList<String> Hewan = new ArrayList<>();
        ArrayList<String> DeleteHewan = new ArrayList<>();

        Hewan.add("Sapi");
        Hewan.add("Kelinci");
        Hewan.add("Kambing");
        Hewan.add("Unta");
        Hewan.add("Domba");
        
        System.out.println("Hewan : "+Hewan);

        DeleteHewan.add("Kelinci");
        DeleteHewan.add("Kambing");
        DeleteHewan.add("Unta");

        System.out.println("Hewan yang dihapus : "+DeleteHewan);
        
        Hewan.removeAll(DeleteHewan);

        System.out.println("Output hewan : "+Hewan);
    }
}
