package proxy;

import java.util.LinkedList;
import java.util.List;

public class ServidorSecundario implements IServidor {
    private List<Archivo> archivos = new LinkedList<>();

    @Override
    public Archivo descargaArchivo(String nombre, String extension) {
        return archivos.stream().filter(archivo -> archivo.getNombre().equals(nombre) && archivo.getExtension().equals(extension)).findFirst().orElse(null);
    }

    @Override
    public void cargaArchivo(Archivo archivo) {
        archivos.add(archivo);
    }
}
