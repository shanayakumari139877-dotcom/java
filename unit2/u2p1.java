class Animal
{
    String name="Animal";
    
    void eat()
    {
    System.out.println("this animal eats food");

    }
    }
    class Dog extends Animal
    {

        void bark()
        {
             System.out.println("dog barks: woof ! woof!.");
        
        }
    }
    public class u2p1
    {
         public static void main(String[] args)
         {
            Dog myDog=new Dog();
            myDog.eat();
            myDog.bark();
         }
         
    }
         
