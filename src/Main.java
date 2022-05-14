import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Erzeuge eine neue ArrayList die Manager enthält
        List<Manager> managerList = new ArrayList<Manager>();
        //Erzeugt Manager 1
        Manager m1 = new Manager (32,3000);
        //Erzeugt Manager 2
        Manager m2 = new Manager(37,3500);

        //Sind beide Manager gleich gib true zurück
        if (m1.equals(m2)){
            System.out.println(true);
        }else{
            // Sind sie nicht gleich gib false zurück
            System.out.println(false);
        }
        //Füge m1 und m2 zur Liste hinzu
        managerList.add(m1);
        managerList.add(m2);
        System.out.println(managerList);
        //Sortiert die Liste anhander der compareTo Methode
        Collections.sort(managerList);
        System.out.println(managerList);

    }
}
