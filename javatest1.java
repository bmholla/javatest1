
import java.util.Random;

public class javatest1
{
    public static void main(String[] args)
    {
        for(String a : args)
            System.out.println(a);

        Person[] persons = GenPersonList.genPersonList(10);

        for(Person p : persons)
            System.out.println(p.getAge());
    }
}

class Person
{
    private String name = null;
    private int age = 0;

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public int getAge() { return age; }
    public String getName() { return name; }

    public void setAge(int age) { this.age = age; }
    public void setName(String name) {this.name = name;}
}

class GenPersonList
{
    static Person[] genPersonList(int count)
    {
        Person[] personlist = new Person[count];

        Random r = new Random();

        for(int i=0;i<10;i++)
        {
            System.out.println("got here");
            personlist[i] = new Person("", r.nextInt(99));
        }

        return personlist;
    }
}
