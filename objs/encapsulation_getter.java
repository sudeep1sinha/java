class info {

    private int age=16;
    private String name = "sudeep";

    public int getAge()
    {
        return age;
    }
    public String getName(){
        return name;
    }

}

public class encapsulation_getter {
    public static void main (String[] args){
        info obj = new info();

        System.out.println("name : " + obj.getName() + " : " + " age : " + obj.getAge() );
    }
}
    

