import java.util.Arrays;
import java.util.Scanner;

public class Permutations {
    public static void main(String[] args) {
        //6-2 4 6 1 3 5
        //7-2461357
        //8-24681357

        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        long start=2;
        long finish=1;
        String[] arr=new String[n];
        boolean isOdd=n%2==1;
        long startTimeMilis=System.currentTimeMillis();
        if(n==3||n==2){
            System.out.println("NO SOLUTION");
        }else {
            for (int i = 0; i < n/2; i++) {
                arr[i]=String.valueOf(start);
                arr[i+n/2]=String.valueOf(finish);
                start+=2;
                finish+=2;
            }
            if(isOdd){
                arr[n-1]=String.valueOf(n);
            }
            String result= String.join(" ",arr);
            long finishTimeMilis=System.currentTimeMillis();
            System.out.println(result);
        }
    }
}
