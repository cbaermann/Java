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

    public void Sum() {
        int sum = 0;
        for(int i = 1; i < 256; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

    public void iterateArry(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}