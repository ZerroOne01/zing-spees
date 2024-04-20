import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private Player selectedPlayer;
    private PlayerManager playerManager;
    private Terrain selectedMap;
    private MapManager mapManager;
    private RacingCar selectedCar;
    private RacingCarManager racingCarManager;
    private Inventory inventory;

    public Game(PlayerManager playerManager, MapManager mapManager, RacingCarManager racingCarManager, Inventory inventory) {
        this.playerManager = playerManager;
        this.mapManager = mapManager;
        this.racingCarManager = racingCarManager;
        this.inventory = inventory;
    }

    public void startGame() {
        selectPlayer();
        selectMap();
        selectCar();
        controlCar();
        displayWinnersAndLosers();
    }

    void selectPlayer() {
        playerManager.displayPlayers();

        Scanner sc = new Scanner(System.in);
        System.out.print("Chọn người chơi (Nhập số thứ tự): ");
        int index = sc.nextInt();

        ArrayList<Player> players = playerManager.getPlayers();

        if (index >= 1 && index <= players.size()) {
            selectedPlayer = players.get(index - 1);
            System.out.println("Bạn đã chọn người chơi: " + selectedPlayer.getName());
        } else {
            System.out.println("Số thứ tự không hợp lệ.");
        }
    }

    void selectMap() {
        mapManager.displayMaps();

        Scanner sc = new Scanner(System.in);
        System.out.print("Chọn map (Nhập số thứ tự): ");
        int index = sc.nextInt();

        ArrayList<Terrain> terrains = mapManager.getTerrains();

        if (index >= 1 && index <= terrains.size()) {
            selectedMap = terrains.get(index - 1);
            System.out.println("Bạn đã chọn map: " + selectedMap.getName());
        } else {
            System.out.println("Số thứ tự không hợp lệ.");
        }
    }

    void selectCar() {
        racingCarManager.displayRacingCars();

        Scanner sc = new Scanner(System.in);
        System.out.print("Chọn xe đua (Nhập số thứ tự): ");
        int index = sc.nextInt();

        ArrayList<RacingCar> racingCars = racingCarManager.getRacingCars();

        if (index >= 1 && index <= racingCars.size()) {
            selectedCar = racingCars.get(index - 1);
            System.out.println("Bạn đã chọn xe: " + selectedCar.getName());
        } else {
            System.out.println("Số thứ tự không hợp lệ.");
        }
    }

    void useItemFromInventory() {
        inventory.displayItems();

        Scanner sc = new Scanner(System.in);
        System.out.print("Chọn vật phẩm để sử dụng (Nhập số thứ tự): ");
        int index = sc.nextInt();

        inventory.useItem(index - 1, selectedCar);
    }

    private void controlCar() {
        if (selectedCar == null) {
            System.out.println("Không có xe được chọn.");
            return;
        }

        Scanner sc = new Scanner(System.in);
        String choice;

        do {
            System.out.println("\n==== Điều khiển Xe ====");
            System.out.println("w. Tăng tốc");
            System.out.println("s. Phanh");
            System.out.println("a. Rẽ trái");
            System.out.println("d. Rẽ phải");
            System.out.println("r. Dừng");
            System.out.println("i. Mở kho và sử dụng vật phẩm");
            System.out.println("0. Thoát");
            System.out.print("Chọn hành động: ");
            choice = sc.next().toLowerCase();

            switch (choice) {
                case "w":
                    selectedCar.accelerate();
                    break;
                case "s":
                    selectedCar.brake();
                    break;
                case "a":
                    selectedCar.steerLeft();
                    break;
                case "d":
                    selectedCar.steerRight();
                    break;
                case "r":
                    selectedCar.stop();
                    break;
                case "i":
                    useItemFromInventory();
                    break;
                case "0":
                    System.out.println("Thoát khỏi điều khiển xe.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (!choice.equals("0"));
    }

    private void displayWinnersAndLosers() {
        Player winner = selectRandomWinner();
        if (winner != null) {
            System.out.println("Người chơi chiến thắng: " + winner.getName());
            playerManager.removePlayer(winner);
            } else {
                System.out.println("Không còn người chơi nào.");
            }
        }

    private Player selectRandomWinner() {
        ArrayList<Player> players = playerManager.getPlayers();
        if (players.isEmpty()) {
            System.out.println("Không có người chơi.");
            return null;
        }

        Random random = new Random();
        int index = random.nextInt(players.size());
        return players.get(index);
    }
}
