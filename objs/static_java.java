class Mobile {
    String name;
    int price ;
    static String brand ;

    public void show(){
        System.out.println(brand + " : " + name + " : " + price);
    }

    public static void show1(Mobile obj){
        System.out.println(obj.brand + " : " + obj.price + " : " + obj.name);
    }
}

public class static_java {
    public static void main(String[] args){
        Mobile obj = new Mobile();
        obj.name = "iphone";
        obj.price = 100000;
        Mobile.brand = "apple";

        Mobile obj1 = new Mobile();
        obj1.name = "samsung galaxy";
        obj1.price = 50000;
        //Mobile.brand = "samsung";

        //Mobile.brand = "phone";

        obj.show();
        obj1.show();

        Mobile.show1(obj);

    }
}
