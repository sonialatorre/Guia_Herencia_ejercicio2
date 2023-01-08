import java.util.Scanner;

public  abstract class Animales {
    protected String  animal;
    protected String peligro;
    protected int edad;

    public Animales (){

    }

    public Animales(String animal, String peligro, int edad) {
        this.animal = animal;
        this.peligro = peligro;
        this.edad = edad;
    }
    public abstract void TipoAnimal();
    public abstract void Alimentacion();

    public void MostrarDatos () {
        System.out.println("el animal es un " + animal + "\n" + "la edad del animal es: " + edad + "\n");


       }

    }


