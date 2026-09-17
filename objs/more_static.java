class Mobile {
    String brand ;
    int price ;
    static String name;

    public Mobile(){
        brand = "";
        price = 200;
        System.out.println("in constructor");
    }

    static {
        name = "Phone";
        System.out.println("in static block");
    }

    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }


}

public class more_static {
    public static void main ( String[] args) throws ClassNotFoundException{
        //Mobile obj1 = new Mobile();
       // obj1.brand = "apple";
        //obj1.price = 1500;
        //Mobile.name = "phone";

        //Mobile obj2 = new Mobile();
        //Mobile obj3 = new Mobile();

        Class.forName("Mobile");
    }
}
