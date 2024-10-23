import java.util.List;

public class Partido {
    private String fecha;
    private String equipos;
    private List<Cancha> canchas;
    private int hora;

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    private int hora;
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }



    public String getEquipos() {
        return equipos;
    }

    public void setEquipos(String equipos) {
        this.equipos = equipos;
    }




    public List<Cancha> getCanchas() {
        return canchas;
    }

    public void setCanchas(List<Cancha> canchas) {
        this.canchas = canchas;
    }

    public void crearcanchas(Cancha cancha){
        canchas.add(cancha);
        System.out.println("Cancha creada");
    }


}