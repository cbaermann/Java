import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapFun {
    public static void main(String[] args) {

        //HashMap using Map rather than set, and using Map.Entry

        
        // Map<String, String> userMap = new HashMap<String, String>();

        // userMap.put("nninja@codingdojo.com", "Nancy Ninja");
        // userMap.put("ssamurai@codingdojo.com", "Sam Samurai");
        // userMap.put("wwizard@codingdojo.com", "Walter Wizard");

        // String name = userMap.get("nninja@codingdojo.com");
        // System.out.println("The full name is: " + name);

        // //get keys by using the keySet method
        // for(Map.Entry<String, String> entry : userMap.entrySet()) {
        //     System.out.println(entry.getKey() + " = " + entry.getValue());
        // }


        //HashMap using Set to iterate through
        HashMap<String, String> userMap = new HashMap<String, String>();
        userMap.put("nninja@codingdojo.com", "Nancy Ninja");
        userMap.put("ssamurai@codingdojo.com", "Sam Samurai");
        userMap.put("wwizard@codingdojo.com", "Walter Wizard");
        // get the keys by using the keySet method
        Set<String> keys = userMap.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.println(userMap.get(key));    
        }
        }
    } 
