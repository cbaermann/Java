public class GreeterTest {
    public static void main(String[] args) {
        Greeter g = new Greeter();

        String greeting = g.greet();
        String greetingWithName = g.greet("Gandalf");
        System.out.println(greetingWithName);
        
        if(greeting.equals("Hello World") || greetingWithName.equals("Hello Gandalf")){
            System.out.println("Test successful");
        }
        else{
            System.out.println("Test fail");
        }
    }
}