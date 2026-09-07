class Calculator{
    int a ;

    public int add(int n1 ,int n2){
        int r = n1 + n2;
        return r;    }
}

public class obj {
    public static void main ( String[] args){
        Calculator calc = new Calculator();

         int num1 = 10;
        int num2 = 20;

        int result = calc.add(num1 , num2);
        System.out.println(result);
    }
}
