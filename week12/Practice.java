public class Practice {

    public static int rflipCoin(int n) {

        if (n <= 0) return 0;

        int flip = (int) (Math.round(Math.random()));
        System.out.println(n+") flip: "+flip);
        if (flip == 0) return 1 + rflipCoin(n-1);
        else return rflipCoin(n-1);
    }

    public static String rdouble(String s) {
        if (s.length() == 0) return "";

        String repeat = s.substring(0,1) + s.substring(0,1);
        return repeat + rdouble(s.substring(1));
    }

    public static void main(String[] args) {
        int num = rflipCoin(4);
        System.out.println("Number of coin flips: "+num);

        System.out.println("Double string: "+ rdouble("lol"));

    }
    
}
