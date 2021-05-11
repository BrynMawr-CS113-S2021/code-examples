import java.util.HashMap;

public class HashMapEx {
   public static void main(String[] args) {

        // Create a map from animals to animal sounds
        HashMap<String, String> animals = new HashMap<String,String>();
        animals.put("dog", "woof");
        animals.put("cat", "meow");
        animals.put("snake", "sssss");

        for (String key : animals.keySet()) { // for-each semantics
            System.out.printf("The %s says: %s\n", key, animals.get(key));
        }

        for (String values : animals.values()) { // for-each semantics
            System.out.printf("Animal sound: %s\n", values);
        }

        String value = animals.get("dog");
        System.out.println(value);

        animals.put("cow", "mooo");
        if (animals.containsKey("cow")) {
            value = animals.get("cow");
            System.out.println(value);
        }
   } 
}
