package modelo;

public class Usuario {
    
    private String usuario;
    private String password;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String telefono;
    private String situaciónLaboral;
    private String sexo;
    private String otros;
    private String email;

    public Usuario(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }
    
    

    public Usuario(String usuario, String password, String nombre, String apellido1, String apellido2, String telefono, String situaciónLaboral, String sexo, String otros) {
        this.usuario = usuario;
        this.password = password;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.telefono = telefono;
        this.situaciónLaboral = situaciónLaboral;
        this.sexo = sexo;
        this.otros = otros;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getSituaciónLaboral() {
        return situaciónLaboral;
    }

    public void setSituaciónLaboral(String situaciónLaboral) {
        this.situaciónLaboral = situaciónLaboral;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getOtros() {
        return otros;
    }

    public void setOtros(String otros) {
        this.otros = otros;
    }

        
}
