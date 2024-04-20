package du_an_zingspeed;

import java.util.ArrayList;
import java.util.Scanner;

public class RacingCarManager {
    private ArrayList<RacingCar> racingCars;

    public RacingCarManager() {
        this.racingCars = new ArrayList<>();
    }

    // Getter và Setter cho racingCars
    public ArrayList<RacingCar> getRacingCars() {
        return racingCars;
    }

    public void setRacingCars(ArrayList<RacingCar> racingCars) {
        this.racingCars = racingCars;
    }

    public void displayMenu() {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n==== Quản lý Xe đua ====");
            System.out.println("1. Xuất danh sách Xe đua");
            System.out.println("2. Xuất thông tin chi tiết của xe đua");
            System.out.println("3. Thêm Xe đua");
            System.out.println("4. Xóa Xe đua");
            System.out.println("0. Quay lại");
            System.out.print("Chọn: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    displayRacingCars();
                    break;
                case 2:
                    displayCarDetails();
                    break;
                case 3:
                    addRacingCar();
                    break;
                case 4:
                    removeRacingCar();
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

    public void displayRacingCars() {
        if (racingCars.isEmpty()) {
            System.out.println("Không có Xe đua nào được thêm.");
            return;
        }
        System.out.println("==== Danh sách Xe đua ====");
        for (int i = 0; i < racingCars.size(); i++) {
            System.out.println("Xe " + (i + 1) + ": " + "Tên: " +racingCars.get(i).getName() + ", ngoại trang: " +racingCars.get(i).getModel());
        }
    }
    
    public void displayCarDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số thứ tự của Xe đua để hiển thị chi tiết: ");
        int index = sc.nextInt();

        if (index <= 0 || index > racingCars.size()) {
            System.out.println("Số thứ tự Xe đua không hợp lệ.");
            return;
        }

        RacingCar selectedCar = racingCars.get(index - 1);
        selectedCar.Xuat();
    }

    public void addRacingCar() {
        RacingCar newRacingCar = new RacingCar();
        newRacingCar.Nhap();
        racingCars.add(newRacingCar);
        System.out.println("Xe đua đã được thêm vào danh sách.");
    }

    public void removeRacingCar() {
        if (racingCars.isEmpty()) {
            System.out.println("Danh sách Xe đua rỗng.");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số thứ tự của Xe đua để xóa: ");
        int index = sc.nextInt();

        if (index <= 0 || index > racingCars.size()) {
            System.out.println("Số thứ tự Xe đua không hợp lệ.");
            return;
        }

        RacingCar removedRacingCar = racingCars.remove(index - 1);
        System.out.println("Xe đua đã được xóa khỏi danh sách: " + removedRacingCar.getModel());
    }

}
