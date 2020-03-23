import java.util.HashMap;
import java.util.Set;

public class HashSongs {
    public static void main(String[] args) {
        HashMap<String, String> songs = new HashMap<String, String>();

        songs.put("Bye", "Hello, Goodbye");
        songs.put("Hello", "It's Me");
        songs.put("Fight", "For your right");

        Set<String> keys = songs.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.println(songs.get(key));
        }

    }
}