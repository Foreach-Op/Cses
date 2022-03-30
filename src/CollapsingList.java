public class CollapsingList {
    public static void main(String[] args) {
        int[] arr=new int[]{7,2,8,9,4,13,7,1,9,10};
        int[] arr2=new int[]{1,2,3,4,5};
        int[] copyArr=collapse(arr);
        for (int i = 0; i < copyArr.length; i++) {
            System.out.println(copyArr[i]);
        }
    }

    public static int[] collapse(int[] arr){
        int[] copyArr=new int[(int) (arr.length/2.0+0.5)];
        for (int i = 0,j=0; i < arr.length; i+=2,j++) {
            int first=arr[i];
            int second=0;
            if(i+1<arr.length){
                second=arr[i+1];
            }
            copyArr[j]=first+second;
        }
        return copyArr;
    }
}
