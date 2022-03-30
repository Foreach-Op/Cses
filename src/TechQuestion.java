import java.util.ArrayList;
import java.util.Arrays;

public class TechQuestion {
    public static String str=
            "215 " +
            "193 124 " +
            "117 237 442 " +
            "218 935 347 235 " +
            "320 804 522 417 345 " +
            "229 601 723 835 133 124 " +
            "248 202 277 433 207 263 257 " +
            "359 464 504 528 516 716 871 182 " +
            "461 441 426 656 863 560 380 171 923 " +
            "381 348 573 533 447 632 387 176 975 449 " +
            "223 711 445 645 245 543 931 532 937 541 444 " +
            "330 131 333 928 377 733 017 778 839 168 197 197 " +
            "131 171 522 137 217 224 291 413 528 520 227 229 928 " +
            "223 626 034 683 839 053 627 310 713 999 629 817 410 121 " +
            "924 622 911 233 325 139 721 218 253 223 107 233 230 124 233";

    private static String test=
            "1 "+ "800 4 "+"2 2 9 "+"8 5 9 12 ";
    private static String test2="1 6 7 8 9 5 2 10 3 9 56 7 20 4 2";

    private static ArrayList<String> pyramid;
    public static void main(String[] args) {
        // 215->124->237->935->522->835->207->716->560->632->931->778->528->713->253
        pyramid=FillList();
        int maks=FindMax(1);
        if(maks<0)
            maks+=Integer.MAX_VALUE;
        System.out.println(maks);
    }

    private static ArrayList<String> FillList(){
        String[] newList=str.split(" ");
        ArrayList<String> stringArrayList=new ArrayList<>();
        stringArrayList.add("Dummy");
        stringArrayList.addAll(1, Arrays.asList(newList));
        return stringArrayList;
    }

    private static int FindMax(int current){
        if(current >= pyramid.size()){
            return 0;
        }
        int element=Integer.parseInt(pyramid.get(current));
        if(isPrime(element)){
            return -Integer.MAX_VALUE;
        }
        int row=determineRow(current);
        int left=current+row;
        int right=current+row+1;
        return Math.max(element+FindMax(left),element+FindMax(right));
    }

    private static boolean isPrime(int element){
        if(element==1)
            return false;
        if (element==2)
            return true;
        for (int i = 2; i <= element / 2; i++) {
            if(element%i==0)
                return false;
        }
        return true;
    }

    private static int determineRow(int index){
        for (int i = 1; i < pyramid.size(); i++) {
            int sum=(i*(i+1))/2;
            if(index<=sum) {
                return i;
            }
        }
        return -1;
    }
}
