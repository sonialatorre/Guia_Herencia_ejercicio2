public class Main {
    public static void main(String[] args) {
        Carnivoro carnivoro= new Carnivoro("León", "No", 5);
                carnivoro.TipoAnimal();
                carnivoro.Alimentacion();
                carnivoro.MostrarDatos();

        Hervivoro hervivoro=new Hervivoro ("Jirafa", "No", 10);
        hervivoro.TipoAnimal();
        hervivoro.Alimentacion();
        hervivoro.MostrarDatos();
    }
}