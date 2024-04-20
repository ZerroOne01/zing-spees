import java.util.Scanner;

public class Item extends RacingObject implements Effectable {
    private String effect;
    private int duration;
    private int quantity;
    private Inventory inventory; 

    public Item() {
        super(0, "", ""); 
        this.effect = "";
        this.duration = 0;
        this.quantity = 0;
        this.inventory = null;
    }
    
    public Item(String name, String effect, int duration, int quantity) {
        super(0, name, ""); 
        this.effect = effect;
        this.duration = duration;
        this.quantity = quantity;
        this.inventory = null;
    }

    // Thực hiện phương thức từ interface Effectable
    @Override
    public void applyEffect() {
        // Thực hiện hiệu ứng của vật phẩm ở đây
        System.out.println("Áp dụng hiệu ứng của vật phẩm: " + effect);
    }

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

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
    
    @Override
    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chi tiết vật phẩm:");
        System.out.println("ID: ");
        this.setId(sc.nextInt());
        System.out.println("Tên vật phẩm: ");
        sc.nextLine(); 
        this.setName(sc.nextLine());
        System.out.println("Mô tả vật phẩm: ");
        this.setDescription(sc.nextLine());
        System.out.print("Hiệu ứng: ");
        this.effect = sc.nextLine();
        System.out.print("Thời gian tồn tại (giây): ");
        this.duration = sc.nextInt();
        System.out.print("Số lượng (cái) : ");
        this.quantity = sc.nextInt();
    }

    @Override
    public void Xuat() {
        System.out.println("Chi tiết vật phẩm:");
        System.out.println("ID: " + getId());
        System.out.println("Tên vật phẩm: " + getName());
        System.out.println("Mô tả vật phẩm: " + getDescription());
        System.out.println("Hiệu ứng: " + effect);
        System.out.println("Thời gian tồn tại: " + duration + "giây");
        System.out.println("Số lượng: " + quantity + "cái");
    }
}
