import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class DistinctNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int amount=scanner.nextInt();
        //int[] numbers=new int[amount];
        //HashSet<Integer> set=new HashSet<>(amount);
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < amount; i++) {
            //numbers[i]=scanner.nextInt();
            //set.add(scanner.nextInt());
            int element=scanner.nextInt();
            map.putIfAbsent(element,1);
            map.put(element,map.get(element));
        }
        System.out.println(map.keySet().size());
    }
}
