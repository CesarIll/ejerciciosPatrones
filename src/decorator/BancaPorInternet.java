package decorator;

public class BancaPorInternet extends NuevasFuncionalidades{
    private boolean enable;

    public BancaPorInternet(Banco banco) {
        super(banco);
        System.out.println("Agregada la nueva funcionalidad \"Banca por internet\"");
    }

    public void enable(){
        enable = true;
    }

    public void disable(){
        enable = false;
    }

    public void showData() {
        super.showData();
        if (enable) {
            System.out.println("Banca por internet habilitada");
        } else {
            System.out.println("Banca por internet deshabilitada");
        }
    }
}
