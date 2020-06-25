package proxy;

import java.util.LinkedList;
import java.util.List;

public class Servidor implements IServidor {
    private List<Archivo> archivos = new LinkedList<>();

    @Override
    public Archivo descargaArchivo(String nombre, String extension) {
        Archivo archivoToReturn = archivos.stream().filter(archivo -> archivo.getNombre().equals(nombre) && archivo.getExtension().equals(extension)).findFirst().orElse(null);
        if (archivoToReturn == null) {
            System.out.println("No se encontró dicho archivo. Se retornó null.");
        } else {
            System.out.println("Se retornó el archivo " + archivoToReturn.getNombre() + archivoToReturn.getExtension()+  " correctamente.");
        }
        return archivoToReturn;
    }

    @Override
    public void cargaArchivo(Archivo archivo) {
        archivos.add(archivo);
    }
}
