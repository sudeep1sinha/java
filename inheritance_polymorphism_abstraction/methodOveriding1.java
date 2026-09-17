class Calc {
    public int add(int a , int b){
        return a + b;
    }
}

class AdvCalc extends Calc {
    public int add(int a , int b){
        return a + b + 1;

    }
}


public class methodOveriding1{
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        int r =obj.add(1 ,2);
        System.out.println(r);

    }}
