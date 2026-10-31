//—Unique Coupon Codes—

import java.util.HashSet;

public class HashSetInJava {
    public static void main(String[] args) {
        HashSet<String> coupons = new HashSet<>();
        coupons.add("SAVE10");
        coupons.add("WELCOME5");
        coupons.add("SAVE10");
        coupons.add("FREESHIP");

        System.out.println("Unique Coupon Count: " + coupons.size());
        System.out.println("Has SAVE10? " + coupons.contains("SAVE10"));
    }
}
