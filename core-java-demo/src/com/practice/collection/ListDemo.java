package src.com.practice.collection;
import java.util.ArrayList;
public class ListDemo {
    public static void main(String[] args) {
        String city = "pune";

        String[] citie = new String[3];
        citie[0] = "pune";
        citie[1] = "mumbai";
        citie[2] = "delhi";

        //String [] cities = {"pune" , "mumbai" , "delhi"};

        ArrayList cityList = new ArrayList();
        cityList.add("pune");
        cityList.add("mumbai");
        cityList.add("delgi");
        cityList.add(300);
        System.out.println("city " + city);
        System.out.println("citie" + citie);
        System.out.println("cityList " + cityList);
    }
}
