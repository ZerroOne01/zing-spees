import java.util.Scanner;

public class RacingCar extends RacingObject implements Moveable {
    private double speed;
    private double acceleration;
    private int durability;
    private double handling;
    private String model;
    private double nitroCapacity;

    public RacingCar() {
        super(0, "", ""); 
        this.speed = 0;
        this.acceleration = 0;
        this.durability = 100; 
        this.handling = 0;
        this.model = "";
        this.nitroCapacity = 0; 
    }

    public RacingCar(int id, String name, String description, double speed, double acceleration, int durability, double handling, String model, double nitroCapacity) {
        super(id, name, description);
        this.speed = speed;
        this.acceleration = acceleration;
        this.durability = durability;
        this.handling = handling;
        this.model = model;
        this.nitroCapacity = nitroCapacity;
    }

    // Triển khai các phương thức từ interface Moveable
    @Override
    public void accelerate() {
        System.out.println("Tăng tốc...");
    }

    @Override
    public void brake() {
        System.out.println("Phanh xe...");
    }

    @Override
    public void steerLeft() {
        System.out.println("Lái sang trái...");
    }

    @Override
    public void steerRight() {
        System.out.println("Lái sang phải...");
    }

    @Override
    public void stop() {
        System.out.println("Xe đã dừng...");
    }

    // Getters và setters 
    public double getSpeed() {
        return speed;
    }

    public double getAcceleration() {
        return acceleration;
    }

    public int getDurability() {
        return durability;
    }

    public double getHandling() {
        return handling;
    }

    public String getModel() {
        return model;
    }

    public double getNitroCapacity() {
        return nitroCapacity;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setAcceleration(double acceleration) {
        this.acceleration = acceleration;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public void setHandling(double handling) {
        this.handling = handling;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setNitroCapacity(double nitroCapacity) {
        this.nitroCapacity = nitroCapacity;
    }

    // Phương thức nhập 
    @Override
    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chi tiết xe đua:");
        System.out.print("ID: ");
        this.setId(sc.nextInt());
        sc.nextLine(); 
        System.out.print("Tên chiếc xe: ");
        this.setName(sc.nextLine());
        System.out.print("Miêu tả chiếc xe: ");
        this.setDescription(sc.nextLine());
        System.out.print("Nhập tốc độ: ");
        this.speed = sc.nextDouble();
        System.out.print("Nhập tăng tốc: ");
        this.acceleration = sc.nextDouble();
        System.out.print("Nhập độ bền: ");
        this.durability = sc.nextInt();
        System.out.print("Nhập Xử lý điều khiển xe: ");
        this.handling = sc.nextDouble();
        sc.nextLine();
        System.out.print("Nhập trang phục xe: ");
        this.model = sc.nextLine();
        System.out.print("Nhập tốc độ nitro: ");
        this.nitroCapacity = sc.nextDouble();
    }

    // Phương thức xuất
    @Override
    public void Xuat() {
        System.out.println("Chi tiết xe đua:");
        System.out.println("ID: " + getId());
        System.out.println("Tên chiếc xe: " + getName());
        System.out.println("Miêu tả chiếc xe: " + getDescription());
        System.out.println("Tốc độ: " + speed);
        System.out.println("Tăng tốc: " + acceleration);
        System.out.println("Độ bền: " + durability);
        System.out.println("Xử lý điều khiển: " + handling);
        System.out.println("Trang phục: " + model);
        System.out.println("Tăng tốc nitro: " + nitroCapacity);
    }
}
