import java.util.Scanner;

public class Player extends RacingObject {
    private int level;
    private RacingCar currentCar;
    private Inventory inventory;

    public Player() {
        super(0, "", "");
        this.level = 0;
        this.currentCar = null;
        this.inventory = null;
    }

    
    public Player(int id, String name, String description, int level, RacingCar currentCar, Inventory inventory) {
        super(id, name, description);
        this.level = level;
        this.currentCar = currentCar;
        this.inventory = inventory;
    }

    public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public RacingCar getCurrentCar() {
		return currentCar;
	}

	public void setCurrentCar(RacingCar currentCar) {
		this.currentCar = currentCar;
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
	    System.out.println("Nhập thông tin người chơi:");
	    System.out.println("ID: ");
	    this.setId(sc.nextInt());
	    sc.nextLine(); 
	    System.out.println("Tên: ");
	    this.setName(sc.nextLine());
	    System.out.println("Mô tả: ");
	    this.setDescription(sc.nextLine());
	    System.out.print("Cấp độ: ");
	    this.level = sc.nextInt();
	    sc.nextLine(); 
	}


    @Override
    public void Xuat() {
        System.out.println("Thông tin người chơi:");
        System.out.println("ID: " + getId());
        System.out.println("Tên: " + getName());
        System.out.println("Mô tả: " + getDescription());
        System.out.println("Cấp độ: " + level);
        if (currentCar != null) {
            System.out.println("Xe đua hiện tại:");
            currentCar.Xuat(); 
        } else {
            System.out.println("Không có thông tin về xe đua hiện tại.");
        }
        if (inventory != null) {
            System.out.println("Kho vật phẩm:");
            inventory.displayItems(); 
        } else {
            System.out.println("Không có thông tin về kho vật phẩm.");
        }
    }
}
