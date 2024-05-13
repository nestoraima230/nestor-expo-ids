package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.AuthModel;
import views.AuthView;

public class AuthController {
    private AuthView vista;
    private AuthModel modelo;

    public AuthController(AuthView vista) {
        this.vista = vista;
        this.modelo = new AuthModel("Nestor", "12345");
        this.vista.addLoginListener(new LoginListener());
        

    }

     public class LoginListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (modelo != null) {
                String nombreUsuario = vista.getNombreUsuario();
                String contrasena = vista.getContrasena();

                if (modelo.autenticar(nombreUsuario, contrasena)) {
                    System.out.println("Usuario autenticado correctamente");
                } else {
                    System.out.println("Usuario o contraseña incorrectos");
                }
            } else {
                System.out.println("El modelo no ha sido iniciado correctamente");
            }
        }
    }
}
