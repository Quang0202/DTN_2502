package frontend;

import backend.controllers.AccountController;
import backend.controllers.DepartmentController;
import backend.controllers.PositionController;
import backend.repositories.DepartmentRepository;
import backend.repositories.PositionRepository;
import backend.services.AccountService;
import entity.Account;
import entity.Position;

import java.time.LocalDate;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AccountController accountController = new AccountController();
        DepartmentController departmentController = new DepartmentController();
        PositionController positionController = new PositionController();
        int id;
        int choice;
        while (true){
            printMenu();
            while(true){
                if(scanner.hasNextInt()){
                    choice = scanner.nextInt();
                    scanner.nextLine();
                    break;
                } else {
                    System.out.print("Mời nhập lại: ");
                    scanner.next();
                }
            }
            switch (choice){
                case 1:
                    Account account = new Account();
                    System.out.print("Nhập email: ");
                    account.setEmail(scanner.nextLine());
                    System.out.print("Nhập username: ");
                    account.setUsername(scanner.nextLine());
                    System.out.print("Nhập full name: ");
                    account.setFullName(scanner.nextLine());
                    System.out.print("Nhập department id: ");
                    int departmentId = scanner.nextInt();
                    scanner.nextLine();
                    while (departmentController.getDepartmentByID(departmentId) == null){
                        System.out.print("Department không tồn tại, nhập lại department id: ");
                        departmentId = scanner.nextInt();
                        scanner.nextLine();
                    }
                    account.setDepartment(departmentController.getDepartmentByID(departmentId));
                    System.out.print("Nhập position id: ");
                    int position_id = scanner.nextInt();
                    scanner.nextLine();
                    while (positionController.getPositionByID(position_id) == null){
                        System.out.print("Position không tồn tại, nhập lại position id: ");
                        position_id = scanner.nextInt();
                        scanner.nextLine();
                    }
                    account.setPosition(positionController.getPositionByID(position_id));
                    account.setCreateDate(LocalDate.now());
                    accountController.createAccount(account);
                    break;
                case 2:
                    for (Account a : accountController.getListAccounts()){
                        System.out.println(a);
                    }
                    break;
                case 3:
                    System.out.print("Enter account id: ");
                    while(true){
                        if(scanner.hasNextInt()){
                            id = scanner.nextInt();
                            scanner.nextLine();
                            break;
                        } else {
                            System.out.print("Enter account id again: ");
                            scanner.next();
                        }
                    }
                    System.out.println(accountController.getAccountByID(id));
                    break;
                case 4:
                    System.out.print("Enter account id: ");
                    while(true){
                        if(scanner.hasNextInt()){
                            id = scanner.nextInt();
                            scanner.nextLine();
                            break;
                        } else {
                            System.out.print("Enter account id again: ");
                            scanner.next();
                        }
                    }
                    System.out.println("Account is exist: " + accountController.isAccountExists(id));
                    break;
                case 5:
                    accountController.updateUsername();
                    break;
                case 6:
                    System.out.print("Enter account id: ");
                    while(true){
                        if(scanner.hasNextInt()){
                            id = scanner.nextInt();
                            scanner.nextLine();
                            break;
                        } else {
                            System.out.print("Enter account id again: ");
                            scanner.next();
                        }
                    }
                    accountController.deleteAccount(id);
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("This selection is invalid.");
            }
        }
    }
    public static void printMenu(){
        System.out.println("*----------------------Menu----------------------*");
        System.out.println("| 1. Create account                              |");
        System.out.println("| 2. List accounts                               |");
        System.out.println("| 3. Get account by id                           |");
        System.out.println("| 4. Account exists                              |");
        System.out.println("| 5. Update account by id                        |");
        System.out.println("| 6. Delete account                              |");
        System.out.println("| 7. Exit                                        |");
        System.out.println("*------------------------------------------------*");
        System.out.print("Select function: ");
    }
}
