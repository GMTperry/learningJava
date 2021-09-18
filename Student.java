public class Student {
  //instance field
  String studentName;
  int studentAge;
  boolean isVaccinated;
  char gradeAverage;

  // constructor method
  public Student(String name, int age, boolean vaccinated, char gradeAverage) {
    System.out.println("This message will appear how many times there are students");
    studentName = name;
    studentAge = age;
    isVaccinated = vaccinated;
    this.gradeAverage = gradeAverage; //this. in java allows us to assign same name variables to each other without having to create a new name like I did with the others.
  }

  // methods go here
  public void greet(){
    System.out.print("Hello everyone, my name is " + studentName + ".");
    System.out.print("I am " + studentAge + " years old.");
    System.out.print("My grade point average is currently an " + gradeAverage + ".");
    System.out.println("I am vaccinated."); // next challenge is to make a separate greet where depending if the persons vaccinated, they greet differently
  } 

  // The main method executes the tasks of the class
  public static void main(String[] args) {
    Student perryDongmo = new Student("Perry Dongmo", 16, true, 'B');
    Student gillesDongmo = new Student("Gilles Dongmo", 18, false, 'C');
    Student mrTodaro = new Student("mr.Todaro", 27, true, 'n');
    Student test = new Student("Bill", 16, false, 'C');
    

    System.out.println("Hello " + perryDongmo.studentName); //reminds me of the scanner code for input.
    System.out.println("Hey " + gillesDongmo.studentName);
    System.out.println("Hello everyone, I'll be your teacher for this week, you can call me " + mrTodaro.studentName);
    System.out.println("Hey guys, my name is " + test.studentName);
    System.out.println("I am " + test.studentAge + ".");

    // instead of doing the code above for every one of our students, we can just write a method that does that and then call it
    perryDongmo.greet();
    gillesDongmo.greet();
    test.greet();
    mrTodaro.greet();
  } 
}
