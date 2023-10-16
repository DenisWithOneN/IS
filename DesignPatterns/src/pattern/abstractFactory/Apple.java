package pattern.abstractFactory;

public class Apple extends ComputersCompany {

    @Override
    public Computer createComputer() {
        return new AppleComputer();
    }

    @Override
    public Laptop createLaptop() {
        return new AppleLaptop();
    }
}
