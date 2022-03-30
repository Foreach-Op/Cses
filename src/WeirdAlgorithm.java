import java.util.Scanner;

public class WeirdAlgorithm {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long n=scanner.nextInt();
        System.out.print(n+" ");
        while (n>1){
            n=(n%2==0?n/2:3*n+1);
            System.out.print(n+" ");
        }
    }

}
