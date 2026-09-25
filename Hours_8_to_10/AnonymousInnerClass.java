
abstract class A {
    public abstract void show();
    public abstract void config();
}

public class AnonymousInnerClass {
    public static void main(String args[]){
        A obj = new A(){
            public void show(){
                System.out.println("in a show");
            }
            public void config(){
                System.out.println("in config");
            }
        };
        obj.show();
        obj.config();
    }
}
