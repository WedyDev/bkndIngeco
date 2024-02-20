package pe.edu.upc.bkndingeco.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.bkndingeco.dtos.UsersDTO;
import pe.edu.upc.bkndingeco.entities.Users;
import pe.edu.upc.bkndingeco.serviceinterfaces.IUsersService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private IUsersService uS;

    @PostMapping
    public void registrar(@RequestBody UsersDTO dto){
        ModelMapper m = new ModelMapper();
        Users u = m.map(dto,Users.class);
        uS.insert(u);
    }

    @GetMapping
    public List<UsersDTO> listar(){
        return uS.listar().stream().map(x-> {
            ModelMapper m = new ModelMapper();
            return m.map(x,UsersDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public UsersDTO listarId(@PathVariable("id") Long id) {
        ModelMapper m=new ModelMapper();
        UsersDTO dto=m.map(uS.listarId(id),UsersDTO.class);
        return dto;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        uS.delete(id);
    }

    @PutMapping("/{id}")
    public void actualizar(@PathVariable("id") Long id, @RequestBody UsersDTO dto) {
        Users usuarioExistente = uS.listarId(id);

        if (usuarioExistente != null) {
            usuarioExistente.setTipodeCambio(dto.getTipodeCambio());
            uS.insert(usuarioExistente);
        }
    }







}
