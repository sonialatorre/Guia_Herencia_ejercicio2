import java.util.Scanner;

public class Carnivoro  extends Animales {

    public Carnivoro(){}

    public Carnivoro(String animal, String peligro, int edad) {
        super(animal, peligro, edad);
    }

    @Override
    public void TipoAnimal() {
        System.out.println("el animal es carnívoro");
    }

    @Override
    public void Alimentacion() {
        System.out.println("el animal se alimenta de carne");
    }

    @Override
    public void MostrarDatos() {
        System.out.println("el animal es un " + animal + "\n" + "la edad del animal es: " + edad + "\n");

        System.out.println("¿El animal es peligroso?, responda Si o No");
        Scanner input = new Scanner(System.in);
        peligro = input.nextLine();
        if (peligro == "si") {
            System.out.println("True");
        } else  {
            System.out.println("False");
            }
        }
    }
