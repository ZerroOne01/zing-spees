import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PlayerManager playerManager = new PlayerManager();
        MapManager mapManager = new MapManager();
        Inventory itemManager = new Inventory();
        RacingCarManager racingCarManager = new RacingCarManager();
        Game game = new Game(playerManager, mapManager, racingCarManager, itemManager);

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n====== MENU ======");
            System.out.println("1. Quản lý người chơi");
            System.out.println("2. Quản lý map");
            System.out.println("3. Quản lý vật phẩm");
            System.out.println("4. Quản lý xe đua");
            System.out.println("5. Bắt đầu trò chơi");
            System.out.println("6. Thoát");
            System.out.print("Chọn: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    playerManager.displayMenu();
                    break;
                case 2:
                    mapManager.displayMenu();
                    break;
                case 3:
                    itemManager.displayMenu();
                    break;
                case 4:
                    racingCarManager.displayMenu();
                    break;               
                case 5:
                    game.startGame();
                    break;
                case 6:
                    System.out.println("Đã thoát trò chơi...");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (choice != 6);
    }
}
