package clases;
import java.util.Date;
public class Paciente {
    public String nombre;
    public String apellido;
    public String telefono;
    public String tipoDoc;
    public String codDoc;
    public String domicilio;
    public Date fechaNac;

    public Paciente() {
    }

    public Paciente(String nombre, String apellido, String telefono, String tipoDoc, String codDoc, String domicilio, Date fechaNac) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.tipoDoc = tipoDoc;
        this.codDoc = codDoc;
        this.domicilio = domicilio;
        this.fechaNac = fechaNac;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public String getCodDoc() {
        return codDoc;
    }

    public void setCodDoc(String codDoc) {
        this.codDoc = codDoc;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    
}
