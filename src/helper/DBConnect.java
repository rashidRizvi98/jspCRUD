package helper;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnect {
    
    private static DBConnect sc;
    private static Connection con;
    private static String url="jdbc:mysql://localhost:3306/";
    private static String dbname ="sunshine_lk";
    private static String username="root";
    private static String password="";
   
    //constructor
      private DBConnect() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(url + dbname, username, password);
        
    }
    
    public static DBConnect getInstance( ) throws  ClassNotFoundException, SQLException{
            if(sc==null){
                sc= new DBConnect();
                return sc;
            }else {
                return sc;
            }
    }
            
     public static Connection getConnction(){
      
          return con;
      }      
    
       
}
    
    

    


