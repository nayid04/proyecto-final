package Persistencia;

import java.util.List;
import modelo.casos.*;

public interface ICasosDao {
    void insertarCasos(Caso c);
    List<Caso> leerCasos();
    Caso buscarCasos(Caso c);
    Caso eliminarCasos(Caso c);
}
