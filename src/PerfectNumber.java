import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        boolean isPerfect=isPerfectNumber(number);
        System.out.println(isPerfect);
    }

    public static boolean isPerfectNumber(int number){
        int value=DeterminePerfectNumber(number,1);
        System.out.println(value);
        return value == number;
    }

    public static int DeterminePerfectNumber(int number,int currentDivisor){
        if(currentDivisor>number/2){
            return 0;
        }
        if(number%currentDivisor==0)
            return currentDivisor+DeterminePerfectNumber(number,currentDivisor+1);
        return DeterminePerfectNumber(number,currentDivisor+1);
    }
}
