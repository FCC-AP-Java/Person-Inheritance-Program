public class Child extends Person
{
  private String school;

  public Child(String n, int a, String g, String s)
  {
    super(n, a, g);
    school = s;
  }

  public String toString()
  {
    return super.toString() + " | School: " + school;
  }
}