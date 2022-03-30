import java.util.Scanner;

public class Repetitions {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String dna=scanner.nextLine();
        char searchedChar=' ';
        long repetition=1;
        long maksRepetition=1;
        for (int i = 0; i < dna.length(); i++) {
            char currentChar=dna.charAt(i);
            if(currentChar==searchedChar){
                repetition++;
            }else {
                if(repetition>maksRepetition){
                    maksRepetition=repetition;
                }
                repetition=1;
                searchedChar=currentChar;
            }
        }
        if(repetition>maksRepetition)
            maksRepetition=repetition;
        System.out.println(maksRepetition);
    }
}
