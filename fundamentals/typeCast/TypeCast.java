public class TypeCast {
    public static void main(String[] args) {
        double d = 35.35;
        double dd = 35.99;

        int i = (int) d;

        int ii = (int) dd;
        System.out.println(i);
        System.out.println(ii);


        int j = 35;
        float f = i;
        System.out.println("The number is: " + f);
    }
}