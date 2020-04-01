class BicycleTest {
    public static void main(String[] args) {
        Bicycle b = new Bicycle();
        //print constant
        System.out.println(Bicycle.myConstant);
        b.sayHello();
        Bicycle.staticMethod();
        b.speedUp(3);
        b.applyBreaks(1);
        System.out.println(b.getSpeed());
    }
}