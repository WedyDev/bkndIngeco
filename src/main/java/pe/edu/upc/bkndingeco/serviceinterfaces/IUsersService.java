package pe.edu.upc.bkndingeco.serviceinterfaces;

import pe.edu.upc.bkndingeco.entities.Users;

import java.util.List;

public interface IUsersService {
    public void insert(Users users);
    public List<Users> listar();
    public void delete(Long id);
    public Users listarId(Long id);

}
