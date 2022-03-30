import java.util.Scanner;

public class BitString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        long mod=1;
        for (int i = 0; i < number; i++) {
            mod*=2;
            mod%=1000000007;
        }
        //mod%=1000000007;
        System.out.println(mod);
    }
}
