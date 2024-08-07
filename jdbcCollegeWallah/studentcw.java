package jdbcCollegeWallah;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;



public class studentcw 
{

	public static void createDatabase ()
	{
		// TODO Auto-generated method stub
		
		//driver load
		// connection establish
		

	}

	public void createTable() 
    {
		// TODO Auto-generated method stub
		
		// try 
		// {
			
		// 	String url = "jdbc:mysql://localhost:3306/db";
		// 	//String db = "db";
		// 	String userName = "root";
		// 	String password = "targetatlas@1234";
			
		// 	Connection conn = DriverManager.getConnection(url, userName, password);
		// 	Statement stm = conn.createStatement();
			
			
		// 	String query = "create table student (sid int(3), sname varchar(200), semail varchar(200))";
		// 	stm.execute(query);
		// 	System.out.println("Table created succesfully. " );
		// 	conn.close();
		// }
		
		// catch (Exception e)
		// {
		// 	e.printStackTrace();
		// }
		
	}

    public void createData() {
        // TODO Auto-generated method stub
        try 
		{
			
			String url = "jdbc:mysql://localhost:3306/";
			String db = "db";
			String userName = "root";
			String password = "targetatlas@1234";
			
			Connection conn = DriverManager.getConnection(url + db, userName, password);
			
			String query = "insert into student(sid, sname, semail) Values(?,?,?)";
			PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setInt(1, 10);
            pstm.setString(2, "Ahad");
            pstm.setString(3, "Ahad@gmail.com");
            pstm.execute();
			System.out.println("Data inserted succesfully. " );
			conn.close();
		}
		
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
    }

    public void readData()
    {
        try 
		{
			
			String url = "jdbc:mysql://localhost:3306/";
			String db = "db";
			String userName = "root";
			String password = "targetatlas@1234";
			
			Connection conn = DriverManager.getConnection(url + db, userName, password);
		
			String query = "select * from student";
			Statement pstm = conn.createStatement();
            
            ResultSet rs =pstm.executeQuery(query);

            while (rs.next()) 
        {
            System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + 
            "\t" + rs.getString(3));
        }
			System.out.println("read data succesfully : ");
			conn.close();
		}
		
		catch (Exception e)
		{
			e.printStackTrace();
		}
        
    }

    public void update() 
    {
        // TODO Auto-generated method stub
        // try 
		// {
			
		// 	String url = "jdbc:mysql://localhost:3306/";
		// 	String db = "db";
		// 	String userName = "root";
		// 	String password = "targetatlas@1234";
			
		// 	Connection conn = DriverManager.getConnection(url + db, userName, password);
			
		// 	String query = "update student set sid = ? where sname  = ?";
		// 	PreparedStatement pstm = conn.prepareStatement(query);
        //     pstm.setInt(1, 9);
        //     pstm.setString(2, "Ahad");
            
        //     pstm.execute();
		// 	System.out.println("Data updated succesfully. " );
		// 	conn.close();
		// }
		
		// catch (Exception e)
		// {
		// 	e.printStackTrace();
		// }
    }

    public void deleteData()
    {
        //TODO Auto-generated method stub
    //     try 
	// 	{
			
	// 		String url = "jdbc:mysql://localhost:3306/";
	// 		String db = "db";
	// 		String userName = "root";
	// 		String password = "targetatlas@1234";
			
	// 		Connection conn = DriverManager.getConnection(url + db, userName, password);
			
	// 		String query = "DELETE FROM student WHERE sid = ? AND sname  = ?";
	// 		PreparedStatement pstm = conn.prepareStatement(query);
    //         pstm.setInt(1, 10);
    //         pstm.setString(2, "Ahad");
            
    //         pstm.execute();
	// 		System.out.println("Data updated succesfully. " );
	// 		conn.close();
	// 	}
		
	// 	catch (Exception e)
	// 	{
	// 		e.printStackTrace();
	// 	}
    // }

}
