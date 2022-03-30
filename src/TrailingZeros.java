import java.util.Scanner;

public class TrailingZeros {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long number=scanner.nextLong();
        int totalMod=0;
        int dividing=5;
        while (dividing<=number){
            totalMod+=(int) (number/dividing);
            dividing*=5;
        }
        System.out.println(totalMod);
    }
}
