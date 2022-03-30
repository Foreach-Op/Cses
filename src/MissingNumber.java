import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long n=scanner.nextInt();
        long sum=0;
        for (long i = 1; i < n; i++) {
            int a=scanner.nextInt();
            sum+=a;
        }
        System.out.println((n*(n+1))/2-sum);
    }
}
