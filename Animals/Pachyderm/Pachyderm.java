package Animals.Pachyderm;
import Animals.Animal;


public class Pachyderm extends Animal
{
    // polymorphism: add more function in addition to the functions inherit from Animal class
    public void charge()
    {
        System.out.println(String.format("#[%s] %s charges.", this.type, this.name));
    }

    // polymorphism: override the roam function in the second level subclasss
    public void roam()
    {
        int rand = (int) ((Math.random() * (100 - 1)) + 1);
        if( rand <= 25 )
        {
            this.charge();
            return;
        }

        super.roam();
    }
}
