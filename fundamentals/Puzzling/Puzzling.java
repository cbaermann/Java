import java.util.ArrayList;
import java.util.Collections;

public class Puzzling {

    public void sumAndGreaterThan10(int[] arr){
        ArrayList<Integer> x = new ArrayList<Integer>();
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            if(arr[i] > 10){
                x.add(arr[i]);
            }
        }
        System.out.println(sum);
        System.out.println(x);
    }

    public void shuffleNames(String[] arr){
        ArrayList<String> shuffleNames = new ArrayList<String>();
        ArrayList<String> greaterThan5 = new ArrayList<String>();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].length() > 5){
                greaterThan5.add(arr[i]);
            }
            shuffleNames.add(arr[i]);
        }
        Collections.shuffle(shuffleNames);
        System.out.println(greaterThan5);
        System.out.println((shuffleNames));
    }

}