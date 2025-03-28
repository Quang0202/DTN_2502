public class StringMethod {

    public static void main(String[] args) {
        String str = "Nguy2ễn    @      V1an     Aan";

        System.out.println(str.length());
        System.out.println(str.toLowerCase());// viet thuong
        System.out.println(str.toUpperCase());
        System.out.println(str.charAt(1));// trả về kí tự tại vị trí index
        System.out.println(str.concat("test"));// cộng chuỗi
        System.out.println(str.substring(1));// [1, length)
        System.out.println(str.substring(2,5));// [2, 5)
        // kiểm tra trong chuỗi str có tồn tại một chuỗi x hay không
        System.out.println(str.contains("an"));
        System.out.println(str.indexOf("an"));// nếu trả về >-1 thì có tồn tại
        // thay thế một chuỗi con bên trong str thành chuỗi mới
        System.out.println(str.replace("an","x"));
        // thay thế sử dụng regex( Biểu thức chính quy)
        System.out.println(str.replaceAll("\\w+",  "*"));// a-z, A-Z 0-9
        System.out.println(str.replaceAll("[0-9]+",  "*"));
        // Kiểm tra chuỗi str có tồn tại chữ số hay không
        // . bất kỳ ký tự nào
        // * 0 hoặc nhiều ký tự
        // + 1 hoặc nhiều ký tự
        // [abc] tồn tại ký tự a,b,c
        System.out.println(str.matches(".*[A-Z].*"));
        String[] strs = str.split("\\d+");// tách chuỗi str theo ký tự phân tách trả về mảng String
        for(String s: strs){
            System.out.println(s);
        }


    }
}
