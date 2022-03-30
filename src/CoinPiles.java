import java.util.Scanner;

public class CoinPiles {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        int n=scanner.nextInt();
        for (int i = 0; i < n; i++) {
            long a=scanner.nextLong();
            long b=scanner.nextLong();
            boolean isYes=((a+b)%3==0&&Math.min(a,b)>=Math.abs(a-b));
            sb.append(isYes?"YES\n":"NO\n");
        }
        System.out.println(sb.toString());
    }
}
