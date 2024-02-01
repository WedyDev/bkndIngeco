package pe.edu.upc.bkndingeco.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
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

    @Query(value = "SELECT u.genero, COUNT(u.id) AS Cantidad\n" +
            " FROM users u\n" +
            " GROUP BY genero",nativeQuery = true)
    List<String[]> cantidad_usuarios_bygenero();
}
