import java.util.ArrayList;
import java.util.Scanner;

public class PlayerManager {
    private ArrayList<Player> players;

    public PlayerManager() {
        this.players = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void removePlayer(Player player) {
        players.remove(player);
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public void displayMenu() {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Quản lý Người chơi ===");
            System.out.println("1. Xuất danh sách Người chơi");
            System.out.println("2. Thêm Người chơi mới");
            System.out.println("3. Xóa Người chơi");
            System.out.println("0. Quay lại");
            System.out.print("Chọn: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    displayPlayers();
                    break;
                case 2:
                    addNewPlayer();
                    break;
                case 3:
                    removePlayer();
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

    public void displayPlayers() {
        if (players.isEmpty()) {
            System.out.println("Không có Người chơi nào được thêm.");
            return;
        }
        System.out.println("==== Danh sách Người chơi ====");
        for (int i = 0; i < players.size(); i++) {
            System.out.println("Người chơi " + (i + 1) + ":");
            players.get(i).Xuat(); 
        }
        System.out.println("==============================");
    }


    public void addNewPlayer() {
        Player newPlayer = new Player();
        newPlayer.Nhap(); 
        addPlayer(newPlayer);
        System.out.println("Người chơi đã được thêm vào danh sách.");
    }

    public void removePlayer() {
        if (players.isEmpty()) {
            System.out.println("Danh sách Người chơi rỗng.");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số thứ tự của Người chơi để xóa: ");
        int index = sc.nextInt();

        if (index <= 0 || index > players.size()) {
            System.out.println("Số thứ tự Người chơi không hợp lệ.");
            return;
        }
        Player removedPlayer = players.remove(index - 1);
        System.out.println("Người chơi đã được xóa khỏi danh sách: " + removedPlayer.getName());
    }
}
