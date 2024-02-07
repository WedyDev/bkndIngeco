package pe.edu.upc.bkndingeco.entities;


import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.ManyToOne;
@Entity
@Table(name = "operation")
public class Operation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "tipo_deposito",length = 60,nullable = false)
    private String tipo_deposito;
    @Column(name = "monto",nullable = false)

    private Double monto;
    @Column(name = "tipo_tasa",length = 60,nullable = false)

    private String tipo_tasa;
    @Column(name = "tipo_periodo",length = 60,nullable = false)

    private String tipo_periodo;
    @Column(name = "periodo" ,nullable = false)

    private Integer periodo;
    @Column(name = "porcentaje_tasa" ,nullable = false)

    private Double porcentaje_tasa;


    @Column(name = "capitalizacion" ,nullable = false)
    private Integer capitalizacion;
    @Column(name = "fecha_operacion" ,nullable = false)

    private LocalDate fecha_operacion;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id", nullable=false)
    private Users users;



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
    public Integer getCapitalizacion() {
        return capitalizacion;
    }

    public void setCapitalizacion(Integer capitalizacion) {
        this.capitalizacion = capitalizacion;
    }


    public Double getPorcentaje_tasa() {
        return porcentaje_tasa;
    }

    public void setPorcentaje_tasa(Double porcentaje_tasa) {
        this.porcentaje_tasa = porcentaje_tasa;
    }



    public LocalDate getFecha_operacion() {
        return fecha_operacion;
    }

    public void setFecha_operacion(LocalDate fecha_operacion) {
        this.fecha_operacion = fecha_operacion;
    }


    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }


}
