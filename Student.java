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
  public void greet(boolean isVaccinated){
    System.out.print("Hello everyone, my name is " + studentName + ".");
    System.out.print("I am " + studentAge + " years old.");
    System.out.print("My grade point average is currently an " + gradeAverage + ".");
    System.out.println("Is student vaccinated: " + isVaccinated); 
  }
  public void greet(String isVaccinated){
    System.out.print("Hello everyone, my name is " + studentName + ".");
    System.out.print("I am " + studentAge + " years old.");
    System.out.print("My grade point average is currently an " + gradeAverage + ".");
    System.out.println("Is student vaccinated: " + isVaccinated); 
  }
  public void greet(){
    System.out.print("Hello everyone, my name is " + studentName + ".");
    System.out.print("I am " + studentAge + " years old.");
    System.out.print("My grade point average is currently an " + gradeAverage + ".");
    System.out.println("I am vaccinated"); 
  }  //as you can see, we can have the same methods as long as the parameters are different.
  // method below tests the return function to see if the student is 18 years old.
  public int consent(){
    int ageOfConsent = 18 - studentAge;
    return ageOfConsent;
  } //void methods cannot return a value so we have to remove a void and replace it with another one like int. We want to return variables because that is the only way we can use said variables without calling the method.
  
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
    
    perryDongmo.greet(true);
    gillesDongmo.greet("false");
    test.greet();
    mrTodaro.greet("Yes!");
    perryDongmo.consent();
  } 
}
// next challenge is to make a separate greet where depending if the persons vaccinated, they greet differently "if not vaccinated, use greet 2, else use greet 1"

/*
  Questions : 
    1. consent not returning any values
*/
