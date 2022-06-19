package oops.abstractexan;

public class MoreGroundnuts extends StoreProduct {
    @Override
    void barcode() {
        System.out.println("MORE344354353ND");
    }

    @Override
    void mrp() {
        System.out.println("76");
    }


    public static void main(String[] args) {
        StoreProduct abc = new MoreGroundnuts();
        abc.storeName();
        abc.mrp();
        abc.barcode();
    }


    public void storeName() {
        System.out.println("SRI Krishna Super Market");
    }
}
