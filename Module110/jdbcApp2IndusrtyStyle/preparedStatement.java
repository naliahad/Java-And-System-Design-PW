package Module110.jdbcApp2IndusrtyStyle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import Module110.jdbcApp2IndusrtyStyle.Utility.JdbcUtil; 
public class preparedStatement 
{

    public static void main(String[] args) 
    {
        // Resources used
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet resultSet = null;
        Scanner scanner = null;
        try 
        {
            // Getting the connection
            connection = JdbcUtil.getDbConnection();
            String sqlInsertQuery = "insert into student(sid,sname,sage,saddress) values(?,?,?,?)";

            if (connection != null)
            pstmt = connection.prepareStatement(sqlInsertQuery);

            if (pstmt != null) 
            {
                scanner = new Scanner(System.in);
                System.out.print("Enter the value of sname :: ");
                String sname = scanner.next();
                System.out.print("Enter the value of sid :: ");
                Integer sid = scanner.nextInt();
                System.out.print("Enter the value of saddress :: ");
                String saddress = scanner.next();
                System.out.print("Enter the value of sage :: ");
                Integer sage = scanner.nextInt();

                // Setting the values for PreparedStatement
                pstmt.setInt(1, sid);
                pstmt.setString(2, sname);
                pstmt.setInt(3, sage);
                pstmt.setString(4, saddress);
                int rowAffected = pstmt.executeUpdate();

                if (rowAffected == 1) 
                {
                    System.out.println("Insertion succesfull");
                } 
                else 
                {
                    System.out.println("Record not inserted to database...");
                }
            }
                
        }
                
        catch (SQLException e) 
        {
            e.printStackTrace();
        } 

        catch (Exception e) 
        {
            e.printStackTrace();
        } 

        finally 
        {

            // Closing the resources
            try 
            {
                JdbcUtil.closeResources(resultSet, pstmt, connection);
                scanner.close();
            } 
            
            catch (SQLException e) 
            {
                e.printStackTrace();
            } 
            
            catch (Exception e) 
            {
                e.printStackTrace();
            }
        }
    }
}