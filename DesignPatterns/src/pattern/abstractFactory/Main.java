package pattern.abstractFactory;

public class Main {

    public static void main(String[] args) {
        ComputersCompany asus = new Asus();
        Laptop vivoBook = asus.createLaptop();

        ComputersCompany apple = new Apple();
        Computer imac = apple.createComputer();
    }
}
