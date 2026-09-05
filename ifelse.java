public class ifelse {
    public static void main( String[] args) {
        int n = 6;
        int result =0;
        int result1 = 3;

        if(n%2==0){
            result = 10;
        }else {
            result = 20;
        }
        System.out.println(result);

        result1 = n%2==0 ? 10 : 20;
        System.out.println(result1);
    }
}
