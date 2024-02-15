package pe.edu.upc.bkndingeco.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.bkndingeco.entities.Operation;
import pe.edu.upc.bkndingeco.entities.Users;

import java.util.List;

@Repository
public interface OperationRepository  extends JpaRepository<Operation,Long> {
    //@Query("SELECT o.id,o.capitalizacion,o.fecha_operacion,o.monto,o.periodo,o.porcentaje_tasa , o.tipo_deposito,o.tipo_periodo,o.tipo_tasa,o.users.id FROM Operation o where o.users.id=:user_id")
   // List<Operation> buscarUsuario(@Param("user_id") Long users);
    @Query("SELECT o FROM Operation o where o.users.username=:username order by o.id" )
    List<Operation> buscarUsuario(@Param("username") String users);

}
