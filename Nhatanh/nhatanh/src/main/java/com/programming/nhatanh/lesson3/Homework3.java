package com.programming.nhatanh.lesson3;

import com.programming.nhatanh.entity.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;


public class Homework3 {
    public static List<Account> accountArray = new ArrayList<>();;

    public static void createNewDepartment() {
        // Nhập department
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Id department: ");
        var inputDepartmentId = scanner.nextInt();
        System.out.println("Nhập tên department: ");
        var inputDepartmentName = scanner.next();
        Department newDepartment = new Department();
        newDepartment.departmentId = inputDepartmentId;
        newDepartment.departmentName = inputDepartmentName;
        System.out.println(newDepartment.departmentId + " : " + newDepartment.departmentName);
        scanner.close();

    }

    public static void createNewAccount() {
        // Nhập department
        Scanner scanner = new Scanner(System.in);

        Account newAccount = new Account();
        System.out.println("Nhập id người dùng: ");
        newAccount.accountId = scanner.nextInt();
        System.out.println("Nhập username người dùng: ");
        newAccount.userName = scanner.next();
        System.out.println("Nhập email người dùng: ");
        newAccount.email = scanner.next();
        System.out.println("Nhập tên đầy đủ của người dùng: ");
        newAccount.fullName = scanner.next();
        System.out.println("Nhập giới tính người dùng (Male/Female): ");
        newAccount.gender = Gender.valueOf(scanner.next());
        Department inputDeparmentQ5 = new Department();
        System.out.println("Nhập Id department của người dùng: ");
        inputDeparmentQ5.departmentId = scanner.nextInt();
        System.out.println("Nhập tên department của người dùng: ");
        inputDeparmentQ5.departmentName = scanner.next();
        newAccount.department = inputDeparmentQ5;
        Position newPositionQ5 = new Position();
        boolean validPosition = true;
        while (validPosition) {
            System.out.println("Nhập position của user: ");
            int inputPositionNumber = scanner.nextInt();
            newPositionQ5.positionId = inputPositionNumber;
            switch (inputPositionNumber) {
                case 1:
                    newPositionQ5.positionName = "Dev";
                    validPosition = false;
                    break;
                case 2:
                    newPositionQ5.positionName = "Test";
                    validPosition = false;
                    break;
                case 3:
                    newPositionQ5.positionName = "ScrumMaster";
                    validPosition = false;
                    break;
                case 4:
                    newPositionQ5.positionName = "PM";
                    validPosition = false;
                    break;
                default:
                    System.out.println("Không hợp lệ");
                    break;
            }
        }

        newAccount.createDate = LocalDateTime.now();
        scanner.close();
        System.out.println("Tạo account mới thành công: \n");
        System.out.println(newAccount);
        accountArray.add(newAccount);

    }

    public static void addAccountToGroup(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("List username: ");
        for(int i = 0; i < accountArray.size(); i++) {
            System.out.println(accountArray.get(i).userName);
        }

        System.out.println("Chọn username: ");
        var usernameInput = scanner.next();

        int[] group = new int[]{1, 2, 3, 4, 5};
        for(int i = 0; i < group.length; i++) {
            System.out.println(group[i]);
        }
        System.out.println("Chọn group: ");
        var groupInput = scanner.next();

        var newGroup = new Group();
        newGroup.groupId = Integer.parseInt(groupInput);
        newGroup.groupName = groupInput;
        Account tempAccount = new Account();
        tempAccount.userName = usernameInput;
        newGroup.accounts.add(tempAccount);

        System.out.println("Thêm account vào group thành công");
        System.out.println(newGroup);
        scanner.close();
    }

    public static void addAccountToRandomGrp(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("List username: ");
        for(int i = 0; i < accountArray.size(); i++) {
            System.out.println(accountArray.get(i).userName);
        }

        System.out.println("Chọn username: ");
        var usernameInput = scanner.next();
        int[] group = new int[]{1, 2, 3, 4, 5};
        int randomIndex = random.nextInt(0, group.length);

        var filterAccount = accountArray.stream()
                .filter(x -> usernameInput.equals(x.userName))
                .findAny()
                .orElse(null);

        var newGroup = new Group();
        newGroup.groupId = group[randomIndex];
        newGroup.groupName = String.valueOf(group[randomIndex]);
        if (filterAccount != null) {
            filterAccount.groups = new Group[]{newGroup};
            filterAccount.joinDate = new LocalDateTime[]{LocalDateTime.now()};

            System.out.println("Thêm group vào account thành công");
            System.out.println(filterAccount);
        }
    }

    public static void exercise6Question1() {
        // Nhập department
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }

    public static void exercise6Question2(List<Account> accounts) {
        // Nhập department
        for (int i = 0; i < accounts.size(); i++) {
            System.out.println();
            System.out.println(accounts.get(i).accountId);
            System.out.println(accounts.get(i).userName);
            System.out.println(accounts.get(i).email);
            System.out.println(accounts.get(i).fullName);
            System.out.println(accounts.get(i).gender);
            System.out.println(accounts.get(i).department);
            System.out.println(accounts.get(i).position);
            System.out.println(accounts.get(i).createDate);
            System.out.println(Arrays.toString(accounts.get(i).groups));
            System.out.println(Arrays.toString(accounts.get(i).joinDate));
        }

    }

    public static void exercise6Question3() {
        // Nhập department
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

    }

    public static void main(String[] args) throws ParseException {
        //Ex4
        Random random = new Random();

        //Q1:
        int randomInt = random.nextInt();
        System.out.println(randomInt);

        //Q2
        float randomFloat = random.nextFloat();
        System.out.println(randomFloat);

        //Q3
        String[] arrayQ3 = new String[]{"a", "b", "c"};
        int randomIndex = random.nextInt(0, arrayQ3.length);
        System.out.println(arrayQ3[randomIndex]);


        //Q4
        LocalDate dateTime = LocalDate.of(1995, 7, 24);
        var numdate = dateTime.toEpochDay();
        LocalDate endDate = LocalDate.of(1995, 12, 20);
        var numEndDate = endDate.toEpochDay();
        var resultDate = random.nextLong(numdate, numEndDate);
        LocalDate result = LocalDate.ofEpochDay(resultDate);
        System.out.println(result);

        //Q5
        LocalDate current = LocalDate.now();
        LocalDate past = LocalDate.of(current.getYear() - 1, current.getMonthValue(), current.getDayOfMonth());
        var answerDate = random.nextLong(past.toEpochDay(), current.toEpochDay());
        System.out.println(LocalDate.ofEpochDay(answerDate));

        //Q6
        LocalDate currentTime = LocalDate.now();
        var answerQ6 = random.nextLong(0, currentTime.toEpochDay());
        System.out.println(LocalDate.ofEpochDay(answerQ6));

        //Q7
        int randomIntQ7 = random.nextInt(100, 1000);
        System.out.println(randomIntQ7);


        //Ex5
        //Q1
        Scanner scanner = new Scanner(System.in);
        var intNumber1 = scanner.nextInt();
        var intNumber2 = scanner.nextInt();
        var intNumber3 = scanner.nextInt();
        System.out.printf("%d %d %d", intNumber1, intNumber2, intNumber3);


        //Q2
        var floatNumber1 = scanner.nextFloat();
        var floatNumber2 = scanner.nextFloat();
        System.out.printf("%f %f ", floatNumber1, floatNumber2);
        System.out.println();

        //Q3
        System.out.println("Họ:");
        var stringInput1 = scanner.next();
        System.out.println("Tên:");
        var stringInput2 = scanner.next();
        System.out.printf("%s %s ", stringInput1, stringInput2);

        //Q4
        System.out.println("Nhập ngày: ");
        String dateInput = scanner.next();

        SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
        System.out.printf(String.valueOf(dateFormat.parse(dateInput)));

        //Q5
        createNewAccount();

        //Q6
        createNewDepartment();

        //Q7

        while (true) {
            System.out.println("Nhập số: ");
            int inputNumber = scanner.nextInt();
            if (scanner.hasNextInt()) {
                if (inputNumber % 2 == 0) {
                    System.out.println(inputNumber);
                    break;
                }
            }
        }

        //Q8
        boolean validResponse = true;
        System.out.println("mời bạn nhập vào chức năng muốn sử dụng");
        while (validResponse) {
            int inputRequestNumber = scanner.nextInt();
            switch (inputRequestNumber) {
                case 1:
                    createNewAccount();
                    validResponse = false;
                    break;
                case 2:
                    createNewDepartment();
                    validResponse = false;
                    break;
                default:
                    System.out.println("Mời bạn nhập lại");
                    break;
            }

        }

        //Q9
        addAccountToGroup();

        //Q10
        boolean validResponseQ10 = true;
        while (validResponseQ10) {
            boolean loopContinue = true;
            while(loopContinue) {
                System.out.println("mời bạn nhập vào chức năng muốn sử dụng");
                int inputRequestNumber = scanner.nextInt();
                switch (inputRequestNumber) {
                    case 1:
                        createNewAccount();
                        loopContinue = false;
                        break;
                    case 2:
                        createNewDepartment();
                        loopContinue = false;
                        break;
                    case 3:
                        addAccountToGroup();
                        loopContinue = false;
                        break;
                    default:
                        System.out.println("Mời bạn nhập lại");
                        break;
                }
            }
            System.out.println("Bạn muốn thực hiện chức năng khác không?");
            var inputResponse = scanner.next();
            if (!inputResponse.equals("Y")) {
                validResponseQ10 = false;
            }
        }

        //Q11
        boolean validResponseQ11 = true;
        while (validResponseQ11) {
            boolean loopContinue = true;
            while(loopContinue) {
                System.out.println("mời bạn nhập vào chức năng muốn sử dụng");
                int inputRequestNumber = scanner.nextInt();
                switch (inputRequestNumber) {
                    case 1:
                        createNewAccount();
                        loopContinue = false;
                        break;
                    case 2:
                        createNewDepartment();
                        loopContinue = false;
                        break;
                    case 3:
                        addAccountToGroup();
                        loopContinue = false;
                        break;
                    case 4:
//                        addAccountToGroup();
                        loopContinue = false;
                        break;
                    default:
                        System.out.println("Mời bạn nhập lại");
                        break;
                }
            }
            System.out.println("Bạn muốn thực hiện chức năng khác không?");
            var inputResponse = scanner.next();
            if (!inputResponse.equals("Y")) {
                validResponseQ11 = false;
            }
        }



        //Ex6
        //Q1
        exercise6Question1();

        //Q2
        Account newAccount = new Account();
        Department newDepartmentQ2 = new Department();
        newAccount.accountId = 1;
        newAccount.email = "abc@gmail.com";
        newAccount.fullName = "Nguyễn Văn A";
        newDepartmentQ2.departmentId = 2;
        newDepartmentQ2.departmentName = "Dev";
        newAccount.department = newDepartmentQ2;
        var methodInput = new Account[]{newAccount};
        exercise6Question2(accountArray);

        //Q3
        exercise6Question3();

    }
}
