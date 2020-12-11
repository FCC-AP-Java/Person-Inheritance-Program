public class Adult extends Person
{
  private String job;
  private int salary;

  public Adult(String n, int a, String g, String j, int s)
  {
    super(n, a, g);
    job = j;
    salary = s;
  }

  public String toString()
  {
    return super.toString() + " | Job: " + job + " | Salary: $" + salary;
  }
}