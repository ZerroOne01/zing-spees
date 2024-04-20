import java.util.ArrayList;
import java.util.Scanner;

public class Terrain extends RacingObject {
    private String type;
    private int difficulty;
    private double length;

    // Constructor có tham số
    public Terrain(int id, String name, String description, String type, int difficulty, double length, ArrayList<String> obstacles) {
        super(id, name, description);
        this.type = type;
        this.difficulty = difficulty;
        this.length = length;
    }

    // Constructor không tham số
    public Terrain() {
        super(0, "", ""); 
        this.type = "";
        this.difficulty = 0;
        this.length = 0.0;
    }

    // Getter và setter
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    // Phương thức nhập
    @Override
    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập địa hình:");
        System.out.print("Nhập ID: ");
        this.setId(sc.nextInt());
        sc.nextLine();
        System.out.print("Nhập tên địa hình: ");
        this.setName(sc.nextLine());
        System.out.print("Miêu tả địa hình: ");
        this.setDescription(sc.nextLine());
        System.out.print("Nhập kiểu địa hình: ");
        this.type = sc.nextLine();
        System.out.print("Nhập độ khó: ");
        this.difficulty = sc.nextInt();
        System.out.print("Nhập độ dài (km): ");
        this.length = sc.nextDouble();   
    }

    // Phương thức xuất
    @Override
    public void Xuat() {
        System.out.println("Địa hình:");
        System.out.println("ID là: " + getId());
        System.out.println("Tên địa hình: " + getName());
        System.out.println("Miêu tả địa hình: " + getDescription());
        System.out.println("Kiểu địa hình: " + type);
        System.out.println("Độ khó: " + difficulty);
        System.out.println("Độ dài: " + length + "km");
    }
}
