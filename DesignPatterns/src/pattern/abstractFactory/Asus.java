package pattern.abstractFactory;

public class Asus extends ComputersCompany {

    @Override
    public Computer createComputer() {
        return new AsusComputer();
    }

    @Override
    public Laptop createLaptop() {
        return new AsusLaptop();
    }
}
