public class Snack {

    // define the data that belongs to Snack
    private String mName = ""; 
    private double mCost = 0;
    private String mDescription = "";
    private int mQuantity = 0;

    // constructor: this initializes an object of type Snack
    // called when we use `new` keyword
    public Snack(String name, String desc, int quantity, double cost) {
        mName = name;
        mDescription = desc;
        mQuantity = quantity;
        mCost = cost;
    }

    public void buy() {
        if (mQuantity > 0) {
            mQuantity--;
        }
    } 

    //setters/mutators
    public void setQuantity(int quantity) {
        mQuantity = quantity;
    }

    // getter/accessor
    public int getQuantity() {
        return mQuantity;
    }

    public String getName() {
        return mName;
    }

    public double getCost() {
        return mCost;
    }

    public String getDescription() {
        return mDescription;
    }    

    // Called automatically when we use string functions, such as + (string concatenate)
    public String toString() {
        String rep = String.format("%s, %s, %d, $%.2f", mName, mDescription, mQuantity, mCost);
        return rep;
    }

    // Use main for testing the Snack class
    public static void main(String[] args) {
        Snack soda = new Snack("Tang", "Tangy orange flavor", 10, 1.5); // call constructor 
        Snack chips = new Snack("Crunchos", "Fake cheese", 10, 0.75); // call constructor 

        System.out.println("Chip quantity (before):" + chips.getQuantity());
        chips.buy();
        System.out.println("Chip quantity (after):" + chips.getQuantity());
        System.out.println("Soda quantity (after):" + soda.getQuantity());

        System.out.println(soda); // Calls soda.toString() automatically
        System.out.println(chips); // Calls chips.toString() automatically

        String name = soda.getName();
        String description = soda.getDescription();
        double cost = soda.getCost();
        System.out.println(name+" "+description+" "+cost);
    }
} 