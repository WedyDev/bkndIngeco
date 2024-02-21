package pe.edu.upc.bkndingeco.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.bkndingeco.entities.Operation;
import pe.edu.upc.bkndingeco.entities.Users;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<Users,Long> {

    public Users findByUsername(String username);
    //Buscar Por Nombre
    @Query("select count(u.username) from Users u where u.username =:username")
    public int buscarUsername(@Param("username") String nombre);

    @Query("SELECT u FROM Users u WHERE u.username =:username" )
    List<Operation> findusername(@Param("username") String username);



}
