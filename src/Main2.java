import models.AuthModel;
import views.AuthView;

public class Main2 {

    public static void main(String[] args) {
        String dbName = "freedb_nestor_arce";
        String dbPassword = "uwDrTJ7Xw!a8v!r";

        AuthModel authModel = new AuthModel(dbName, dbPassword);

        AuthView authView = new AuthView(authModel); 

        authView.mostrarVentana();
    }

}
