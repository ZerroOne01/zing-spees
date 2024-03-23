package du_an_zingspeed;

import java.util.ArrayList;
import java.util.Scanner;

public class Terrain extends RacingObject {
    private String type;
    private int difficulty;
    private double length;
    private ArrayList<String> obstacles;
    // Người dựng các thuộc tính
    public Terrain(int id, String name, String description, String type, int difficulty, double length, ArrayList<String> obstacles) {
        super(id, name, description);
        this.type = type;
        this.difficulty = difficulty;
        this.length = length;
        this.obstacles = obstacles;
    }
    // Phương pháp nhập
    @Override
    public void Nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập địa hình:");
        System.out.print("Nhập ID: ");
        this.type = scanner.nextLine();
        System.out.print("Nhập độ khó: ");
        this.difficulty = scanner.nextInt();
        System.out.print("Nhập độ dài: ");
        this.length = scanner.nextDouble();
        System.out.print("Nhập số chướng ngại vật: ");
        int numObstacles = scanner.nextInt();
        scanner.nextLine(); //Tiêu thụ ký tự dòng mới
        this.obstacles = new ArrayList<>();
        for (int i = 0; i < numObstacles; i++) {
            System.out.print("Chướng ngại vật " + (i + 1)
            		+ ": ");
            String obstacle = scanner.nextLine();
            this.obstacles.add(obstacle);
        }
    }
    // Phương pháp xuất
    @Override
    public void Xuat() {
        System.out.println("Địa hình :");
        System.out.println("ID là: " + getId());
        System.out.println("Tên: " + getName());
        System.out.println("Miêu tả địa hình : " + getDescription());
        System.out.println("Kiểu địa hình: " + type);
        System.out.println("Độ khó: " + difficulty);
        System.out.println("Độ dài: " + length);
        System.out.println("Chướng ngại vật: ");
        for (String obstacle : obstacles) {
            System.out.println("- " + obstacle);
        }
    }
}