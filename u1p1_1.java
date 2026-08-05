class Animal
{
    String name="Animal";
    
    void eat()
    {
    System.out.println("this animal eats food");

    }
    }
    class puppy extends Dog
    {

        void weep()
        {
             System.out.println("dog barks: woof ! woof!.");
        
        }
    }
    public class u2p1_1
    {
         public static void main(String[] args)
         {
            puppy p=new puppy();
            p.eat();
            p.bark();
            p.weep();
         }
         
    }