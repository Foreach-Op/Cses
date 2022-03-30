import java.util.ArrayList;

public class PatternMatching {
    public static void main(String[] args) {
        String s="ababbabc";
        String p="ab*";
        ArrayList<Integer> m=new ArrayList();
        for (int i = 0; i <= s.length()-p.length(); i++) {
            boolean check=true;
            for (int j = 0; j < p.length(); j++) {
                char sc=s.charAt(i+j);
                char pc=p.charAt(j);
                if(pc!='*'&&sc!=pc){
                    check=false;
                    break;
                }
            }
            if(check){
                m.add(i);
            }
        }
        m.forEach(System.out::print);
    }
}
