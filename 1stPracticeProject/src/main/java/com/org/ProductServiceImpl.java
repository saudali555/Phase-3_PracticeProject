package com.org;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

	@Autowired
	private EProductDAO eproductDAO;
	
	public List<EProductEntity> searchById(int pid) {
		
		return eproductDAO.searchById(pid);
	}
	
	public List<EProductEntity> updateDetails(int id, String name, BigDecimal price) {
		
		return eproductDAO.updateDetails(id,name,price);
	}
}