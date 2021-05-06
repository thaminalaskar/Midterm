package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         * Store all the sorted data into one of the databases.
         *
         */
        ArrayList<String> alist = new ArrayList<String>();

        alist.add("Thamina");
        alist.add("Tanzina");
        alist.add("Farzin");
        alist.add("Shadman");
        alist.add("Julia");
        alist.add("Daniyl");
        alist.add("Adeel");
        showFor(alist);
        System.out.println("removing 'Adeel' from list by use of remove() function ");
        alist.remove("Adeel");
        showFor(alist);
        showWhile(alist);
        showForEach(alist);

    }

    public static void showFor(ArrayList<String> sl){
        // Displaying elements
        System.out.println("**********************");
        System.out.println("ArrayList:");
        for(String str: sl)
            System.out.println(str);
    }

    public static void showWhile(ArrayList<String> sl){
        // Displaying elements
        System.out.println("**********************");
        System.out.println("ArrayList: by Iterator and while");
        Iterator<String> iterator=sl.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next()+" ");
        }
    }

    public static void showForEach(ArrayList<String> sl){
        // Displaying elements
        System.out.println("**********************");
        System.out.println("ArrayList: by For Each");
        sl.forEach(name ->{System.out.println(name+" ");});

    }
}


