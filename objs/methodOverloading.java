class Calculator{
    public int add(int n1 , int n2){
        return n1+n1;
    }

    public int add(int n1 , int n2 , int n3){
        return n1+n2+n3;
    }

    public double add(double n1 , int n2){
        return n1+n2;
    }


}

public class methodOverloading{
    public static void main(String[]  args){
        Calculator calc = new Calculator();
        Calculator calc1 = new Calculator();

        int r1= calc.add(1,2,3);
        int r2 = calc1.add(5,5);

        System.out.println(r1);
        System.out.println(r2);


    }
}
