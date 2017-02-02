public class VetDrive
{

    public static void main(String[] args)
    {
        String name = "Dr. Doyle";
        Vet newVet = new Vet(name);

        Animal cat = new Cat("cat",10,'f');
        Animal dog = new Dog("dog", 8,'m');
        newVet.Vaccinates(cat);
        newVet.Vaccinates(dog);

        Animal[] animalArray = new Animal[] {cat,dog};


    }
}