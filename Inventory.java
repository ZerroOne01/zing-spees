package du_an_zingspeed;

import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {
    private ArrayList<Item> items;

    // Constructor
    public Inventory() {
        this.items = new ArrayList<>();
        for (Item item : items) {
            item.setInventory(this);
        }
    }

    // Phương thức để thêm một vật phẩm vào danh sách
    public void addItem(Item item) {
        items.add(item);
        item.setInventory(this);
    }

    // Phương thức để xóa một vật phẩm khỏi danh sách
    public void removeItem(Item item) {
        items.remove(item);
        item.setInventory(null); 
    }

    // Phương thức để lấy danh sách các vật phẩm
    public ArrayList<Item> getItems() {
        return items;
    }

    // Phương thức để đặt danh sách các vật phẩm
    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    // Phương thức để hiển thị menu cho quản lý inventory
    public void displayMenu() {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n==== Quản lý Vật phẩm ====");
            System.out.println("1. Xuất danh sách Vật phẩm");
            System.out.println("2. Thêm Vật phẩm");
            System.out.println("3. Xóa Vật phẩm");
            System.out.println("0. Quay lại");
            System.out.print("Chọn: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    displayItems();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    removeItem();
                    break;
                case 0:
                    System.out.println("Quay lại menu trước.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (choice != 0);
    }

    // Phương thức để hiển thị danh sách vật phẩm
    public void displayItems() {
        System.out.println("==== Danh sách Vật phẩm ====");
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ". ");
            items.get(i).Xuat(); 
        }
    }

    // Phương thức để thêm một vật phẩm thông qua nhập từ người dùng
    public void addItem() {
        Scanner sc = new Scanner(System.in);
        Item newItem = new Item();
        newItem.Nhap(); 
        addItem(newItem);
        System.out.println("Vật phẩm đã được thêm vào danh sách.");
    }

    // Phương thức để xóa một vật phẩm thông qua nhập từ người dùng
    public void removeItem() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số thứ tự của vật phẩm để xóa: ");
        int order = sc.nextInt();

        if (order <= 0 || order > items.size()) {
            System.out.println("Số thứ tự vật phẩm không hợp lệ.");
            return;
        }

        Item removedItem = items.remove(order - 1);
        System.out.println("Vật phẩm đã được xóa khỏi danh sách: " + removedItem);
        removedItem.setInventory(null);
    }

    public void useItem(int index, RacingCar car) {
        if (index >= 0 && index < items.size()) {
            Item item = items.get(index);
            System.out.println("Sử dụng vật phẩm: " + item.getName());
          
            item.applyEffect();
           
            item.setQuantity(item.getQuantity() - 1);
            if (item.getQuantity() <= 0) {
                items.remove(item);
            }
        } else {
            System.out.println("Số thứ tự không hợp lệ.");
        }
    }
}
