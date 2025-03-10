package VendingMachine;

class VendingMachine {
    private VendingMachineState currentState;
    private int itemInventory;
    private int balance;
    private final int itemPrice = 10;
    
    public VendingMachine(int itemInventory) {
        this.itemInventory = itemInventory;
        this.balance = 0;
        this.currentState = new IdleState();
    }
    
    public void setState(VendingMachineState state) {
        this.currentState = state;
    }
    
    public void selectItem() {
        currentState.selectItem(this);
    }
    
    public void insertCoin(int amount) {
        currentState.insertCoin(this, amount);
    }
    
    public void dispenseItem() {
        currentState.dispenseItem(this);
    }
    
    public void setOutOfOrder() {
        currentState.setOutOfOrder(this);
    }
    
    public void addBalance(int amount) {
        this.balance += amount;
    }
    
    public int getBalance() {
        return balance;
    }
    
    public void setBalance(int balance) {
        this.balance = balance;
    }
    
    public int getItemPrice() {
        return itemPrice;
    }
    
    public void decreaseInventory() {
        if (itemInventory > 0) {
            itemInventory--;
        }
    }
}
