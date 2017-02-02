class Vet
{
    String name;
    Animal animal;
    public Vet(String name)
    {
        this.name = name;
    }

    void Vaccinates(Animal animal)
    {
        System.out.println(name + " is vaccinating");
        System.out.println(animal.type + " has been vaccinated");
        System.out.println(animal.toString());
    }
}