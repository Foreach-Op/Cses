import java.util.Scanner;

public class TwoSets {
    public static void main(String[] args) {
        //12
        // 12 9 8 5 4 1 ->39
        // 11 10 7 6 3 2 ->39
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        long totalSum=((long) number *(number+1))/2;
        if(totalSum%2==1){
            System.out.println("NO");
        }else {
            StringBuilder a= new StringBuilder();
            StringBuilder b= new StringBuilder();
            int ct=2;
            int ctA=0;
            int ctB=0;
            boolean isA=true;
            System.out.println("YES");
            for (int i = number; i > 0; i--) {
                if(ct%3==0){
                    ct=1;
                    isA=!isA;
                }
                if(isA){
                    ctA++;
                    a.append(i);
                    a.append(" ");
                }else {
                    ctB++;
                    b.append(i);
                    b.append(" ");
                }
                ct++;
            }
            System.out.println(ctA);
            System.out.println(a.toString());
            System.out.println(ctB);
            System.out.println(b.toString());
        }
    }
}
