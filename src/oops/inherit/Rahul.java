package oops.inherit;

public class Rahul extends Raju{

    public static void main(String[] args) {

        Rahul obj = new Rahul();
//        obj.aim();
        obj.goodHumanBeing();
        obj.job();
        obj.lovesGardening();

    }


    void goodHumanBeing(){
        System.out.println("Serves the Country with Ideas");
    }

    void job(){
        System.out.println("Software");
    }

    void aim(){
        System.out.println("To be the CEO");
    }
}
