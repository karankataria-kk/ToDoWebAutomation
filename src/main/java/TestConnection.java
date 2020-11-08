
import java.sql.*;
import java.lang.*;
public class TestConnection {

 
    public static void main(String[] args) {
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","");  
            Statement stmt=con.createStatement();  
            ResultSet rs;
            String query = " insert into stu (Id,Name,Marks)"+ " values (?, ?, ?)";
            PreparedStatement  preparedStmt=con.prepareStatement(query);
            preparedStmt.setString (1,"1442");
            preparedStmt.setString (2, "kartik");
            preparedStmt.setInt    (3, 50);

            // execute the preparedstatement
            preparedStmt.execute();
            rs=stmt.executeQuery("select * from stu");  
               
            while(rs.next())  
            System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3));  
            con.close();  
            //System.out.println("loaded");
            System.out.println("connected");
           }
            catch(ClassNotFoundException e){ System.out.println(e);}
            catch(SQLException e){System.out.println(e);}
            
       
       }
