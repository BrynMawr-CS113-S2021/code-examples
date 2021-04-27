public class Balance {
    
    public static void swap(int i, int j, Customer[] L) {
        Customer tmp = L[i];
        L[i] = L[j];
        L[j] = tmp;
    }
    
    public static void selectionSort(Customer[] L) 
    {
        for (int i = 0; i < L.length; i++) {
            int minIdx = i;
            for (int j = i+1; j < L.length; j++) {
                if (L[j].getBalance() < L[minIdx].getBalance()) {
                    minIdx = j; 
                }
            }
            swap(i, minIdx, L);
        }
    }
    
    public static void main(String[] args) {
        // Read in balances.csv
        In file = new In("balances.csv");
        String[] lines = file.readAllLines();
        Customer[] customers = new Customer[lines.length];
        for (int i = 0; i < lines.length; i++) {
            String line = lines[i];
            String[] tokens = line.split(",");
            
            String name = tokens[0].trim();
            double balance = Double.parseDouble(tokens[1]);
            Customer customer = new Customer(name, balance);
            customers[i] = customer; // ok
            
        }
        
        // sort balance from least to most
        selectionSort(customers);
        
        // print the list of customers
        for (int i = 0; i < customers.length; i++) {
            System.out.println(customers[i]);
        }
    }
}
