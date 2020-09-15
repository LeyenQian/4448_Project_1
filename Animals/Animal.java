package Animals;


// we set Animal as an abstract class, all other class like <Canine> or <Cat> shall extends this class.
// Abstraction and polymorphism are highly related, we may consider those subclasses are the implementation of polymorphism.
public abstract class Animal
{
    // encapsulation: type and name are only visible to subclass, other classes can only gain access through getter and setter functions.
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

    // all animals share some behaviors in common.
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