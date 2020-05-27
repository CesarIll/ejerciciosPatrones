package ejercicios1.prototype;

public class Contrato implements IContrato {

    private int sueldo;
    private int carga_horaria;
    private boolean curso_educacion_superior;
    private boolean acceso_plataforma;
    private boolean marcado_biometrico;
    private String marcado_hora_de_entrada;
    private String marcado_hora_de_salida;
    private String nombre;
    private String apellido;

    public Contrato(int sueldo, int carga_horaria, boolean curso_educacion_superior, boolean acceso_plataforma, boolean marcado_biometrico, String marcado_hora_de_entrada, String marcado_hora_de_salida, String nombre, String apellido) {
        this.sueldo = sueldo;
        this.carga_horaria = carga_horaria;
        this.curso_educacion_superior = curso_educacion_superior;
        this.acceso_plataforma = acceso_plataforma;
        this.marcado_biometrico = marcado_biometrico;
        this.marcado_hora_de_entrada = marcado_hora_de_entrada;
        this.marcado_hora_de_salida = marcado_hora_de_salida;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Contrato () {}

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getCarga_horaria() {
        return carga_horaria;
    }

    public void setCarga_horaria(int carga_horaria) {
        this.carga_horaria = carga_horaria;
    }

    public boolean isCurso_educacion_superior() {
        return curso_educacion_superior;
    }

    public void setCurso_educacion_superior(boolean curso_educacion_superior) {
        this.curso_educacion_superior = curso_educacion_superior;
    }

    public boolean isAcceso_plataforma() {
        return acceso_plataforma;
    }

    public void setAcceso_plataforma(boolean acceso_plataforma) {
        this.acceso_plataforma = acceso_plataforma;
    }

    public boolean isMarcado_biometrico() {
        return marcado_biometrico;
    }

    public void setMarcado_biometrico(boolean marcado_biometrico) {
        this.marcado_biometrico = marcado_biometrico;
    }

    public String getMarcado_hora_de_entrada() {
        return marcado_hora_de_entrada;
    }

    public void setMarcado_hora_de_entrada(String marcado_hora_de_entrada) {
        this.marcado_hora_de_entrada = marcado_hora_de_entrada;
    }

    public String getMarcado_hora_de_salida() {
        return marcado_hora_de_salida;
    }

    public void setMarcado_hora_de_salida(String marcado_hora_de_salida) {
        this.marcado_hora_de_salida = marcado_hora_de_salida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void contrato(){
        System.out.println("Se tiene un contrato con la persona: " + nombre + " " + apellido);
    }

    @Override
    public Object clone() {
        Contrato contrato = new Contrato();
        contrato.sueldo = this.sueldo;
        contrato.carga_horaria = this.carga_horaria;
        contrato.curso_educacion_superior = this.curso_educacion_superior;
        contrato.acceso_plataforma = this.acceso_plataforma;
        contrato.marcado_biometrico = this.marcado_biometrico;
        contrato.marcado_hora_de_entrada = this.marcado_hora_de_entrada;
        contrato.marcado_hora_de_salida = this.marcado_hora_de_salida;
        contrato.nombre = this.nombre;
        contrato.apellido = this.apellido;
        return contrato;
    }
}
