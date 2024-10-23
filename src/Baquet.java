import java.util.List;

public class Baquet {
    private List<Deportista> deportistas;
    private List<Entrenador> entrenadores;



    private List<Partido>partidos;

    public Baquet(List<Deportista> deportistas, List<Entrenador>entrenadores, List<Partido> partidos) {
        this.deportistas = deportistas;
        this.entrenadores= entrenadores;
        this.partidos = partidos;
    }
    public List<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(List<Partido> partidos) {
        this.partidos = partidos;
    }

    public List<Deportista> getDeportistas() {
        return deportistas;
    }

    public void setDeportistas(List<Deportista> deportistas) {
        this.deportistas = deportistas;
    }


    public List<Entrenador> getEntrenadores() {
        return entrenadores;
    }

    public void setEntrenadores(List<Entrenador> entrenadores) {
        this.entrenadores = entrenadores;
    }
    public void crearDeportista(Deportista deportista){
        deportistas.add(deportista);
        System.out.println("Deportista creado");
    }
    public void crearEntrenador(Entrenador entrenador){
        entrenadores.add(entrenador);
        System.out.println("Entrenador creado");
    }

    public void verificarhorario(Partido partido){
        for (Partido partido : partidos){
            if(partido.getFecha()=){

            }
        }
    }
}