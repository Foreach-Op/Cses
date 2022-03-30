import java.util.Scanner;

public class IncreasingArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        long move=0;
        int nextBig=0;
        for (int i = 0; i <n; i++) {
            int a=scanner.nextInt();
            nextBig=Math.max(nextBig,a);
            move+=nextBig-a;
        }
        System.out.println(move);
    }
}
