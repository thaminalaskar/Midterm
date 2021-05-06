package data;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class ReadingTextFile {

    public static void main(String[] args) {

        String tempContainer;
        String finalContainer = "";


        try {
            FileReader fileReader = new FileReader("/Users/bombae/IdeaProjects/java-midterm-question-master/src/data/self-driving-car");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((tempContainer = bufferedReader.readLine()) != null) {
                if (finalContainer.equals("")) {
                    finalContainer = finalContainer + tempContainer;
                } else {
                    finalContainer = finalContainer + "\n" + tempContainer;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println(finalContainer);

    }
}