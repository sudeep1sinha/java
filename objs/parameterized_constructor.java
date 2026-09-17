class human{
    private int age ;
    private String name ;

    public human(){
        age = 20;
        name = "sudeep"; }

    

    public human(int age , String name){
        this.age = age;
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }
}




public class parameterized_constructor {
    public static void main ( String[] args){
        human obj = new human();
        human obj1 = new human(25, "Alice");
        System.out.println(obj.getName() + obj.getAge());
        System.out.println(obj1.getName() + obj1.getAge());


    }
}
