class Main {
  public static void main(String[] args){
    String fullName = getFullName("Michael", "Alcocer");
    System.out.println(fullName);
  }
  
  public static String getFullName(String firstName, String lastName){
    return firstName + " " + lastName;
  }
}
