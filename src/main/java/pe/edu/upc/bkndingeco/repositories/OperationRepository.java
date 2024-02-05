package pe.edu.upc.bkndingeco.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.bkndingeco.entities.Operation;

@Repository
public interface OperationRepository  extends JpaRepository<Operation,Long> {
}
