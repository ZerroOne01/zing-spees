package du_an_zingspeed;

import java.util.Scanner;

public class RacingCar extends RacingObject implements Moveable {
    private double speed;
    private double acceleration;
    private int durability;
    private double handling;
    private String model;
    private double nitroCapacity;
 
    public RacingCar(double speed, double acceleration, int durability, double handling, String model, double nitroCapacity) {
        super(0, "", ""); // Khởi tạo với các giá trị mặc định, ID, tên và mô tả có thể được đặt riêng
        this.speed = speed;
        this.acceleration = acceleration;
        this.durability = durability;
        this.handling = handling;
        this.model = model;
        this.nitroCapacity = nitroCapacity;
    }
 
    // Triển khai các phương thức từ giao diện Moveable
    @Override
    public void accelerate() {
        // Thực hiện
    }
 
    @Override
    public void brake() {
        // Thực hiện
    }
 
    @Override
    public void steerLeft() {
        // Thực hiện
    }
 
    @Override
    public void steerRight() {
        // Thực hiện
    }
 
    @Override
    public void stop() {
        // Thực hiện
    }
 
    // Getters và setters cho các thuộc tính dành riêng cho RacingCar
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
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter RacingCar details:");
    System.out.print("Nhập tốc độ: ");
    this.speed = scanner.nextDouble();
    System.out.print("Nhập tăng tốc: ");
    this.acceleration = scanner.nextDouble();
    System.out.print("Nhập độ bền: ");
    this.durability = scanner.nextInt();
    System.out.print("Nhập điều khiển xe: ");
    this.handling = scanner.nextDouble();
    System.out.print("Nhập trang phục xe: ");
    this.model = scanner.next();
    System.out.print("Nhập tốc độ nitro: ");
    this.nitroCapacity = scanner.nextDouble();
}
 
// phương pháp xuất
@Override
public void Xuat() {
    System.out.println("RacingCar details:");
    System.out.println("ID: " + getId());
    System.out.println("Tên: " + getName());
    System.out.println("Miêu tả chiếc xe: " + getDescription());
    System.out.println("Tốc độ: " + speed);
    System.out.println("Tăng tốc: " + acceleration);
    System.out.println("Độ bền: " + durability);
    System.out.println("Các nút điều khiển: " + handling);
    System.out.println("Trang phục: " + model);
    System.out.println("Tăng tốc nitro: " + nitroCapacity);
}
}