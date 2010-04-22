package persistentieController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

public class DBController {
	
	private Connection con;
	private final String DATABANKNAAM ="dbTest"; //geef hier de databanknaam

	
//************************************************************************************************
	public void openDatabank()
	{  
		try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	
				con = DriverManager.getConnection("jdbc:odbc:"+DATABANKNAAM);
	
			}
			catch(Exception e){System.out.println(e);}
	}
//************************************************************************************************
	public void sluitDatabank()
	{
		try{
			con.close();
		}catch(Exception e){System.out.println(e);}
		
	}
//************************************************************************************************
	
//************************************************************************************************
//*********************************SelectQuery uitvoeren******************************************
	public ResultSet exeQuery(String sql)
	{
	//Statement stmt;
	try{
		
		Statement stmt;
		
		stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		return rs;

	}
	catch(Exception e){System.out.println(e);}
	
	return null;
	
	}	
//************************************************************************************************
	
	public ResultSet exeQuery(String sql,List<Object> lstVals){
		PreparedStatement pstmt;
		ResultSet rs;
		int iTeller =0;
		
		
		
		try{
			pstmt = con.prepareStatement(sql);
			
			if(lstVals!=null)	{
				for(Object prepStatVals:lstVals){
					

					
				if(prepStatVals.getClass().getSimpleName().equals("String")){
					pstmt.setString(iTeller+1, lstVals.get(iTeller).toString());
				}else if(prepStatVals.getClass().getSimpleName().equals("Integer")){
					pstmt.setInt(iTeller+1, Integer.parseInt(lstVals.get(iTeller).toString()));
				}/*else //vanuitgaand een datum
				{
					
				}*/
				++iTeller;
			}
								}
			
			rs=pstmt.executeQuery();
			
			return rs;
		}catch(Exception e){
			System.out.println(e);
		}
		
		return null;
}

//************************************************************************************************
//************************************************************************************************
//**********************************CRUD-Queries uitvoeren****************************************	
	public void exeCRUDQuery(String sql,List<Object> lstVals){
		PreparedStatement pstmt;
		int iTeller =0;
		
		try{
			pstmt = con.prepareStatement(sql);
			
			if(lstVals!=null)	{
				for(Object prepStatVals:lstVals){
								
				if(prepStatVals.getClass().getSimpleName().equals("String")){
					pstmt.setString(iTeller+1, lstVals.get(iTeller).toString());
				}else if(prepStatVals.getClass().getSimpleName().equals("Integer")){
					pstmt.setInt(iTeller+1, Integer.parseInt(lstVals.get(iTeller).toString()));
				}/*else //vanuitgaand een datum
				{
					
				}*/
				++iTeller;
			}
								}
			
			pstmt.executeUpdate();
			
		}catch(Exception e){
			System.out.println(e);
		}

}
//************************************************************************************************
//************************************************************************************************
	
}
