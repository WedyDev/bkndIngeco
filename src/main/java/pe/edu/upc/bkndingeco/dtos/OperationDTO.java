package pe.edu.upc.bkndingeco.dtos;

import pe.edu.upc.bkndingeco.entities.Users;

import javax.persistence.*;
import java.time.LocalDate;

public class OperationDTO {

    private Long id;
    private String tipo_deposito;

    private Double monto;

    private String tipo_tasa;

    private String tipo_periodo;

    private Integer periodo;

    private Double porcentaje_tasa;
    private Integer capitalización;

    private LocalDate fecha_operacion;
    private UsersDTO users;

    public UsersDTO getUsers() {
        return users;
    }

    public void setUsers(UsersDTO users) {
        this.users = users;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo_deposito() {
        return tipo_deposito;
    }

    public void setTipo_deposito(String tipo_deposito) {
        this.tipo_deposito = tipo_deposito;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public String getTipo_tasa() {
        return tipo_tasa;
    }

    public void setTipo_tasa(String tipo_tasa) {
        this.tipo_tasa = tipo_tasa;
    }

    public String getTipo_periodo() {
        return tipo_periodo;
    }

    public void setTipo_periodo(String tipo_periodo) {
        this.tipo_periodo = tipo_periodo;
    }

    public Integer getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Integer periodo) {
        this.periodo = periodo;
    }

    public Double getPorcentaje_tasa() {
        return porcentaje_tasa;
    }

    public void setPorcentaje_tasa(Double porcentaje_tasa) {
        this.porcentaje_tasa = porcentaje_tasa;
    }

    public Integer getCapitalización() {
        return capitalización;
    }

    public void setCapitalización(Integer capitalización) {
        this.capitalización = capitalización;
    }

    public LocalDate getFecha_operacion() {
        return fecha_operacion;
    }

    public void setFecha_operacion(LocalDate fecha_operacion) {
        this.fecha_operacion = fecha_operacion;
    }




}
