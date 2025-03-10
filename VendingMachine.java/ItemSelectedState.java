package VendingMachine;

class ItemSelectedState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine) {
        System.out.println("Item selected. Insert coins to continue.");
    }
    
    @Override
    public void insertCoin(VendingMachine machine, int amount) {
        machine.addBalance(amount);
        System.out.println("Inserted: " + amount + ". Current balance: " + machine.getBalance());
        
        if (machine.getBalance() >= machine.getItemPrice()) {
            machine.setState(new DispensingState());
            machine.dispenseItem();
        }
    }
    
    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Insert coins first.");
    }
    
    @Override
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Vending machine is now out of order.");
        machine.setState(new OutOfOrderState());
    }
}
