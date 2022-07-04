package Persistencia;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.casos.*;
import Persistencia.*;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.table.DefaultTableModel;
import modelo.personas.*;


public class ArchivoTxt {
    
    public static FileWriter salvar;
    
    public ArchivoTxt(){
        
    }
    
    public static void limpiarTextCasos() {
        try {
            salvar = new FileWriter("DatosCasos.txt");
            salvar.write("");

            salvar.close();
        } catch (IOException x) {
            JOptionPane.showMessageDialog(null, "error");
        }
    }
    
    public static void limpiarTextDetectives() {
        try {
            salvar = new FileWriter("DatosDetectives.txt");
            salvar.write("");

            salvar.close();
        } catch (IOException x) {
            JOptionPane.showMessageDialog(null, "error");
        }
    }
    
    public static void limpiarTextSospechosos() {
        try {
            salvar = new FileWriter("DatosSospechosos.txt");
            salvar.write("");

            salvar.close();
        } catch (IOException x) {
            JOptionPane.showMessageDialog(null, "error");
        }
    }
    
    public void textCasos(ListaCasos modelo) {

        try {
            salvar = new FileWriter("DatosCasos.txt");
            List<Caso> lista = modelo.leerCasos();
            for (Caso c: lista) {
                salvar.write(c.getDataStringFormat());
            }

            salvar.close();
        } catch (IOException x) {
            JOptionPane.showMessageDialog(null, "error");
        }

    }
    
    public void textDetectives(ListaDetective modelo) {

        try {
            salvar = new FileWriter("DatosDetectives.txt");
            List<Persona> lista = modelo.leerDetectives();
            for (Persona p : lista) {
                salvar.write(p.getDataStringFormat());
            }

            salvar.close();
        } catch (IOException x) {
            JOptionPane.showMessageDialog(null, "error");
        }

    }
    
    public void textSospechosos(ListaSospechoso modelo) {

        try {
            salvar = new FileWriter("DatosSospechosos.txt");
            List<Persona> lista = modelo.leerSospechosos();
            for (Persona p : lista) {
                salvar.write(p.getDataStringFormat());
            }

            salvar.close();
        } catch (IOException x) {
            JOptionPane.showMessageDialog(null, "error");
        }

    }
    
    public void datosTextCasos(DefaultTableModel modelo_tabla) {
        BufferedReader bufferedReader = null;

        try {
            
            bufferedReader = new BufferedReader(new FileReader("DatosCasos.txt"));
            String line = bufferedReader.readLine();

            while (line != null) {
                String[] rowfields = line.split(";");
                modelo_tabla.addRow(rowfields);
                line = bufferedReader.readLine();
            }

        } catch (IOException x) {
            JOptionPane.showMessageDialog(null, "error");
        }

    }
    
    public void datosTextDetectives(DefaultTableModel modelo_tabla) {
        BufferedReader bufferedReader = null;

        try {
            
            bufferedReader = new BufferedReader(new FileReader("DatosDetectives.txt"));
            String line = bufferedReader.readLine();

            while (line != null) {
                String[] rowfields = line.split(";");
                modelo_tabla.addRow(rowfields);
                line = bufferedReader.readLine();
            }

        } catch (IOException x) {
            JOptionPane.showMessageDialog(null, "error");
        }

    }
    
    public void datosTextSospechosos(DefaultTableModel modelo_tabla) {
        BufferedReader bufferedReader = null;

        try {
            
            bufferedReader = new BufferedReader(new FileReader("DatosSospechosos.txt"));
            String line = bufferedReader.readLine();

            while (line != null) {
                String[] rowfields = line.split(";");
                modelo_tabla.addRow(rowfields);
                line = bufferedReader.readLine();
            }

        } catch (IOException x) {
            JOptionPane.showMessageDialog(null, "error");
        }

    }
}
