import java.util.Arrays;
import java.util.Scanner;

public class PalindromeReorder {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        int strLength=str.length();
        boolean isOdd=strLength%2==1;
        int[] map=new int[26];
        char[] cr=new char[strLength];
        for (int i = 0; i < strLength; i++) {
            char current=str.charAt(i);
            map[current-'A']++;
        }
        boolean includeOdd=false;
        char middleChar=' ';
        for (int i = 0; i < map.length; i++) {
            int amount=map[i];
            if(amount%2==1){
                if(includeOdd){
                    System.out.println("NO SOLUTION");
                    return;
                }
                map[i]--;
                middleChar=(char) (i+'A');
                includeOdd=true;
            }
        }
        if(includeOdd!=isOdd){
            System.out.println("NO SOLUTION");
            return;
        }
        int index=0;
        for (int i = 0; i < map.length; i++) {
            char current= (char) (i+'A');
            int amount=map[i];
            int j;
            for (j = 0; j < amount / 2; j++) {
                cr[index+j]=current;
                cr[strLength-index-j-1]=current;
            }
            if(amount!=0)
                index+=j;
        }
        if(includeOdd&&middleChar!=' ')
            cr[strLength/2]=middleChar;
        String finalString= String.valueOf(cr);
        System.out.println(finalString);
    }
}
