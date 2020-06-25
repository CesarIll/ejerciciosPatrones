package proxy;

public class Proxy implements IServidor {
    private Servidor servidor;
    private ServidorSecundario servidorSecundario;

    public Proxy(){
        servidor = new Servidor();
        servidorSecundario = new ServidorSecundario();
    }

    @Override
    public Archivo descargaArchivo(String nombre, String extension) {
        return servidor.descargaArchivo(nombre, extension);
    }

    @Override
    public void cargaArchivo(Archivo archivo) {
        if (archivo.getExtension().equals(".rar") || archivo.getExtension().equals(".zip")) {
            servidor.cargaArchivo(archivo);
            servidorSecundario.cargaArchivo(archivo);
            System.out.println("El archivo "+ archivo.getNombre() +" fue cargado correctamente a ambos servidores.");
        } else {
            System.out.println("Error. No se puede subir archivos que no sean de extension .rar o .zip.");
        }
    }
}
