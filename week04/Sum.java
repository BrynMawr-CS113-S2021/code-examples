public class Sum {
    public static void main(String[] args) {
        int sum = 0; 
        for (int i = 0; i < 4; i++) {
            int v = StdIn.readInt();
            sum = sum + v;
        } 
        System.out.println("Sum: "+sum);
    }    
}
