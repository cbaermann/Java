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

    public void shuffleABC(String[] arr) {
        ArrayList<String> newABC = new ArrayList<String>();
        for(int i = 0; i < arr.length; i++){
            newABC.add(arr[i]);
        }

        Collections.shuffle(newABC);
        System.out.println("First letter of shuffled array is: " + newABC.get(0));
        System.out.println("Last letter of shuffled array is: " + newABC.get(25));
        String sample = newABC.get(0);

        if("AEIOU".indexOf(sample) > 0) {
            System.out.println("WOW! The first letter happens to be a vowel");
        }

    }

}