class Computer{
    public void playMusic(){
        System.out.println("Music playing ...");
    }

    public String getMePen(int cost){
        if(cost >= 10){
            return "pen";

        }else{
            return "poor";
        }

    }
}

public class obj1{
    public static void main (String[] args){
        Computer comp = new Computer();
        comp.playMusic();

        String result = comp.getMePen(9);
        System.out.println(result);
    }
}


