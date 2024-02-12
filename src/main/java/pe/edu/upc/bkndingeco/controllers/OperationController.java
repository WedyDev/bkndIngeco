package pe.edu.upc.bkndingeco.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.bkndingeco.dtos.OperationDTO;
import pe.edu.upc.bkndingeco.dtos.RoleDTO;
import pe.edu.upc.bkndingeco.dtos.UsersDTO;
import pe.edu.upc.bkndingeco.entities.Operation;
import pe.edu.upc.bkndingeco.entities.Users;
import pe.edu.upc.bkndingeco.serviceinterfaces.IOperationService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/operation")
public class OperationController {
    @Autowired
    private IOperationService ioS;


    @PostMapping
    public void registrar(@RequestBody Operation dto){
        ModelMapper m = new ModelMapper();
        Operation u = m.map(dto,Operation.class);
        ioS.insert(u);
    }
    @GetMapping
    public List<OperationDTO> list()
    {
        return ioS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,OperationDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public OperationDTO listId(@PathVariable("id") Long id) {
        ModelMapper m = new ModelMapper();
        OperationDTO dto=m.map(ioS.listId(id),OperationDTO.class);
        return dto;
    }

    @GetMapping("/username/{users}")
    public List<OperationDTO> buscarUsuario(@PathVariable("users") String  users) {

        return ioS.buscarUsuario(users).stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,OperationDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        ioS.delete(id);
    }

    @PutMapping()
    public void Update(@RequestBody OperationDTO dto){
        ModelMapper m = new ModelMapper();
        Operation c = m.map(dto, Operation.class);
        ioS.insert(c);
    }

}
