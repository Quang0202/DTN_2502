package fontend;

import untils.JdbcUtils2;

public class Program5 {
    public static void main(String[] args) {
        try {
            JdbcUtils2.isConnectedForTesting();
            JdbcUtils2.disconnect();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
