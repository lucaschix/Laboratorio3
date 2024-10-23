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
    public  void crearPartido(Partido partido){
        partidos.add(partido);
        System.out.println("Partido agregado");
    }


    public void consultarDisponibilidad(int hora, String cancha, int fecha){
        for(Partido partido : partidos){
            if(partido.getHora()== hora && partido.getFecha().equals(fecha) && partido.getCanchas().equals(cancha)){
                System.out.println("Lo siento  la cancha esta en uso en ese horario");
            }else{
                System.out.println("La cancha esta disponible para el hoaraio que deseas");
                System.out.println("las canchas en horarios ocupados son " + partido.getCanchas());
            }

        }
    }

    public void registrarUsos(){
        for(Partido partido : partidos){
            System.out.println("Hora del partido: "+partido.getHora()+" | Fecha del partido: "+partido.getFecha()+"| Cancha utilizada: "+partido.getCanchas());
        }
    }


}