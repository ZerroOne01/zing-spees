package du_an_zingspeed;

import java.util.Scanner;

public class Item extends RacingObject implements Effectable {
    private String effect;
    private int duration;
    private int quantity;

    public Item(String name, String effect, int duration, int quantity) {
        super(0, name, ""); // Khởi tạo với giá trị mặc định, ID và mô tả có thể được đặt riêng
        this.effect = effect;
        this.duration = duration;
        this.quantity = quantity;
    }

    // Thực hiện phương thức từ giao diện Effectable
    @Override
    public void applyEffect() {
        // Thực hiện
    }

    // Các phương thức get và set cho các thuộc tính đặc biệt của Item
    public String getEffect() {
        return effect;
    }

    public int getDuration() {
        return duration;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    @Override
    public void Nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chi tiết vật phẩm: ");
        System.out.print("Hiệu ứng: ");
        this.effect = scanner.nextLine();
        System.out.print("Thời gian tồn tại: ");
        this.duration = scanner.nextInt();
        System.out.print("Số lượng: ");
        this.quantity = scanner.nextInt();
    }

    // Phương thức hiển thị
    @Override
    public void Xuat() {
        System.out.println("Chi tiết vật phẩm:");
        System.out.println("ID: " + getId());
        System.out.println("Tên: " + getName());
        System.out.println("Mô tả: " + getDescription());
        System.out.println("Hiệu ứng: " + effect);
        System.out.println("Thời gian tồn tại: " + duration);
        System.out.println("Số lượng: " + quantity);
    }
}
