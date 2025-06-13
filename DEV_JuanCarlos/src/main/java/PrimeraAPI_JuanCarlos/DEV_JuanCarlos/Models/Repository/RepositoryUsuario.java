package PrimeraAPI_JuanCarlos.DEV_JuanCarlos.Models.Repository;


import PrimeraAPI_JuanCarlos.DEV_JuanCarlos.Models.DTO.DTOUsuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional //Librería depende de jakarta-transaction-API
public class RepositoryUsuario implements InterfaceUsuario{

    @PersistenceContext
    private EntityManager entityManager;

    @Override @Transactional /* Override sobreescribe el método (haiendolo más fuerte), Transactional se comunica con la DB */
    public List<DTOUsuario> obtenerDatos(){

        //No se especifica el QUERY, sino solo el DTO
        String query = "FROM DTOUsuario";
        //Retornamos lo que se hizo en la DB
        return entityManager.createQuery(query).getResultList();
    }
}