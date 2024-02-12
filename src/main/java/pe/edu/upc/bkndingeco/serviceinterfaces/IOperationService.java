package pe.edu.upc.bkndingeco.serviceinterfaces;

import org.springframework.data.repository.query.Param;
import pe.edu.upc.bkndingeco.entities.Operation;

import java.util.List;

public interface IOperationService {
    public void insert(Operation operation);

    List<Operation> list();

    public void delete(Long idOperation);

    public Operation listId(Long idOperation);
    List<Operation> buscarUsuario(@Param("username") String users);

}
