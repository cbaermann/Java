//client side test/driver test

public class TelevisionTest {
    public static void main(String[] args) {
        Television tele1 = new Television("Sony", 31, DisplayType.LED);
        Television tele2 = new Television();

        tele2.turnOn();

        System.out.println(tele1.toString());
        tele1.turnOn();
        tele1.mute();
        tele1.mute();
        tele1.turnOff();
//        System.out.println("There are " + args.length + " arguments");
//        for(String arg : args){
//            System.out.println(arg);




    }
}