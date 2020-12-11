class Main {
  public static void main(String[] args) 
  {
    Adult adult1 = new Adult("Mary", 26, "female", "Teacher", 35000);
    System.out.println(adult1.toString());
    Child child1 = new Child("George", 7, "male", "Pine Grove Elementary");
    System.out.println(child1.toString());
    Child child2 = new Child("Sue", 17, "female", "Eastern Technical High");
    System.out.println(child2.toString());
  }
}