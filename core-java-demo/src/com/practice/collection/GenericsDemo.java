package src.com.practice.collection;

import java.util.ArrayList;

public class GenericsDemo {
    //generics are used for
    public static void main(String[] args) {
        ArrayList<String> cityGenericsList = new ArrayList<>();
        cityGenericsList.add("pune");
        cityGenericsList.add("mumbai");
        cityGenericsList.add("delhi");
        cityGenericsList.add("amravati");
        //cityGenericsList.add(true);
        System.out.println("ArrayList <String> " + cityGenericsList);

        ArrayList<Integer> value = new ArrayList<>();
        value.add(3);
        value.add(665555);
        value.add(456789);
        System.out.println("ArrayList <Int>" + value);

    }
}
