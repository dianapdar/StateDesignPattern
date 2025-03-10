package VendingMachine;

public class VendingMachineDemo {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine(5);
        
        machine.selectItem();
        machine.insertCoin(5);
        machine.insertCoin(5);
        machine.selectItem(); // Should not be allowed
        machine.setOutOfOrder();
        machine.insertCoin(10); // Should not be allowed
    }
}