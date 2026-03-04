public class Car {
    String owner;
    int year;
    String make;
    Car (String owner, String make) {
        this.owner = owner;
        this.make = make;
    }
    public void startEngine(){
        System.out.println(this.owner + " start " + this.make);
    }
}
