package Persistencia;

import java.util.List;
import modelo.personas.*;


public interface ISospechososDao {
    void insertarSospechosos(Persona p);
    List<Persona> leerSospechosos();
    Persona buscarSospechosos(Persona p);
    Persona eliminarSospechosos(Persona p);
}
