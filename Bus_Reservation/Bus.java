package Bus_Reservation;

public class Bus {
    protected int Bus_No;
    protected boolean AC;
    protected int capacity;

    public Bus(int bus_No, boolean AC, int capacity) {
        Bus_No = bus_No;
        this.AC = AC;
        this.capacity = capacity;
    }

    public int getBus_No() {
        return Bus_No;
    }

    public void setBus_No(int bus_No) {
        Bus_No = bus_No;
    }

    public boolean isAC() {
        return AC;
    }

    public void setAC(boolean AC) {
        this.AC = AC;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    void display(){
        System.out.println(" Bus_No: "+ Bus_No+"\n AC: "+AC+"\n Capacity: "+capacity);
    }
}
