public class StringMethod {
    public static void main(String[] args) {
        String str = "Nguyen @ van Aan*";

//        System.out.println(str.length());
//        System.out.println(str.toUpperCase());
//        System.out.println(str.toLowerCase()); // viet thuong
//        System.out.println(str.charAt(1)); // tra về kí tự vị trí index
//        System.out.println(str.concat("test")); // cộng chuõi
//        System.out.println(str.substring(1)); // [1, lenght)
//        System.out.println(str.substring(2, 5)); // [2, 5)
//        // Kiểm tra trong chuỗi str có tồn taij chuỗi x hay không
//        System.out.println(str.contains("an1"));
//        System.out.println(str.indexOf("an")); // nếu trả về >-1 thì có tồn tại
//        // Thay thế chuỗi con bên trong str thành chuỗi mới
//        System.out.println(str.replace("an",  "x"));
//        // thay thế sử dụng regex (biểu thức chính quy)
//        System.out.println(str.replaceAll("\\s+", " "));
//        System.out.println(str.replaceAll("\\d+", "*"));
//        System.out.println(str.replaceAll("\\w+", "*")); // a - z, A-Z, 0-9
//        System.out.println(str.replaceAll("[0-9]+", " "));
//        // Kiểm tra chuỗi str có tồn trại chữ số hay không
//        // . bất kỳ kí tự nào
//        // * 0 hoặc nhiều kí tự
//        // + 1 hoăcj nhiều
//        System.out.println(str.matches(".*[0-9].*"));
//        System.out.println(str.matches(".*//s.*"));
    String[] strs = str.split("\\d"); // tách chuỗi str theo kí tự phân cách trả về mảng string
    for (String s : strs) {
        System.out.println(s);
    }


    }
}
