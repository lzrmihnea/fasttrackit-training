package org.fasttrackit.course5._4_def_methods;

public class MarketRunner {
    public static void main(String[] args) {
        Product p5 = new Product();
        p5.setName("Carne");
        p5.setPrice(2);
        p5.setCategory("Food");
        p5.setQuantity(1);

        Product p6 = new Product();
        p6.setName("Carne");
        p6.setPrice(1);
        p6.setCategory("Food");
        p6.setQuantity(2);

        System.out.println(p5.hashCode());
        System.out.println(p6.hashCode());
    }








    public static void testingEquals() {
        Product p1 = new Product();
        p1.setName("TV");
        p1.setPrice(12.0);

        Product p2 = new Product();
        p2.setName("TV");
        p2.setPrice(13.0);

        System.out.println(p1.equals(p2));
    }

    public static void printingProducts1() {
        Product p1 = new Product();
        p1.setName("TV");

        Product p2 = new Product();
        p2.setName("Carne");
        p2.setPrice(22.3);

        Product p3 = new Product();
        p3.setName("Cereale");
        p3.setCategory("Food");

        Product p4 = p1;

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
    }
}
