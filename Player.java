package du_an_zingspeed;

import java.util.ArrayList;
import java.util.Scanner;

package du_an_zingspeed;

import java.util.ArrayList;
import java.util.Scanner;

public class Player extends RacingObject {
    private int level;
    private RacingCar currentCar;
    private ArrayList<Item> inventory;

    // Hàm tạo
    public Player(int id, String name, String description, int level, RacingCar currentCar, ArrayList<Item> inventory) {
        super(id, name, description);
        this.level = level;
        this.currentCar = currentCar;
        this.inventory = inventory;
    }

    // Phương thức nhập
    @Override
    public void Nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin người chơi:");
        System.out.print("Cấp độ: ");
        this.level = scanner.nextInt();
        // Tiêu thụ ký tự xuống dòng
        scanner.nextLine();
        System.out.print("Chi tiết xe đua hiện tại:\n");
        currentCar.Xuat();
        System.out.print("Nhập số lượng vật phẩm trong kho: ");
        int numItems = scanner.nextInt();
        scanner.nextLine(); // Tiêu thụ ký tự xuống dòng
        this.inventory = new ArrayList<>();
        for (int i = 0; i < numItems; i++) {
            System.out.println("Nhập chi tiết cho vật phẩm " + (i + 1) + ":");
            Item item = new Item(getDescription(), getDescription(), i, i);
            item.Nhap();
            this.inventory.add(item);
        }
    }

    // Phương thức hiển thị
    @Override
    public void Xuat() {
        System.out.println("Thông tin người chơi:");
        System.out.println("ID: " + getId());
        System.out.println("Tên: " + getName());
        System.out.println("Mô tả: " + getDescription());
        System.out.println("Cấp độ: " + level);
        System.out.println("Xe đua hiện tại:");
        currentCar.Xuat();
        System.out.println("Kho vật phẩm:");
        for (Item item : inventory) {
            item.Xuat();
        }
    }
}
