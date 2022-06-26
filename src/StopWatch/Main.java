package StopWatch;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,String> countries = new HashMap<String,String>();

        countries.put("USA","Washington DC");
        countries.put("India","New Delhi");
        countries.put("Russia","Moscow");
        countries.put("China","Beijing");
        countries.put("Nigeria","Lagos");

        for(String i : countries.keySet()) {
            System.out.print(i+"\t"+"= ");
            System.out.println(countries.get(i));
        }



    }

}