
public class Partida {
    private int id;
    private String resultado;
    private List<Equipo> EquipoLocal;
    private List<Equipo> EquipoVisitante;

    public Partida(int id, String resultado, List<Equipo> EquipoLocal, List<Equipo> EquipoVisitante) {
        this.id = id;
        this.resultado = resultado;
        this.EquipoLocal = EquipoLocal;
        this.EquipoVisitante = EquipoVisitante;
    }
    public void agregarEquipoLocal(Equipo) {
        this.EquipoLocal = Equipo;
    }
    public void agregarEquipoVisitante(Equipo){
        this.EquipoVisitante = Visitante;
    }
    public void quitarEquipoLocal(){
        this.EquipoLocal = null;
    }
    public void quitarEquipoVisitante(){
        this.EquipoVisitante = null;
    }

    }
}
