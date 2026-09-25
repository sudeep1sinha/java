

enum Status {
    Running , Failed , Pending , Success;
}

public class enums {
    public static void main (String[] args){
        int i = 5;
        Status s = Status.Failed;
        System.out.println(s);
    }
}
