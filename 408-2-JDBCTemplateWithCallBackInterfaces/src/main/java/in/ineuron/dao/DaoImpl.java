package in.ineuron.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import in.ineuron.bo.StudentBO;


@Repository
public class DaoImpl implements DaoInterface{
	

	private static final String GET_STUDENT_BY_NO = "select STUDID,STUDNAME,STUDAGE,STUDADDRESS from STUDENT where STUDID=?";
	
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public StudentBO getStudentByNo(int no) {
		
		StudentBO bo = null;
		bo = jdbcTemplate.queryForObject(GET_STUDENT_BY_NO, new StudentMapper(),no);
		
			
		
		return bo;
	}
	
	
	//Static Nested Classes where the scope is limited to only that part
	private static class StudentMapper implements RowMapper<StudentBO>{

		@Override
		public StudentBO mapRow(ResultSet rs, int rowNum) throws SQLException {
			
			StudentBO bo = new StudentBO();
			
			
			bo.setStudId(rs.getInt(1));
			bo.setStudName(rs.getString(2));
			bo.setStudAge(rs.getInt(3));
			bo.setStudAddress(rs.getString(4));
			return bo;
		}
		
	}

}
