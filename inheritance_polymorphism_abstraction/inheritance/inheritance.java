public class inheritance {
    public static void main(String[] args){
        VeryAdvCalc obj = new VeryAdvCalc();
        int r1 = obj.add(1 , 5);
        int r2 = obj.sub(4 , 8);
        int r3 = obj.mult(6 , 6);
        int r4 = obj.div(2 , 4);
        double r5 = obj.power(4 , 2);

        System.out.println(r1 + " : " + r2 + " : "+ r3 + " : " + r4 + " : " + r5);
    }
}