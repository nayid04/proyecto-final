package modelo.personas;

import Persistencia.*;
import java.util.List;

public class ListaDetective implements IDetectivesDao {

    private IDetectivesDao registroDetectives;

    public ListaDetective() {
        this.registroDetectives = new ArrayListDetective();
    }

    @Override
    public void insertarDetectives(Persona p) {
        this.registroDetectives.insertarDetectives(p);
    }

    @Override
    public List<Persona> leerDetectives() {
        return this.registroDetectives.leerDetectives();
    }

    @Override
    public Persona buscarDetectives(Persona p) {
        return this.registroDetectives.buscarDetectives(p);
    }

    @Override
    public Persona eliminarDetectives(Persona p) {
        return this.registroDetectives.eliminarDetectives(p);
    }

}
