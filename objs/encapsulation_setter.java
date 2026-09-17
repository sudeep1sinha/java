class info {
    private int age;
    private String name;

    public info() {
        System.out.println("this is a constructor method");
        age = 16;
        name = "sudeep";

    }

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){   //a 
        this.age =age;             //age = a local and instance variable is age so we use this keyword to differentiate between them
    }

    public void setName(String name){   //n
        this.name = name ;             //name = n local and instance variable is name so we use this keyword to differentiate between them
    }
}

public class encapsulation_setter {
    public static void main ( String[] args){
        info obj = new info();
        info obj1 = new info();

       // obj.setName("kumar");
        //obj.setAge(20);

        System.out.println("name : " + obj.getName() + " : " + " age : " + obj.getAge());
    }
}
