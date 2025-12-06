public class Celular {
    private Camara camara;
    private Flash flash;

    public Celular(Camara camara, Flash flash) {
        this.camara = camara;
        this.flash = flash;
    }

    public void tomarFoto() {
        System.out.println("Usuario presiona el boton de la camara");

        flash.encender();
        camara.tomarFoto();
        flash.apagar();
    }
}
