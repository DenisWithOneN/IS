package pattern.builder;

public class PC {
    private final int id;
    private final String cpu;
    private final String gpu;
    private final int ram;
    private final int storage;
    private final int fans;
    private final String powerSupply;

     PC(int id, String cpu, String gpu, int ram, int storage, int fans, String powerSupply) {
        this.id = id;
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
        this.storage = storage;
        this.fans = fans;
        this.powerSupply = powerSupply;
    }

    @Override
    public String toString() {
        return "PCBuilder{" +
                "id=" + id +
                ", cpu='" + cpu + '\'' +
                ", gpu='" + gpu + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                ", fans=" + fans +
                ", powerSupply='" + powerSupply + '\'' +
                '}';
    }



}
