package du_an_zingspeed;
import java.util.ArrayList;
import java.util.Scanner;

public class MapManager {
    private ArrayList<Terrain> terrains;

    // Constructor
    public MapManager() {
        this.terrains = new ArrayList<>();
    }

    // Getter cho terrains
    public ArrayList<Terrain> getTerrains() {
        return terrains;
    }

    // Setter cho terrains
    public void setTerrains(ArrayList<Terrain> terrains) {
        this.terrains = terrains;
    }

    public void displayMenu() {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n==== Quản lý Terrain ====");
            System.out.println("1. Xuất danh sách Map");
            System.out.println("2. Xuất thông tin chi tiết của một Map");
            System.out.println("3. Thêm Map mới");
            System.out.println("4. Xóa Map");
            System.out.println("0. Quay lại");
            System.out.print("Chọn: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    displayMaps();
                    break;
                case 2:
                    displayMapDetails();
                    break;
                case 3:
                	addMap();
                    break;
                case 4:
                	removeMap();
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

    public void displayMaps() {
        if (terrains.isEmpty()) {
            System.out.println("Không có Map nào được thêm.");
            return;
        }
        System.out.println("==== Danh sách Map ====");
        for (int i = 0; i < terrains.size(); i++) {
            System.out.println("Map " + (i + 1) + ": " + terrains.get(i).getName());
        }
    }
    
    public void displayMapDetails() {
        if (terrains.isEmpty()) {
            System.out.println("Danh sách Map rỗng.");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số thứ tự của Map để xem thông tin chi tiết: ");
        int mapIndex = sc.nextInt();
        sc.nextLine(); 

        if (mapIndex <= 0 || mapIndex > terrains.size()) {
            System.out.println("Số thứ tự Map không hợp lệ.");
            return;
        }

        System.out.println("Thông tin chi tiết của Map " + mapIndex + ":");
        terrains.get(mapIndex - 1).Xuat();
    }
    
    public void addMap() {
        Terrain newMap = new Terrain();
        newMap.Nhap(); 
        terrains.add(newMap);
        System.out.println("Map mới đã được thêm vào danh sách.");

        System.out.println("\nDanh sách Map đã nhập:");
        displayMaps();
    }

    public void removeMap() {
        if (terrains.isEmpty()) {
            System.out.println("Danh sách Map rỗng.");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số thứ tự của Map để xóa: ");
        int mapIndex = sc.nextInt();
        sc.nextLine();

        if (mapIndex <= 0 || mapIndex > terrains.size()) {
            System.out.println("Số thứ tự Map không hợp lệ.");
            return;
        }

        Terrain removedMap = terrains.remove(mapIndex - 1);
        System.out.println("Map đã được xóa khỏi danh sách: " + removedMap.getName());
    }
}
