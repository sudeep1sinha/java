//class - class -> extends
//class - interface -> implements
//interface - interface -> extends


interface A {

    int age=44;
    String area = "mumbai";

    void show();
    void config();
}

interface X{
    void run();
}

interface Y extends X {
    
}

class B implements A,X {
    public void show(){
        System.out.println("in a show");
    }
    public void config(){
        System.out.println("in a config");
    }
    public void run(){
        System.out.println("in a run");
    }
}

public class Interface_ {
    public static void main(String[] args){
        A obj;
        obj = new B();
        obj.show();
        obj.config();
        
        X obj1 = new B();
        obj1.run();

        System.out.println(A.area);

    }
}
