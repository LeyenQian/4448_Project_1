import Animals.Animal;
import Animals.Canine.Breed.*;
import Animals.Feline.Breed.*;
import Animals.Pachyderm.Breed.*;
import Animals.Ursidae.Breed.*;
import Zoo.Zoo;
import Zoo.Employee.Type.Zookeeper;


public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n\n----------------------------------------- Zoo Beg -----------------------------------------");

        // Employee
        Zookeeper zoo_keeper = new Zookeeper();
        zoo_keeper.set_identity(9567);
        zoo_keeper.set_name("zoo_keeper_name");

        // Canine
        Animal dog = new Dog();
        Animal wolf = new Wolf();
        dog.set_name("dog_name");
        wolf.set_name("wolf_name");

        // Feline
        Animal cat = new Cat();
        Animal lion = new Lion();
        Animal tiger = new Tiger();
        cat.set_name("cat_name");
        lion.set_name("lion_name");
        tiger.set_name("tiger_name");
        
        // Pachyderm
        Animal elephant = new Elephant();
        Animal hippo = new Hippo();
        Animal rhino = new Rhino();
        elephant.set_name("elephant_name");
        hippo.set_name("hippo_name");
        rhino.set_name("rhino");

        // Ursidae
        Animal panda = new Panda();
        Animal polar_bear= new PolarBear();
        panda.set_name("panda_name");
        polar_bear.set_name("polar_bear_name");

        // Zoo
        Zoo zoo = new Zoo();
        zoo.add_employee(zoo_keeper);
        zoo.add_animal(dog);
        zoo.add_animal(wolf);
        zoo.add_animal(cat);
        zoo.add_animal(lion);
        zoo.add_animal(tiger);
        zoo.add_animal(elephant);
        zoo.add_animal(hippo);
        zoo.add_animal(rhino);
        zoo.add_animal(panda);
        zoo.add_animal(polar_bear);

        zoo_keeper.visit_zoo(zoo, 2);

        System.out.println("----------------------------------------- Zoo End -----------------------------------------\n\n");
    }
}