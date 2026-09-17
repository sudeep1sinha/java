class human {
    int age ;
    String name ;
    public human(){
        System.out.println("this is a constructor method");
        age = 25;
        name = "sudeep";
    }
}

public class constructor {
    public static void main ( String[] args){
        human obj = new human();
        human obj1 = new human();
        System.out.println(obj.name + obj.age);
    }
}
