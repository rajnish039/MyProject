package com.durga.userReg.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.durga.booking.bean.BookingBean;
import com.durga.fare.bean.FareBean;
import com.durga.userReg.bean.UserRegBean;
import com.durga.userReg.dao.UserRegDao;
import com.durga.vehicle.bean.VehicleBean;
import com.durga.vownerReg.bean.VownerRegBean;

@Repository("UserRegDao")
public class UserRegDaoImpl implements UserRegDao {  
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersistenceUnit");
	
	@Override
	public int saveUserReg(UserRegBean userRegBean){
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(userRegBean);
		em.flush();
		em.getTransaction().commit();
		return 0;
	}
	
	@Override
	public VehicleBean saveVehicleDetails(VehicleBean vehicleBean)
	{
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.merge(vehicleBean);
		em.flush();
		em.getTransaction().commit();
		return vehicleBean;
		
	}
	
	@Override
	public List<VehicleBean> getVehicleDetailsByType(String vType)
	{
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Query query = em.createQuery("select vi from VehicleBean vi where vi.vType=:vType");
		query.setParameter("vType", vType);
		return query.getResultList();
	}
	@Override
	public List<VehicleBean> getVehicleDetailsByClass(String vClass)
	{
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Query query = em.createQuery("select vi from VehicleBean vi where vi.vClass=:vClass");
		query.setParameter("vClass", vClass);
		return query.getResultList();
	}
	@Override
	public int saveVownerDetails(VownerRegBean vownerRegBean)
	{
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(vownerRegBean);
		em.flush();
		em.getTransaction().commit();
		return 0;
	}
	@Override
	public BookingBean saveBookingDetails(BookingBean bookingBean)
	{
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(bookingBean);
		em.flush();
		em.getTransaction();
		return bookingBean;
	}
	@Override
	public FareBean saveFareDetails(FareBean fareBean)
	{
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(fareBean);
		em.flush();
		em.getTransaction().commit();
		return fareBean;
	}
  
}
