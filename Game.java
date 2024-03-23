package du_an_zingspeed;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private ArrayList<Player> players;
    private Terrain currentTerrain;
    private int timeLimit;
    private Player winner;

    // Constructor
    public Game(ArrayList<Player> players, Terrain currentTerrain, int timeLimit, Player winner) {
        this.players = players;
        this.currentTerrain = currentTerrain;
        this.timeLimit = timeLimit;
        this.winner = winner;
    }

    // Phương thức nhập
    public void Nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chi tiết Game:");
        System.out.print("Giới hạn thời gian: ");
        this.timeLimit = scanner.nextInt();
        scanner.nextLine(); // Bỏ qua ký tự dòng mới
        System.out.print("Chi tiết địa hình hiện tại:\n");
        currentTerrain.Nhap();
        System.out.print("Nhập số lượng người chơi: ");
        int soLuongNguoiChoi = scanner.nextInt();
        scanner.nextLine(); // Bỏ qua ký tự dòng mới
        this.players = new ArrayList<>();
        for (int i = 0; i < soLuongNguoiChoi; i++) {
            System.out.println("Nhập chi tiết cho Người chơi " + (i + 1) + ":");
            Player nguoiChoi = new Player(i, null, null, i, null, null);
            nguoiChoi.Nhap();
            this.players.add(nguoiChoi);
        }
    }

    // Phương thức xuất
    public void Xuat() {
        System.out.println("Chi tiết Game: ");
        System.out.println("Giới hạn thời gian: " + timeLimit);
        System.out.println("Địa hình hiện tại: ");
        currentTerrain.Xuat();
        System.out.println("Người chơi: ");
        for (Player nguoiChoi : players) {
            nguoiChoi.Xuat();
        }
        System.out.println("Người chơi chiến thắng: ");
        if (winner != null) {
            winner.Xuat();
        } else {
            System.out.println("Người chơi thua cuộc: ");
        }
    }
}
