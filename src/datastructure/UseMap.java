package datastructure;

import java.util.*;

public class UseMap {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Map that includes storing and retrieving elements.
         * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         * Use MySql Database to store data and retrieve data.
         */
        Map<String, List<String> > list = new  HashMap<String, List<String>>();
        List<String> listA = new ArrayList<String> ();
        listA.add("This is a String");
        listA.add("This is another String");
        listA.add("This is also a String");

        list.put("text", listA);

        List<String> names = new ArrayList<String> ();
        names.add("Thamina");
        names.add("Tanzina");
        names.add("Farzin");
        names.add("Shadman");
        names.add("Julia");

        list.put("names", names);

        List<String> colors = new ArrayList<String> ();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Pink");
        colors.add("White");
        colors.add("Black");

        list.put("colors", colors);

        System.out.println("Map data");
        System.out.println(list);

        System.out.println("**************************************************");
        System.out.println("Map data by Iterator/while and forEach");
        Iterator<String> iterator = list.keySet().iterator();
        while(iterator.hasNext()) {
            String element = iterator.next();
            System.out.println();
            System.out.print("{Key: " + element + "( " );
            (list.get(element)).forEach(val -> {System.out.print(val+ ", ");});
            System.out.print(") }");

        }

    }



}
