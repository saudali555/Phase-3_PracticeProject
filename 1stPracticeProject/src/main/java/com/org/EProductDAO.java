package com.org;

import java.math.BigDecimal;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class EProductDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public List<EProductEntity> searchById(int pid) {
		
		return this.sessionFactory.getCurrentSession().createQuery("from EProductEntity where ID="+pid).list();
	}
	
	public List<EProductEntity> updateDetails(int id,String name, BigDecimal price) {
		
		EProductEntity e=new EProductEntity();
		e.setName(name);
		e.setPrice(price);
		sessionFactory.getCurrentSession().update(e);
		return this.sessionFactory.getCurrentSession().createQuery("from EProductEntity where ID="+id).list();
	}
}