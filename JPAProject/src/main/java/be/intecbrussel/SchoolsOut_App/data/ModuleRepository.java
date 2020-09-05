package be.intecbrussel.SchoolsOut_App.data;

import java.util.List;

import javax.persistence.EntityManager;



public class ModuleRepository {
	public static Module insertNewModule(Module module) {
		EntityManager em = new EntityManagerProvider().getEntityManager();
		em.getTransaction().begin();
		em.persist(module);
		em.getTransaction().commit();
		return new Module();
	}
	
	public static Module readModule (Long index){
		EntityManager em = new EntityManagerProvider().getEntityManager();
		Module module = em.find(Module.class,index);
		System.out.println(module.toString());
		return module;
	}
	
	
	public static Module updateModule(Module module) {
		EntityManager em = new EntityManagerProvider().getEntityManager();
		em.getTransaction().begin();
		em.merge(module);
		em.getTransaction().commit();
		return module;
	}
	
	public static StringBuilder deleteModuleWithIndex (Long index){
		EntityManager em = new EntityManagerProvider().getEntityManager();
		Module module = em.find(Module.class,index);
		em.getTransaction().begin();
		em.remove(module);
		em.getTransaction().commit();
		StringBuilder sb = new StringBuilder();
		sb.append(module);
		StringBuilder message = sb.append("you have deleted Userrecord with index" +index);
		return message;
		
	}
	
	
	public static List<Module> AllModules() {
		EntityManager em = new EntityManagerProvider().getEntityManager();
		List<Module> result = em.createQuery("from Module", Module.class).getResultList();
		em.getTransaction().begin();
		em.getTransaction().commit();
		em.close();
		return result;
	}
	
}
