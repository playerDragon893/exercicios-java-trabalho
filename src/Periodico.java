// Classe Periodico herda as caracteristicas de ItemBiblioteca
public class Periodico extends ItemBiblioteca {

    // Numero do volume do periodico
    private int volume;

    // Construtor
    public Periodico(String titulo, int volume) {
        super(titulo);
        this.volume = volume;
    }

    // Retorna o numero do volume
    public int getVolume() {
        return volume;
    }
}