package algorithm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Random;

public class Numbers {
    public Numbers() throws SQLException {
    }

    /*
     * Show all the different kind of sorting algorithm by applying into (num array).
     * Display the execution time for each sorting.Example in below.
     *
     * Use MySql Database to store data and retrieve data.
     *
     */

    public static void main(String[] args) throws Exception {

        int[] num = new int[1000000];
        storeRandomNumbers(num);
        // ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

        //Selection Sort
        Sort algo = new Sort();
        algo.selectionSort(num);
        long selectionSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");
//        connectToSqlDB.insertDataFromArrayToSqlTable(num, "selection_sort", "SortingNumbers");
//        List<String> numbers = connectToSqlDB.readDataBase("selection_sort", "SortingNumbers");
//        printValue(numbers);

        //Insertion Sort
        int n = num.length;
        randomize(num, n);
        algo.insertionSort(num);
        long insertionSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " milli sec");
//        connectToSqlDB.insertDataFromArrayToSqlTable(num, "insertion_sort", "SortingNumbers");
//        List<String> numbers = connectToSqlDB.readDataBase("insertion_sort", "SortingNumbers");
//        printValue(numbers);

        //By following above, Continue for rest of the Sorting Algorithm....

        // BubbleSort
        n = num.length;
        randomize(num, n);
        algo.bubbleSort(num);
        long bubbleSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in bubble Sort take: " + bubbleSortExecutionTime + " milli sec");
//        connectToSqlDB.insertDataFromArrayToSqlTable(num, "bubble_sort", "SortingNumbers");
//        List<String> numbers = connectToSqlDB.readDataBase("bubble_sort", "SortingNumbers");
//        printValue(numbers);

        String username = "root";
        String password = "root1234";
        String dbName = "peoplentech";

        String url = "jdbc:mysql://localhost:3306/" + dbName + "";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();

        //Come to conclusion about which Sorting Algo is better in given data set.
        if ((selectionSortExecutionTime < insertionSortExecutionTime) && (selectionSortExecutionTime < bubbleSortExecutionTime)) {
            System.out.println("Selection Sort is most efficient");
            return;
        }
        if ((insertionSortExecutionTime < selectionSortExecutionTime) && (insertionSortExecutionTime < bubbleSortExecutionTime)) {
            System.out.println("Insertion Sort is most efficient");
            return;
        }
        if ((bubbleSortExecutionTime < selectionSortExecutionTime) && (bubbleSortExecutionTime < insertionSortExecutionTime)) {
            System.out.println("Bubble Sort is most efficient");
            return;
        }
    }

    public static void storeRandomNumbers(int[] num) {
        Random rand = new Random();
        for (int i = 0; i < num.length; i++) {
            num[i] = rand.nextInt(1000000);
        }
    }

    public static void randomize(int[] arr, int n) {
        Random r = new Random();
        // Start from the last element and swap one by one. We don't
        // need to run for the first element that's why i > 0
        for (int i = n - 1; i > 0; i--) {
            int j = r.nextInt(i);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void printValue(List<String> array) {
        for (String st : array) {
            System.out.println(st);
        }
    }

}
