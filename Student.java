public class Student {
  //instance field
  String studentName;
  int studentAge;
  boolean isVaccinated;
  char gradePointAverage;

  // constructor method
  public Student(String name, int age, boolean vaccinated, char gradeAverage) {
    studentName = name;
    studentAge = age;
    isVaccinated = vaccinated;
    gradePointAverage = gradeAverage;
  }

  // The main method executes the tasks of the class
  public static void main(String[] args) {
    Student perryDongmo = new Student("Perry Dongmo", 16, true, 'B');

    System.out.println("Hello " + perryDongmo.studentName);

    char letter = 'a';
    System.out.println("My first Java program from scratch!");
    System.out.println(letter);
  }
}
