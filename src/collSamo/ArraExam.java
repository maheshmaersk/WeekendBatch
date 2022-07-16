package collSamo;

public class ArraExam {
    public static void main(String[] args) {
        String[] sd = new String[10];
        sd[9] = "sadf";
        sd[1] = "ghf";
        sd[2] = "mniugh";

        for (int i = 0; i < sd.length; i++) {
            System.out.println(sd[i]);
        }

        for (String f : sd) {
            System.out.println(f);
        }


    }
}
