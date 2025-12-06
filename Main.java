public class Main {
    public static void main(String[] args) {
        Camara camara = new CamaraBasica();
        Flash flash = new Flash();

        Celular celular = new Celular(camara, flash);
        celular.tomarFoto();
    }
}
