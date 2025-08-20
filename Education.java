public class Education{
   
   public class Person{
      private String name;
      private int age;

      public Person(String name, int age){
         this.name = name;
         this.age = age;
      }
      public void setName(String name){
         this.name = name;
      }
      public void setAge(int age){
         this.age = age;
      }
      public String getName(){
         return name;
      }
      public int getAge(){
         return age;
      }
      public void introduce(){
      System.out.println("Hello " + name + "with age " + age);
      }
   }

   class Student extends Person{
      private int studentId;
      private boolean isSucceded;

      public Student(String name, int age, int studentId){
         super(name, age);
         this.studentId = studentId;
         this.isSucceded = false;
      }
      public void setStudentId(int studentId){
         this.studentId = studentId;
      }
      public int getStudentId(){
         return studentId;
      }
      public void setIsSucceded(boolean isSucceded){
         this.isSucceded = isSucceded;
      }
      public boolean getIsSucceded(){
         if (isSucceded){
            return true;
         }else{
            return false;
         }
      }
      
      public void study(){
         setIsSucceded(true);
         System.out.println(getName() + " is studying" + " with id " + studentId + " with age " + getAge() + " is successed " + isSucceded);
      }
   }

   public void main(String[] args){
      // Person person = new Person("jamal ", 24);
      Student student = new Student("jamal", 24, 123);
      student.study();
   }
}