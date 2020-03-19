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

    public void findMax(int[] arr){
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);

    }

    public void average(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        int avg = sum/arr.length;

        System.out.println(avg);
    }

    public void oddArray() {
        ArrayList<Integer> y = new ArrayList<Integer>();
        for(int i = 1; i < 256; i++) {
            if(i %2 == 1){
                y.add(i);
            }
        }
        System.out.println(y);
    }

    public void greaterThanY(int[] arr, int y) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > y) {
                count++;
            }
        }
        System.out.println(count);
    }

    public void squareValues(int[] arr) {
        for(int i = 0; i < arr.length; i ++) {
            int temp = arr[i] * 2;
            arr[i] = temp;
        }
        System.out.println(arr);
    }
    
}