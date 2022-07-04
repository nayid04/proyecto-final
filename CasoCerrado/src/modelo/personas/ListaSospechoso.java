package modelo.personas;

import Persistencia.*;
import java.util.List;


public class ListaSospechoso implements ISospechososDao {
    private ISospechososDao registroSospechosos;

    public ListaSospechoso() {
        this.registroSospechosos = new ArrayListSospechosos();
    }

    @Override
    public void insertarSospechosos(Persona p) {
        this.registroSospechosos.insertarSospechosos(p);
    }

    @Override
    public List<Persona> leerSospechosos() {
        return this.registroSospechosos.leerSospechosos();
    }

    @Override
    public Persona buscarSospechosos(Persona p) {
        return this.registroSospechosos.buscarSospechosos(p);
    }

    @Override
    public Persona eliminarSospechosos(Persona p) {
        return this.registroSospechosos.eliminarSospechosos(p);
    }
}
