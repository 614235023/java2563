public class GraduateStudent extends Student
{
    private String studyLevel;
    private String thesisAdviser;
    
   public void oralExamination()
   {
       System.out.println("GraduateStudent oralExamination");
   }
   public void thesisExamination()
   {
       System.out.println("GraduateStudent thesisExamination");
   }
      public static void main(String[] args) 
      {
      System.out.println("Hello World ");
      GraduateStudent danupat = new GraduateStudent();
      System.out.println("Object = "+danupat);
      danupat.oralExamination();
      danupat.thesisExamination();
      danupat.enrollment();
      danupat.dropCourse();
      danupat.addCouse();
      danupat.payment();
      }
}
