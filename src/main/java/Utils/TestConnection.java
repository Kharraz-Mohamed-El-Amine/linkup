package Utils;

import java.sql.Connection;

public class TestConnection {

    public static void main(String[] args){
        try(Connection conn = DBConnection.getConnection()){
            if (conn != null){
                System.out.println("Successful Connection");
            }else {
                System.out.println("Unsuccessful Connection");
            }
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
