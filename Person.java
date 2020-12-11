public class Person
{
  private String name;
  private int age;
  private String gender;

  public Person(String n, int a, String g)
  {
    name = n;
    age = a;
    gender = g;
  }

  public String toString()
  {
    return "Name: " + name + " | Age: " + age + " | Gender: " + gender;
  }
}