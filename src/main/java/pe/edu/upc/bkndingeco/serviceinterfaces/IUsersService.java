package pe.edu.upc.bkndingeco.serviceinterfaces;

import org.springframework.data.repository.query.Param;

import pe.edu.upc.bkndingeco.entities.Operation;
import pe.edu.upc.bkndingeco.entities.Users;

import java.util.List;

public interface IUsersService {
    public void insert(Users users);
    public List<Users> listar();
    public void delete(Long id);
    public Users listarId(Long id);
    public Users findByUsername(String username);

    public void UpdateTipodeCambio(String nombre);

}
