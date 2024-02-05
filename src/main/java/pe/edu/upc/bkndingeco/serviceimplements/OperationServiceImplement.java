package pe.edu.upc.bkndingeco.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.bkndingeco.entities.Operation;
import pe.edu.upc.bkndingeco.repositories.OperationRepository;
import pe.edu.upc.bkndingeco.serviceinterfaces.IOperationService;

import java.util.List;

@Service
public class OperationServiceImplement implements IOperationService {

    @Autowired
    private OperationRepository oR;

    @Override
    public void insert(Operation operation) {
        oR.save(operation);
    }

    @Override
    public List<Operation> list() {
        return oR.findAll();
    }

    @Override
    public void delete(Long idOperation) {
        oR.deleteById(idOperation);
    }

    @Override
    public Operation listId(Long idOperation) {
        return oR.findById(idOperation).orElse(new Operation());
    }
}
