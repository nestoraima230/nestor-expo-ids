import models.AuthModel;
import views.AuthView;

public class Main2 {

    public static void main(String[] args) {
        AuthModel authModel = new AuthModel("Nestor", "12345");

        AuthView authView = new AuthView(authModel); 
        authView.mostrarVentana();
    }

}
