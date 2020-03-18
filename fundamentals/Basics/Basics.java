import java.util.ArrayList;
import java.util.Collections;

public class Basics {
    public void printTo225(){
        for(int i = 1; i < 256; i++){
            System.out.println(i);
        }
    }

    public void printOdd225() {
        for(int i = 1; i < 256; i++){
            if(i % 2 == 1) {
                System.out.println(i);
            }
        }
    }
}