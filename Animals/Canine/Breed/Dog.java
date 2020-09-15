package Animals.Canine.Breed;
import Animals.Canine.Canine;


public class Dog extends Canine
{
    public void dig()
    {
        System.out.println(String.format("#[%s] %s digs.", this.getClass().getSimpleName(), this.name));
    }

    public void roam()
    {
        int rand = (int) ((Math.random() * (100 - 1)) + 1);
        if ( rand <= 25 )
        {
            this.dig();
            return;
        }

        super.roam();
    }
}
