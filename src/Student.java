public class Student {
    protected String studentId;
    protected String StudentName;
    protected String faculty;
    protected String major;
    
    void enrollment()
    {
     System.out.println("student enrollment");
    }
    void payment()
    {
     System.out.println("student payment");
    }
    void addCouse()
    {
     System.out.println("student addCouse");
    }
    void dropCourse()
    {
     System.out.println("student dropCourse");
    }
  public static void main(String[] args)
  {  
      System.out.println("Hello World ");
      Student danupat = new Student();
      System.out.println("Object = "+danupat);
      danupat.enrollment();
      danupat.dropCourse();
      danupat.addCouse();
      danupat.payment();
         
  }
        
}//end class
