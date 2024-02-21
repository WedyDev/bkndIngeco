package pe.edu.upc.bkndingeco.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import pe.edu.upc.bkndingeco.entities.Users;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface UserRepository extends JpaRepository<Users,Long> {

    public Users findByUsername(String username);
    //Buscar Por Nombre
    @Query("select count(u.username) from Users u where u.username =:username")
    public int buscarUsername(@Param("username") String nombre);

    @Transactional
    @Modifying
    @Query("UPDATE Users u\n"  +
            "SET u.TipodeCambio = CASE\n" +
            "    WHEN u.TipodeCambio = 1 THEN 0\n" +
            "    WHEN u.TipodeCambio = 0 THEN 1\n" +
            "    ELSE u.TipodeCambio\n" +
            "END\n"+
            "WHERE u.username= :username\n"
    )
    public void UpdateTipodeCambio(@Param("username") String nombre);






}
