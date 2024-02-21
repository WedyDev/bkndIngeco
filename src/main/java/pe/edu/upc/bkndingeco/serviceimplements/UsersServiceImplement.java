package pe.edu.upc.bkndingeco.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.bkndingeco.entities.Users;
import pe.edu.upc.bkndingeco.repositories.UserRepository;
import pe.edu.upc.bkndingeco.serviceinterfaces.IUsersService;


import java.util.List;

@Service
public class UsersServiceImplement implements IUsersService {
    @Autowired
    private UserRepository uR;
    @Override
    public void insert(Users users) {
        uR.save(users);
    }

    @Override
    public List<Users> listar() {
        return uR.findAll();
    }

    @Override
    public void delete(Long id) {
        uR.deleteById(id);
    }

    @Override
    public Users listarId(Long id) {
        return uR.findById(id).orElse(new Users());
    }

    @Override
    public void UpdateTipodeCambio(String nombre) {
        uR.UpdateTipodeCambio(nombre);
    }


}
