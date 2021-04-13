class VendingMachine {

    private Snack[] mSnacks = null;

    public VendingMachine(String filename) {

        In snackFile = new In(filename); 
        int numSnacks = snackFile.readInt();

        mSnacks = new Snack[numSnacks];
        //System.out.println(numSnacks);
        for (int i = 0; i < numSnacks; i++) {
            String name = snackFile.readString();
            int qty = snackFile.readInt();
            int cost = snackFile.readInt();
            String desc = snackFile.readString();
            //System.out.printf("%s (%s) qnty:%d cost:%d\n", name, desc, qty, cost);
            mSnacks[i] = new Snack(name, desc, qty, cost);
        }
    }

    // list contents of the vending machine
    public void display() {
        for (int i = 0; i < mSnacks.length; i++) {
            Snack snack = mSnacks[i];
            System.out.printf("%d) %s\n", i, snack);
        }
    }

    // buy an item in the vending machine
    public void buy(int snackId, double money) {

        if (snackId < 0 && snackId >= mSnacks.length) {
            System.out.println("Invalid snack ID: "+snackId);
            return;
        }

        Snack snack = mSnacks[snackId];
        if (snack.getQuantity() == 0) {
            System.out.println("Out of stock!");
            return;
        }

        if (money < snack.getCost()) {
            System.out.println("You can't afford this!");
            return;
        }

        snack.buy();
        System.out.println("You bought "+snack);
    }

    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine("snacks.txt");
        vm.display();

        int snackId = Integer.parseInt(args[0]);
        double moneyAmount = Double.parseDouble(args[1]);
        vm.buy(snackId, moneyAmount);

        System.out.println(vm.mSnacks[0].getName());
    }
}