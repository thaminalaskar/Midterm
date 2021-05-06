package datastructure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Iterator;

public class DataReader {

    public static void main(String[] args) {
        /*
         * User API to read the below textFile and print to console.
         * Use BufferedReader class.
         * Use try....catch block to handle Exception.
         *
         * Use MySql Database to store data and retrieve data.
         *
         * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
         * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
         * order from LinkedList and retrieve as FILO order from Stack.
         *
         * Demonstrate how to use Stack that includes push,peek,search,pop elements.
         * Use For Each loop/while loop/Iterator to retrieve data.
         */

        String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car";

        BufferedReader lineReader = null;
        List<String> strList = new ArrayList<String>();
        try {
            String strCurrentLine;
            lineReader = new BufferedReader(new FileReader(textFile));
            while ((strCurrentLine = lineReader.readLine()) != null) {
                System.out.println(strCurrentLine);
                strList.add(strCurrentLine);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (lineReader != null)
                    lineReader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        // taking words out of the Lines.
        LinkedList<String> llist = new LinkedList<String>();
        Stack stack = new Stack();
        for (String line : strList) {
            String[] str = line.split(" ");
            for (int i = 0; i < str.length; i++) {
                llist.add(str[i]);
                stack.push(str[i]);
                System.out.println(str[i]);
            }
        }
        System.out.println("*************FIFO order from LinkedList**************************");
        Iterator<String> iterator = llist.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println("");
        System.out.println("*************LIFO order from Stack**************************");

        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println("");
        stack.push("ABC");
        stack.push("DEF");
        stack.push("GHI");
        System.out.println("PEEKing element in stack = " + stack.peek());

        int loc = stack.search("DEF");
        if (loc < 0) {
            System.out.println("'DEF' not found in stack");
        } else {
            System.out.println("'DEF' found in stack at location: " + loc);

        }
    }
}









