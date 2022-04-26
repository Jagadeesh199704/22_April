package collection_frame_work;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Drive {
//  List
/*    public static void dataSet(){
        ArrayList<String> nameOfCars = new ArrayList<>();
        nameOfCars.add("BMW");
        nameOfCars.add("Bentley");
        nameOfCars.add("Ford Endeavour");
        nameOfCars.add("Mahindra TUV 300");
        System.out.println(nameOfCars);

        System.out.println("-------------------------");

        Object [] array = nameOfCars.toArray();
        for (Object msg: array){
            System.out.println(msg.toString());
        }

        System.out.println("---------------------");

        System.out.println(nameOfCars.isEmpty());
        System.out.println("---------------------");
        System.out.println(nameOfCars.remove(2));
        System.out.println(nameOfCars.lastIndexOf("Mahindra TUV 300"));
        nameOfCars.clear();
        System.out.println(nameOfCars);
        System.out.println("---------------------");
        System.out.println(nameOfCars.indexOf("BMW"));
    }*/
//    Set
    public static void dataSet(){
        Set<String> nameOfCars = new HashSet<>();//Unordered
       //LinkedHashSet<String> nameOfCars = new LinkedHashSet<>(); // ordered
        nameOfCars.add("BMW");
        nameOfCars.add("Bentley");
        nameOfCars.add("Ford Endeavour");
        nameOfCars.add("Mahindra TUV 300");
        nameOfCars.add("Mahindra TUV 300");
        System.out.println(nameOfCars);}

    public static void main(String[] args) {
        dataSet();
    }

}
