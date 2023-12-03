package in.ineuron.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import in.ineuron.bo.EmployeeBO;


@Repository(value = "dao")
public class EmployeeDAOImpl implements IEmployeeDAO {
	
	private static final String SQL_INSERT_QUERY = "";
	
	@Autowired
	private DataSource dataSource;
	
	static {
		System.out.println("EmployeeDAOImpl.class file loading...");
	}
	
	public EmployeeDAOImpl(){
		System.out.println("EmployeeDAOImpl: 0 param constructor...");
	}
	
	@Override
	public EmployeeBO save(EmployeeBO bo) {
		
		try(Connection connection = dataSource.getConnection(); PreparedStatement psmt = connection.prepareStatement(SQL_INSERT_QUERY)){
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public String toString() {
		return "EmployeeDAOImpl [dataSource=" + dataSource + "]";
	}
	
}
