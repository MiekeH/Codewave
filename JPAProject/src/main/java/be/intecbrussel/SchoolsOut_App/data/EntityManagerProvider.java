package be.intecbrussel.SchoolsOut_App.data;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerProvider {
	
	//public static final EntityManagerProvider emf1= new EntityManagerProvider("ds1");
	
	//public static final EntityManagerProvider emf1= new EntityManagerProvider("ds1");
	
	public static EntityManagerFactory emf;

	public EntityManagerProvider() {
		if (emf ==null) emf = Persistence.createEntityManagerFactory("datasource");
		
	}
	
		
//	private EntityManagerFactory emf;
//	
//	public EntityManagerProvider (String persistenceUnit) {
//		this.emf = Persistence.createEntityManagerFactory(persistenceUnit);
//	}

	public EntityManager getEntityManager() {
		return emf.createEntityManager();
	}



	//voorzie van entitymanager//encapsulation if data afscheremen van de rest
//	public EntityManager getEM() {
//		return emf.createEntityManager();
		
	}
	
	

