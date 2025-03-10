package VendingMachine;
class DispensingState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine) {
        System.out.println("Currently dispensing. Please wait.");
    }
    
    @Override
    public void insertCoin(VendingMachine machine, int amount) {
        System.out.println("Cannot insert coin. Currently dispensing.");
    }
    
    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Dispensing item...");
        machine.decreaseInventory();
        machine.setBalance(0);
        System.out.println("Item dispensed. Returning to idle state.");
        machine.setState(new IdleState());
    }
    
    @Override
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Vending machine is now out of order.");
        machine.setState(new OutOfOrderState());
    }
}