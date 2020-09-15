package Animals;


public abstract class Animal
{
    protected String type = this.getClass().getSimpleName();
    protected String name;

    public String get_type()
    {
        return this.type;
    }
    
    public boolean set_name(String name)
    {
        if ( !name.toUpperCase().startsWith(this.type.substring(0, 1).toUpperCase()) )
        {
            System.out.println(String.format("#[%s] set name failed, name must starts with the character '%s' or '%s'.", this.type, this.type.substring(0, 1), this.type.substring(0, 1).toUpperCase()));    
            return false;
        }

        this.name = name;
        return true;
    }

    public String get_name()
    {
        return this.name;
    }

    public void wake_up()
    {
        System.out.println(String.format("#[%s] %s wakes up.", this.type, this.name));
    }

    public void sleep()
    {
        System.out.println(String.format("#[%s] %s sleeps.", this.type, this.name));
    }

    public void eat()
    {
        System.out.println(String.format("#[%s] %s eats.", this.type, this.name));
    }

    public void make_noise()
    {
        System.out.println(String.format("#[%s] %s makes noise.", this.type, this.name));
    }

    public void roam()
    {
        System.out.println(String.format("#[%s] %s roams.", this.type, this.name));
    }






    // test cases
    public static void main(String[] args)
    {
        Animal animal_test = new Animal(){};
        animal_test.set_name("ttt");

        animal_test.set_name("animal normal");
        System.out.println(animal_test.get_name());

        animal_test.set_name("Animal capital");
        System.out.println(animal_test.get_name());

        animal_test.roam();
        animal_test.eat();
        animal_test.sleep();
        animal_test.make_noise();
        animal_test.wake_up();
    }
}