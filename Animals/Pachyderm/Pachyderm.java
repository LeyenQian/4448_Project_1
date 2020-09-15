package Animals.Pachyderm;
import Animals.Animal;

public class Pachyderm extends Animal
{
    public void charge()
    {
        System.out.println(String.format("#[%s] %s charges.", this.getClass().getSimpleName(), this.name));
    }

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
