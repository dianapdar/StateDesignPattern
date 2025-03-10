package VendingMachine;

class OutOfOrderState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine) {
        System.out.println("Vending machine is out of order.");
    }
    
    @Override
    public void insertCoin(VendingMachine machine, int amount) {
        System.out.println("Vending machine is out of order.");
    }
    
    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Vending machine is out of order.");
    }
    
    @Override
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Vending machine is already out of order.");
    }
}