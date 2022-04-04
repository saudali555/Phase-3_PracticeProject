package com.org;

import java.math.BigDecimal;
import java.util.List;


public interface ProductService {

	public List<EProductEntity> searchById(int pid);
	
	public List<EProductEntity> updateDetails(int id, String name, BigDecimal price);
}