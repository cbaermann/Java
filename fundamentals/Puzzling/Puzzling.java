import java.util.ArrayList;

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

}