package oops.encaps;

public class EncapsuleExample {

    public static void main(String[] args) {
        Student nc = new Student();
        nc.id = 1;
        nc.name = "Anand";
        nc.classGrade = 4;
        nc.gender = true;

        Student nc1 = new Student();
        nc1.id = 2;
        nc1.name = "Bhavana";
        nc1.classGrade = 2;
        nc1.gender = false;


        Car ans = new Car();
        ans.setName("BMW");
        ans.setManufacturer("BMW Corporations");
        ans.setModelName("BMW X343");
        ans.setId(56);

        System.out.println(ans.getName());


    }
}
