import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = new int[10];
        nums[0] = 2;
        String[] names = {"kaspar", "martin", "suursalu"};
        System.out.println(names);
        String[] names2 = {"kaspar", "martin", "suursalu"};
        System.out.println(names2[0]);
        for (String name : names2) {
            System.out.println(name);
        }

        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("pineapple");
        System.out.println(fruits.get(2));
        int[][] array2d = new int[3][3];
        array2d[0][0] = 3;
        array2d[2][1] = 4;
        System.out.println(array2d[0][0]);
        String[][] board = {
            {"1","2","3"},
            {"4","5","6"},
            {"7","8","9"}
        };
        board[1][1] = "x";
        System.out.println(board[1][1]);
        System.out.println(fruits.toArray()[2]);
        PriorityQueue<String> queue = new PriorityQueue<String>(); // LIFO - Last in first out
        queue.add("vello");
        queue.add("malle");
        queue.add("kati");
        System.out.println(queue.poll()); // kui tühi tagastab null
        System.out.println(queue.remove()); // kui tühi tagastab viskab exceptioni
        System.out.println(queue.remove());
        

        LinkedList<String> queue2 = new LinkedList<String>(); // FIFO - first in first out
        queue2.add("vello");
        queue2.add("malle");
        queue2.add("kati");
        System.out.println(queue2.remove());
        System.out.println(queue2.remove());
        System.out.println(queue2.remove());
        int example = 1;
        //core 1
        example++;//1+1
        System.out.println(example);
        //core 2
        example++;//1+1
        System.out.println(example);
        
        HashMap<String, String> map = new HashMap<String, String>();

        map.put("name", "Kaspar");
        map.put("age", "12");
        map.put("gender","male");
        
        System.out.println(map);
        System.out.println(map.get("age"));
        System.out.println(map.get("gender"));

        Map<String,Integer> map2 = Map.of("A", 1, "B", 2, "C", 3);

        System.out.println(map2);
        HashSet<String> cars = new HashSet<String>();
        cars.add("volvo");
        cars.add("volvo");
        cars.add("saab");
        cars.add("audi");
        cars.add("volvo");
        cars.add("saab");
        cars.remove("audi");
        System.out.println(cars);

        TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
        scores.put(42, "Vello");
        scores.put(12, "Annika");
        scores.put(55, "Anna");
        scores.put(62, "Felix");
        System.out.println(scores);
        scores.remove(55);
        System.out.println(scores);
        System.out.println(scores.descendingMap());
        System.out.println(scores.headMap(42,true));
        System.out.println(scores.tailMap(42,true));
        scores.put(55, "Anna");
        scores.put(54, "Anna");
        System.out.println(scores.subMap(42,true,55,true));
    }
}
