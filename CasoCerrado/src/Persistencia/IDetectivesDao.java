package Persistencia;

import java.util.List;
import modelo.personas.*;

public interface IDetectivesDao {
    void insertarDetectives(Persona p);
    List<Persona> leerDetectives();
    Persona buscarDetectives(Persona p);
    Persona eliminarDetectives(Persona p);
}
