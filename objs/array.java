public class array {
    public static void main(String[] args){
        int arr[] = {1,2,3,4};
        int num[] = new int[4];

        num[0]= 10;
        num[1]=20;
        num[2]=30;
        num[3]=40;


        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        for(int i=0;i<num.length;i++){
            System.out.println("array : " + num[i]);
        }
    }


}
