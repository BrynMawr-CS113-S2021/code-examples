public class ForEachEx {
    
    public static void main(String[] args) {

        int[] values = {2,4,6,8,10};
        
        // loop with indexing
        for (int i = 0; i < values.length; i++) {
            int value = values[i];
            System.out.println(value);
        }

        // loop using for-each semantics
        for (int value : values) {
            System.out.println(value);
        }
    }
}
