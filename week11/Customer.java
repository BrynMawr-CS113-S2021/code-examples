public class Customer {
    
    private String mName;
    private double mBalance;

    public Customer(String name, double balance)
    {
        mName = name;
        mBalance = balance;
    }

    public String getName()
    {
        return mName;
    }

    public double getBalance()
    {
        return mBalance;
    }

    public String toString()
    {
        return mName+" "+mBalance;
    }
}
