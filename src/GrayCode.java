import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class GrayCode {

    public static int n;
    public static Set<String> stringSet;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        stringSet=new HashSet<>();
        StartRecurrence();
        stringSet.stream().sorted();
        for (String str:stringSet) {
            System.out.println(str);
        }
    }
    private static void StartRecurrence(){
        StringBuilder stringBuilder1=new StringBuilder();
        StringBuilder stringBuilder2=new StringBuilder();
        Recurse(1,stringBuilder1,'0');
        Recurse(1,stringBuilder2,'1');
    }
    private static void Recurse(int current,StringBuilder stringBuilder,char add){
        if(current<=n){
            stringBuilder.append(add);
            StringBuilder stringBuilder1=new StringBuilder(stringBuilder.toString());
            StringBuilder stringBuilder2=new StringBuilder(stringBuilder.toString());
            Recurse(current+1,stringBuilder1,'0');
            Recurse(current+1,stringBuilder2,'1');

        }else {
            stringSet.add(stringBuilder.toString());
        }
    }
}
