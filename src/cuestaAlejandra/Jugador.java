public class Jugador {

    private char color;

    public Jugador(char color) {
        this.color = color;
    }

    public void ponerFicha(Tablero tablero) {
        Coordenada coordenada = new Coordenada();
        do {
            coordenada.pedir();
        } while(!coordenada.esValida() || tablero.estaOcupado(coordenada));
        tablero.ponerFicha(coordenada,color);
    }
}