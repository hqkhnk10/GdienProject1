package Tuan33;


//Ngo Quang Truong -20198265
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TuyenSinh managerThiSinh = new TuyenSinh();
        while (true) {
            System.out.println("Danh sach Thi Sinh");
            System.out.println("Nhan 1: Them Thi Sinh");
            System.out.println("Nhan 2: Hien thong tin ThiSinh: ");
            System.out.println("Nhan 3: Tim kiem ThiSinh bang id");
            System.out.println("Nhan 4: De exit:");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    System.out.println("Nhan a: Them ThiSinh A");
                    System.out.println("Nhan b: Them ThiSinh B");
                    System.out.println("Nhan c: Them ThiSinh C");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "a": {
                            managerThiSinh.add(ThemThiSinh(scanner, "a"));
                            break;

                        }
                        case "b": {
                            managerThiSinh.add(ThemThiSinh(scanner, "b"));
                            break;
                        }
                        case "c": {
                            managerThiSinh.add(ThemThiSinh(scanner, "c"));
                            break;
                        }
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                }
                case "2": {
                    managerThiSinh.showInfor();
                    break;
                }
                case "3": {
                    System.out.print("Nhan ID: ");
                    int id = scanner.nextInt();
                    ThiSinh ThiSinh = managerThiSinh.searchById(id);
                    if (ThiSinh == null) {
                        System.out.println("Not found");
                    } else {
                        System.out.println(ThiSinh.toString());
                    }
                    break;
                }
                case "4": {
                    return;
                }
                default:
                    System.out.println("Invalid");
                    continue;
            }

        }
    }

    public static ThiSinh ThemThiSinh(Scanner scanner, String type) {
        System.out.print("Nhan ID: ");
        int id = scanner.nextInt();
        System.out.print("Nhan name: ");
        String name = scanner.nextLine();
        System.out.print("Nhan address: ");
        String address = scanner.nextLine();
        System.out.print("Nhan Priotity: ");
        int priority = scanner.nextInt();
        scanner.nextLine();
        if (type.equals("a")) {
            return new ThiSinhA(id, name, address, priority);
        } else if (type.equals("b")) {
            return new ThiSinhB(id, name, address, priority);
        } else {
            return new ThiSinhC(id, name, address, priority);
        }

    }
}