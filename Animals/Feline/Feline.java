package Animals.Feline;
import Animals.Animal;

public class Feline extends Animal
{
    public void sleep()
    {
        int rand = (int) ((Math.random() * (100 - 1)) + 1);
        if( rand <= 60 )
        {
            if( rand <= 30 )
            {
                this.roam();
            }
            else
            {
                this.make_noise();
            }
        }
        else
        {
            super.sleep();
        }
    }
}
