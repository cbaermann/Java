import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

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

    public void randNumber(){
        ArrayList<Integer> rand = new ArrayList<Integer>();
        for(int i = 0; i < 10; i ++) {
            int num = ThreadLocalRandom.current().nextInt(55, 101);
            rand.add(num);
        }
        System.out.println(rand);
    }

    public void randMinMax() {
        ArrayList<Integer> rand = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            int num = ThreadLocalRandom.current().nextInt(55, 101);
            rand.add(num);
        }
        Collections.sort(rand);
        System.out.println(rand);
        System.out.println("The minimum value is: " + rand.get(0));
        System.out.println("The max value is: " + rand.get(9));
    }

    public void randomString(){
        Random rand = new Random();
        StringBuilder randString = new StringBuilder();
        String alphaNumeric = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        for(int i = 0; i < 5; i++){
            randString.append(alphaNumeric.charAt(rand.nextInt(alphaNumeric.length())));
        }
        String finalString = randString.toString();
        System.out.println(finalString);
    }

    public void randomStringOfStrings(){
    Random rand = new Random();
    StringBuilder randString = new StringBuilder();
    ArrayList<String> randList = new ArrayList<String>();
    String alphaNumeric = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    for(int i = 0; i <10; i++){
        for(int j = 0; j < 5; j++){
            randString.append(alphaNumeric.charAt(rand.nextInt(alphaNumeric.length())));
        }
        String finalString = randString.toString();
        randList.add(finalString);
        randString.setLength(0);
    }
    System.out.println(randList);       
    }

}