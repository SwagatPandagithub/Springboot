package in.ineuron.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.DTO.StudentDTO;
import in.ineuron.bo.StudentBO;
import in.ineuron.dao.DaoInterface;


@Service
public class ServiceImpl implements ServiceInterface{
	
	@Autowired
	private DaoInterface dao;

	@Override
	public StudentDTO fetchStudentByNo(int no) {
			StudentBO bo=dao.getStudentByNo(no);
			
			StudentDTO dto = null;
			dto = new StudentDTO();
			
//the data retrieved from the dao class is an bo object then through beanutils from spring core the data is copied into dto object
			BeanUtils.copyProperties(bo, dto);
			
		return dto;
	}
	
	

}
