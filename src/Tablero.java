import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

public class Tablero {
    private List<Rectangle> muros;
    private List<Rectangle> pastillas;
    public int anchoVentana = 900;
    public int altoVentana = 700;
    public int anchoTablero = 800;
    public int altoTablero = 600;
    public int coordXTablero = (anchoVentana - anchoTablero) / 2;
    public int coordYTablero = (altoVentana - altoTablero) / 2;
    
    public Tablero() {
        muros = new ArrayList<>();
        muros.clear(); 

        muros.add(new Rectangle(coordXTablero, coordYTablero, 20, altoTablero));
        muros.add(new Rectangle(coordXTablero + anchoTablero - 20, coordYTablero, 20, altoTablero));

        int entradaSuperiorX = coordXTablero + anchoTablero / 2 - 40;
        muros.add(new Rectangle(coordXTablero, coordYTablero, entradaSuperiorX - coordXTablero, 20));
        muros.add(new Rectangle(entradaSuperiorX + 80, coordYTablero, coordXTablero + anchoTablero - (entradaSuperiorX + 80), 20));

        int entradaInferiorX = coordXTablero + anchoTablero / 2 - 40;
        int entradaInferiorY = coordYTablero + altoTablero - 20;
        muros.add(new Rectangle(coordXTablero, entradaInferiorY, entradaInferiorX - coordXTablero, 20));
        muros.add(new Rectangle(entradaInferiorX + 80, entradaInferiorY, coordXTablero + anchoTablero - (entradaInferiorX + 80), 20));

        muros.add(new Rectangle(coordXTablero + 55, coordYTablero + 60, 20, 490)); 
        muros.add(new Rectangle(coordXTablero + 120, coordYTablero + 120, 20, 160)); 
        muros.add(new Rectangle(coordXTablero + 120, coordYTablero + 360, 20, 160));
        muros.add(new Rectangle(coordXTablero + 660, coordYTablero + 120, 20, 160)); 
        muros.add(new Rectangle(coordXTablero + 660, coordYTablero + 360, 20, 160));
        muros.add(new Rectangle(coordXTablero + 200, coordYTablero + 200, 400, 20)); 
        muros.add(new Rectangle(coordXTablero + 200, coordYTablero + 100, 400, 20)); 
        muros.add(new Rectangle(coordXTablero + 200, coordYTablero + 420, 400, 20)); 
        muros.add(new Rectangle(coordXTablero + 280, coordYTablero + 350, 240, 20)); 
        muros.add(new Rectangle(coordXTablero + 400, coordYTablero + 440, 20, 100));
        muros.add(new Rectangle(coordXTablero + 500, coordYTablero + 270, 20, 100)); 
        muros.add(new Rectangle(coordXTablero + 280, coordYTablero + 270, 20, 100)); 
        muros.add(new Rectangle(coordXTablero + 440, coordYTablero + 260, 80, 20)); 
        muros.add(new Rectangle(coordXTablero + 280, coordYTablero + 260, 85, 20)); 
        muros.add(new Rectangle(coordXTablero + 200, coordYTablero + 500,80, 80)); 
        muros.add(new Rectangle(coordXTablero + 500, coordYTablero + 500,80, 80));

        
        
        pastillas = new ArrayList<>();
        inicializarPastillas();

    }
    
    public void inicializarPastillas() {
        pastillas.clear();
        for (int x = coordXTablero + 40; x < coordXTablero + anchoTablero - 40; x += 20) {
            for (int y = coordYTablero + 40; y < coordYTablero + altoTablero - 40; y += 20) {
                Rectangle pastilla = new Rectangle(x, y, 10, 10);
                boolean intersecta = false;
                for (Rectangle muro : muros) {
                    if (pastilla.intersects(muro)) {
                        intersecta = true;
                        break;
                    }
                }
                if ((x >= coordXTablero + 280 && x <= coordXTablero + 500 && y >= coordYTablero + 270 && y <= coordYTablero + 370)) {
                    intersecta = true;
                }
                if (!intersecta) {
                    pastillas.add(pastilla);
                }
            }
        }
    }


    public List<Rectangle> getMuros() {
        return muros;
    }
    
    public List<Rectangle> getPastillas() {
        return pastillas;
    }
    
    public void resetPastillas() {
        inicializarPastillas();
    }
}