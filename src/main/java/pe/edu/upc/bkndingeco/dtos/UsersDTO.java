package pe.edu.upc.bkndingeco.dtos;

public class UsersDTO {
    private Long id;
    private String username;
    private String password;
    private Boolean enabled;
    private Integer TipodeCambio;

    private String Nombres;
    private String Apellidos;

    public Integer getTipodeCambio() {
        return TipodeCambio;
    }

    public void setTipodeCambio(Integer tipodeCambio) {
        TipodeCambio = tipodeCambio;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String nombres) {
        Nombres = nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }


}
