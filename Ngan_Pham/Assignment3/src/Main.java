import model.Account;
import model.Department;
import model.Group;

import java.time.LocalDate;
import java.util.*;


public class Main {
    public static void main(String[] args) {

        Department department = new Department();
        department.getAddress();
        department.setDepartmentId(1);
        department.setDepartmentName("Sale");
        department.setAddress("Hà Nội");

        Department department1 = new Department();
        department1.setDepartmentId(2);
        department1.setDepartmentName("Sale");

        Department department2 = new Department();
        department2.setDepartmentId(3);
        department2.setDepartmentName("Marketing");

        Department department3 = new Department();
        department3.setDepartmentId(4);
        department3.setDepartmentName("Waiting room");

        Department department4 = new Department();
        department4.setDepartmentId(5);
        department4.setDepartmentName("Accounting");

        Department department5 = new Department();
        department5.setDepartmentId(6);
        department5.setDepartmentName("Sale");

        Department department6 = new Department();
        department6.setDepartmentId(7);
        department6.setDepartmentName("Boss of director");


        Department[] departments = {department, department1, department2, department3, department4, department5, department6};
        Group group = new Group();
        group.setGroupId(1);
        group.setGroupName("Golang Java");
        group.setCreateDate(LocalDate.parse("2022-01-12"));

        Group group1 = new Group();
        group1.setGroupId(2);
        group1.setGroupName("Java");
        group1.setCreateDate(LocalDate.parse("2023-01-12"));

        Group group2 = new Group();
        group2.setGroupId(3);
        group2.setGroupName("TestJavaGolang");
        group2.setCreateDate(LocalDate.parse("2024-11-12"));

        Group[] groups = {group, group1, group2};

        //Exercise 1 (Optional): Datatype Casting
//        exe1Question1();
//        exe1Question2();
//        exe1Question3();
//        exe1Question4();

        //Exercise 2 (Optional): Default value
//        exe2Question1();

        //Exercise 3(Optional): Boxing & Unboxing
        exe3Question1();
//        exe3Question2();
//        exe3Question3();

        //Exercise 4: String
//        exe4Question1();
//        exe4Question2();
//        exe4Question3();
//        exe4Question4();
//        exe4Question5();
//        exe4Question6();
//        exe4Question7();
//        exe4Question8(groups);
//        exe4Question9(groups);
//        exe4Question10();
//        exe4Question11();
//        exe4Question12();
//        exe4Question13();
//        exe4Question14();
//        exe4Question15();
//        exe4Question16();

        //Exercise 5: Object’s Method
//        exe5Question1(department);
//        exe5Question2(departments);
//        exe5Question3(department);
//        exe5Question4(department);
//        exe5Question5(department,department1);
//        exe5Question5(department,department2);
//        exe5Question6(departments);
//        exe5Question7(departments);
    }


    /////////Exercise 1 (Optional): Datatype Casting
    //Question 1: Khai báo 2 số lương có kiểu dữ liệu là float.
    //Khởi tạo Lương của Account 1 là 5240.5 $
    //Khởi tạo Lương của Account 2 là 10970.055$
    //Khai báo 1 số int để làm tròn Lương của Account 1 và in số int đó ra
    //Khai báo 1 số int để làm tròn Lương của Account 2 và in số int đó ra
    public static void exe1Question1() {
        float salary = 5240.5F;
        float salary2 = 10970.055F;
        System.out.println(Math.round(salary));
        System.out.println(Math.round(salary2));
    }

    //Question 2: Lấy ngẫu nhiên 1 số có 5 chữ số (những số dưới 5 chữ số thì sẽ thêm có số 0 ở đầu cho đủ 5 chữ số)
    public static void exe1Question2() {
        Random rand = new Random();
        int num = rand.nextInt(100000);
        String formatted = String.format("%05d", num); // đảm bảo đủ 5 chữ số

        System.out.println("Số 5 chữ số ngẫu nhiên: " + formatted);
    }

    //Question 3:Lấy 2 số cuối của số ở Question 2 và in ra.
    //Gợi ý:
    //Cách 1: convert số có 5 chữ số ra String, sau đó lấy 2 số cuối
    //Cách 2: chia lấy dư số đó cho 100
    public static void exe1Question3() {
        Random rand = new Random();
        int number = rand.nextInt(100000);
        String formatted = String.format("%05d", number);

        System.out.println("Số 5 chữ số ngẫu nhiên: " + formatted);

        // Cách 1: dùng chuỗi
        String lastTwoStr = formatted.substring(3);
        System.out.println("2 số cuối (Cách 1 - String): " + lastTwoStr);

        // Cách 2: dùng số học
        int lastTwoInt = number % 100;
        System.out.println("2 số cuối (Cách 2 - %): " + String.format("%02d", lastTwoInt));
    }


    //Question 4: Viết 1 method nhập vào 2 số nguyên a và b và trả về thương của chúng
    public static void exe1Question4() {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Nhập số nguyên thứ 1: ");
        int a = myObj.nextInt();

        int b;
        while (true){
            System.out.print("Nhập số nguyên thứ 2 (khác 0): ");
            b = myObj.nextInt();
            if(b !=0 ) break;
            System.out.println( "Không được chia cho 0. Vui lòng nhập lại.");
        }

        float result = (float) a/b;
        System.out.println("Thương của hai số là: " + result);
    }

    ///////Exercise 2 (Optional): Default value
    //Question 1: Không sử dụng data đã insert từ bài trước, tạo 1 array Account và khởi tạo 5 phần tử theo cú pháp (sử dụng vòng for để khởi tạo):
    // Email: "Email 1"
    // Username: "User name 1"
    // FullName: "Full name 1"
    // CreateDate: now
    public static void exe2Question1() {
        Account[] accounts = new Account[5];
        for (int i = 0; i < 5; i++) {
            Account account = new Account();
            account.setEmail("Email" + (i + 1));
            account.setUserName("User name" + (i + 1));
            account.setFullName("Full name" + (i + 1));
            account.setCreateDate(LocalDate.now());
            accounts[i] = account;
        }
        for (Account acc : accounts) {
            System.out.println("Email: " + acc.getEmail());
            System.out.println("Username: " + acc.getUserName());
            System.out.println("Full name: " + acc.getFullName());
            System.out.println("Create date: " + acc.getCreateDate());
            System.out.println("----------");
        }
    }

    ////////Exercise 3(Optional): Boxing & Unboxing
    //Question 1: Khởi tạo lương có datatype là Integer có giá trị bằng 5000.
    //Sau đó convert lương ra float và hiển thị lương lên màn hình (với số float có 2 số sau dấu thập phân)
    public static void exe3Question1() {
        Integer salary = 5000;
        System.out.printf("%.2f\n", salary.floatValue());
    }

    //Question 2: Khai báo 1 String có value = "1234567" Hãy convert String đó ra số int
    public static void exe3Question2() {
        String value = "1234567";
        System.out.println(Integer.parseInt(value));
    }

    //Question 3: Khởi tạo 1 số Integer có value là chữ "1234567" Sau đó convert số trên thành datatype int
    public static void exe3Question3() {
        Integer value = Integer.valueOf("1234567");
        System.out.println((int) value);
    }

    ////////Exercise 4: String
    //Question 1: Nhập một xâu kí tự, đếm số lượng các từ trong xâu kí tự đó (các từ có thể cách nhau bằng nhiều khoảng trắng );
    public static void exe4Question1() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nhap xau ky tu: ");
        String val = myObj.nextLine();//nguyen  van a
        val = val.trim();
        String[] arrStr = val.split("\\s+");
        System.out.println(arrStr.length);
    }

    //Question 2: Nhập hai xâu kí tự s1, s2 nối xâu kí tự s2 vào sau xâu s1;
    public static void exe4Question2() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nhap xau ky tu 1: ");
        String val1 = myObj.nextLine();
        System.out.println("Nhap xau ky tu 2: ");
        String val2 = myObj.nextLine();
        System.out.println(val1.concat(val2));
    }

    //Question 3: Viết chương trình để người dùng nhập vào tên và kiểm tra, nếu tên chư viết hoa chữ cái đầu thì viết hoa lên
    public static void exe4Question3() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        String val1 = myObj.nextLine();
        System.out.println(capFirstLetter(val1));
    }

    public static String capFirstLetter(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    //Question 4:Viết chương trình để người dùng nhập vào tên in từng ký tự trong tên của người dùng ra
    //VD:
    //Người dùng nhập vào "Nam", hệ thống sẽ in ra
    //"Ký tự thứ 1 là: N"
    //"Ký tự thứ 1 là: A"
    //"Ký tự thứ 1 là: M"
    public static void exe4Question4() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        String val1 = myObj.nextLine();
        for (int i = 0; i < val1.length(); i++) {
            System.out.println("Ký tự thứ " + (i + 1) + " là: " + String.valueOf(val1.charAt(i)).toUpperCase());// ("" + val1.charAt(i)).toUpperCase()
//            System.out.println("Ký tự thứ " + (i + 1) + " là: " + (""+val1.charAt(i)).toUpperCase());
        }
    }

    //Question 5: Viết chương trình để người dùng nhập vào họ, sau đó yêu cầu người dùng nhập vào tên và hệ thống sẽ in ra họ và tên đầy đủ
    public static void exe4Question5() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nhap ho: ");
        String val1 = myObj.nextLine();
        System.out.println("Nhap ten: ");
        String val2 = myObj.nextLine();
        System.out.println(val1 + " " + val2);
    }

    //Question 6: Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và sau đó hệ thống sẽ tách ra họ, tên , tên đệm
    //VD: Người dùng nhập vào "Nguyễn Văn Nam" Hệ thống sẽ in ra
    //"Họ là: Nguyễn"
    //"Tên đệm là: Văn"
    //"Tên là: Nam"
    public static void exe4Question6() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        String val1 = myObj.nextLine();
        String[] temp = val1.split(" ");
        System.out.println("Ho la: " + temp[0]);
        String tempName = "";
        for (int i = 1; i < temp.length - 1; i++) {
            tempName += temp[i] + " ";
        }
        System.out.println("Ten dem la: " + tempName.trim());
        System.out.println("Ten la: " + temp[temp.length - 1]);
    }

    //Question 7: Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và chuẩn hóa họ và tên của họ như sau:
    //a) Xóa dấu cách ở đầu và cuối và giữa của chuỗi người dùng nhập vào
    //VD: Nếu người dùng nhập vào " nguyễn văn nam " thì sẽ chuẩn hóa thành "nguyễn văn nam"
    //b) Viết hoa chữ cái mỗi từ của người dùng
    //VD: Nếu người dùng nhập vào " nguyễn văn nam " thì sẽ chuẩn hóa thành "Nguyễn Văn Nam"
    public static void exe4Question7() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        String str = myObj.nextLine();
        str = str.trim();
        str = str.replaceAll("\\s+", " ");

        String[] arrStr = str.split(" ");
        String result = "";
        for (String s : arrStr) {
            result += capFirstLetter(s) + " ";
        }
        System.out.println(result.trim());
    }

    //Question 8: In ra tất cả các group có chứa chữ "Java"
    public static void exe4Question8(Group[] groups) {
        for (Group group : groups) {
            if (group.getGroupName().contains("Java")) {
                System.out.println(group);
            }
        }
    }

    //Question 9: In ra tất cả các group "Java"
    public static void exe4Question9(Group[] groups) {
        for (Group group : groups) {
            if (group.getGroupName().equals("Java")) {
                System.out.println(group);
            }
        }
    }

    //Question 10 (Optional): Kiểm tra 2 chuỗi có là đảo ngược của nhau hay không. Nếu có xuất ra “OK” ngược lại “KO”.
    //Ví dụ “word” và “drow” là 2 chuỗi đảo ngược nhau.
    public static void exe4Question10() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nhap chuoi 1: ");
        String chuoi1 = myObj.nextLine();
        System.out.println("Nhap chuoi 2: ");
        String chuoi2 = myObj.next();

        StringBuilder stringBuilder = new StringBuilder(chuoi1);
        String temp = stringBuilder.reverse().toString();
        if (chuoi2.equals(temp)) {
            System.out.println("OK");
        } else {
            System.out.println("KO");
        }
    }

    //Question 11 (Optional): Count special Character Tìm số lần xuất hiện ký tự "a" trong chuỗi
    public static void exe4Question11() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String chuoi = myObj.nextLine();

        chuoi = chuoi.replaceAll("[^a]", "");
        System.out.println(chuoi);
        System.out.println(chuoi.length());
        // cách khac sử dụng filter
//        long count = chuoi.chars().filter(ch -> ch == 'a').count();
    }

    //Question 12 (Optional): Reverse String Đảo ngược chuỗi sử dụng vòng lặp
    public static void exe4Question12() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String chuoi = myObj.nextLine();
        System.out.println(new StringBuilder(chuoi).reverse().toString());
    }

    //Question 13 (Optional): String not contains digit
    //Kiểm tra một chuỗi có chứa chữ số hay không, nếu có in ra false ngược lại true.
    //Ví dụ:
    //"abc" => true
    //"1abc", "abc1", "123", "a1bc", null => false
    public static void exe4Question13() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String chuoi = myObj.nextLine();
        System.out.println(!chuoi.matches(".*\\d.*"));
    }

    //Question 14 (Optional): Replace character Cho một chuỗi str, chuyển các ký tự được chỉ định sang một ký tự khác cho trước.
    //Ví dụ:
    //"VTI Academy" chuyển ký tự 'e' sang '*' kết quả " VTI Acad*my"
    public static void exe4Question14() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String chuoi = myObj.nextLine();
        System.out.println("Nhap ky tu chi dinh: ");
        String kyTuChiDinh = myObj.nextLine();
        System.out.println("Nhap ky tu muon chuyen: ");
        String kyTuMuonChuyen = myObj.nextLine();
        System.out.println(chuoi.replaceAll(kyTuChiDinh, kyTuMuonChuyen));
    }

    //Question 15 (Optional): Revert string by word
    //Đảo ngược các ký tự của chuỗi cách nhau bởi dấu cách mà không dùng thư viện.
    //Ví dụ: " I am developer " => "developer am I".
    //Các ký tự bên trong chỉ cách nhau đúng một dấu khoảng cách.
    //Gợi ý: Các bạn cần loại bỏ dấu cách ở đầu và cuối câu, thao tác cắt chuỗi theo dấu cách
    public static void exe4Question15() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        String val1 = myObj.nextLine().trim();

        String[] temp = Arrays.stream(val1.split(" ")).filter(e -> !e.isEmpty()).toArray(String[]::new);
        Collections.reverse(Arrays.asList(temp));
        System.out.println(String.join(" ", temp));

    }

    //Question 16 (Optional):Cho một chuỗi str và số nguyên n >= 0. Chia chuỗi str ra làm các phần
    //bằng nhau với n ký tự. Nếu chuỗi không chia được thì xuất ra màn hình “KO”.
    public static void exe4Question16() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String chuoi = myObj.nextLine();
        System.out.println("Nhap so nguyen n: ");
        int n = myObj.nextInt();
        if (chuoi.length() % n != 0) {
            System.out.println("KO");
        } else {
            for (int i = 0; i < chuoi.length(); i += n) {
                String result = chuoi.substring(i, i + n);
                System.out.println(result);
            }
        }
    }

    //////////Exercise 5: Object’s Method
    //Question 1: In ra thông tin của phòng ban thứ 1 (sử dụng toString())
    public static void exe5Question1(Department department) {
        System.out.println(department.toString());
    }

    //Question 2: In ra thông tin của tất cả phòng ban (sử dụng toString())
    public static void exe5Question2(Department[] departments) {
        for (Department department : departments) {
            System.out.println(department.toString());
        }
    }

    //Question 3:In ra địa chỉ của phòng ban thứ 1
    public static void exe5Question3(Department department) {
        System.out.println(department.getAddress());
    }

    //Question 4: Kiểm tra xem phòng ban thứ 1 có tên là "Phòng A" không?
    public static void exe5Question4(Department department) {
        String nameCheck = "Phòng A";
//        System.out.println(department.checkDepartmentName(nameCheck));
    }

    //Question 5: So sánh 2 phòng ban thứ 1 và phòng ban thứ 2 xem có bằng nhau không (bằng nhau khi tên của 2 phòng ban đó bằng nhau)
    public static void exe5Question5(Department department1, Department department2) {
        System.out.println(department1.compareDepartment(department2));
    }

    //Question 6: Khởi tạo 1 array phòng ban gồm 5 phòng ban, sau đó in ra danh sách phòng ban theo thứ tự tăng dần theo tên (sắp xếp theo vần ABCD)
    //VD:
    //Accounting
    //Boss of director
    //Marketing
    //Sale
    //Waiting room
    public static void exe5Question6(Department[] departments) {
        Arrays.sort(departments, new Comparator<Department>() {
            @Override
            public int compare(Department o1, Department o2) {
                return o1.getDepartmentName().compareTo(o2.getDepartmentName());
            }
        });
    }

    //Question 7: Khởi tạo 1 array học sinh gồm 5 Phòng ban, sau đó in ra danh sách phòng ban được sắp xếp theo tên
    //VD:
    //Accounting
    //Boss of director
    //Marketing
    //waiting room
    //Sale
    public static void exe5Question7(Department[] departments) {
//        bubbleSort2(departments);
//        for (Department department : departments) {
//            System.out.println(department.toString());
//        }
        Arrays.sort(departments, new Comparator<Department>() {
            @Override
            public int compare(Department o1, Department o2) {
                String[] arrStr1 = o1.getDepartmentName().trim().split("\\s+");

                String[] arrStr2 = o2.getDepartmentName().trim().split("\\s+");

                String str1 = arrStr1[arrStr1.length-1];
                String str2 = arrStr2[arrStr2.length -1];
                return str1.compareTo(str2);
            }
        });
    }
// 0 1 2  3 4
// 1,3,10,2,4,
// 1,2, 10,3,4
// 1,2,3,10,4

    private static void bubbleSort(Department[] departments) {
        boolean swapped = false;

        for (int i = 0; i < departments.length - 1; i++) {

            for (int j = i+1; j < departments.length; j++) {
                Department temp;
                if (departments[i].getDepartmentName().compareTo(departments[j].getDepartmentName()) > 0) {
                    temp = departments[i];
                    departments[i] = departments[j];
                    departments[j] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped, then break
            if (!swapped)
                break;
        }
    }

    private static void bubbleSort2(Department[] departments) {
        boolean swapped = false;

        for (int i = 0; i < departments.length - 1; i++) {
            for (int j = 0; j < departments.length - i - 1; j++) {
                Department temp;
                String[] nameTemp1 = departments[j].getDepartmentName().split(" ");
                String[] nameTemp2 = departments[j + 1].getDepartmentName().split(" ");
                if (nameTemp1[nameTemp1.length - 1].toLowerCase().compareTo(nameTemp2[nameTemp2.length - 1].toLowerCase()) > 0) {
                    temp = departments[j];
                    departments[j] = departments[j + 1];
                    departments[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped, then break
            if (!swapped)
                break;
        }
    }


}