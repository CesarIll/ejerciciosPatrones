package ejercicios3.chainOfResponsabilities_2;

public class Persona {
    private boolean tieneCertificadoDeNacimiento;
    private boolean tienePagoAlBanco;
    private boolean tieneFicha;

    public Persona(boolean tieneCertificadoDeNacimiento, boolean tienePagoAlBanco, boolean tieneFicha) {
        this.tieneCertificadoDeNacimiento = tieneCertificadoDeNacimiento;
        this.tienePagoAlBanco = tienePagoAlBanco;
        this.tieneFicha = tieneFicha;
    }

    public boolean isTieneCertificadoDeNacimiento() {
        return tieneCertificadoDeNacimiento;
    }

    public void setTieneCertificadoDeNacimiento(boolean tieneCertificadoDeNacimiento) {
        this.tieneCertificadoDeNacimiento = tieneCertificadoDeNacimiento;
    }

    public boolean isTienePagoAlBanco() {
        return tienePagoAlBanco;
    }

    public void setTienePagoAlBanco(boolean tienePagoAlBanco) {
        this.tienePagoAlBanco = tienePagoAlBanco;
    }

    public boolean isTieneFicha() {
        return tieneFicha;
    }

    public void setTieneFicha(boolean tieneFicha) {
        this.tieneFicha = tieneFicha;
    }

}
