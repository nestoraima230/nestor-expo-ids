import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class User {
    private String nombreUsuario;
    private String contraseña;
    private String correoElectronico;
    private String apellidos;

    public User(String nombreUsuario, String contraseña, String correoElectronico, String apellidos) {
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.correoElectronico = correoElectronico;
        this.apellidos = apellidos;
    }

    public User(String lineaUsuario) {
        String[] partes = lineaUsuario.split(",");
        this.nombreUsuario = partes[0];
        this.contraseña = partes[1];
        this.correoElectronico = partes[2];
        this.apellidos = partes[3];
    }

    // Getters
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public String getApellidos() {
        return apellidos;
    }
}
