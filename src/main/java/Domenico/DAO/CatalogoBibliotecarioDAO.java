package Domenico.DAO;

import Domenico.enteties.CatalogoBibliotecario;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.UUID;

public class CatalogoBibliotecarioDAO {

   private EntityManager em;

   public CatalogoBibliotecarioDAO(EntityManager em){
     this.em=em;
   }

   public void save(CatalogoBibliotecario catalogoBibliotecario){
       EntityTransaction entityTransaction= em.getTransaction();
       entityTransaction.begin();
       em.persist(catalogoBibliotecario);
       entityTransaction.commit();

       System.out.println("Catalogo Costruito");


   }


    public CatalogoBibliotecario findById(UUID codiceISBN) {
        TypedQuery<CatalogoBibliotecario> query = em.createQuery("SELECT c FROM CatalogoBibliotecario c WHERE c.codiceISBN = :id", CatalogoBibliotecario.class);
        query.setParameter("id", codiceISBN);
        return query.getSingleResult();
    }

}
