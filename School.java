public class School implements Building {

    private int numberOfFloors;
    private String name;
    private String address;

    // CONSTRUCTORS
    public School() {
    }

    public School(String name, String address, int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
        this.name = name;
        this.address = address;
    }

    // GETTERS & SETTERS
    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // IMPLEMENTS INTERFACE
    @Override
    public void addFloor(int floors) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'addFloor'");
        numberOfFloors += floors;
        System.out.println("Added " + floors + " floors. Total number of floors are " + numberOfFloors + ".");
    }

    @Override
    public void describe() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'describe'");
        System.out.println(name + " is located at " + address + ".");
    }

}
