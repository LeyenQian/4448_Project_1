package Animals.Canine.Breed;
import Animals.Canine.Canine;


public class Dog extends Canine
{
    public Dog(String name)
    {
        super(name);
    }
    
    // polymorphism: add more function
    public void dig()
    {
        System.out.println(String.format("#[%s] %s digs.", this.type, this.name));
    }

    // polymorphism: override the roam function
    public void roam()
    {
        int rand = (int) ((Math.random() * (100 - 1)) + 1);
        if ( rand <= 25 )
        {
            this.dig();
            return;
        }

        // call the original roam function
        super.roam();
    }
}
