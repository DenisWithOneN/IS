package pattern.builder;
public class PCBuilder {

    private int id;
    private String cpu;
    private String gpu;
    private int ram;
    private int storage;
    private int fans;
    private String powerSupply;

    public PCBuilder id(int id) {
        this.id = id;
        return this;
    }

    public PCBuilder cpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    public PCBuilder gpu(String gpu) {
        this.gpu = gpu;
        return this;
    }

    public PCBuilder ram(int ram) {
        this.ram = ram;
        return this;
    }

    public PCBuilder storage(int storage) {
        this.storage = storage;
        return this;
    }

    public PCBuilder fans(int fans) {
        this.fans = fans;
        return this;
    }

    public PCBuilder powerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
        return this;
    }

    public PC build() {
        return new PC(id, cpu, gpu, ram, storage, fans, powerSupply);
    }



    public static void main(String[] args) {
        PC pc = new PCBuilder()
                .id(1)
                .cpu("Intel Core i7")
                .gpu("NVIDIA GeForce RTX 3080")
                .ram(16)
                .storage(512)
                .fans(3)
                .powerSupply("750W")
                .build();

        System.out.println(pc.toString());
    }

}
