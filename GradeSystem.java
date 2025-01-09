import java.util.*;
class GradeSystem
{
   public static void main(String[] args)
   {
      float cpp,web,math,os,total,per=0;
      
      Scanner obj = new Scanner(System.in);
      System.out.println("Enter the Marks of Mathematics");
      math = obj.nextFloat();

      System.out.println("Enter the Marks of Operating System");
      os = obj.nextFloat();
  
      System.out.println("Enter the Marks of C++");
      cpp = obj.nextFloat();

      System.out.println("Enter the Marks of Web Development-I");
      web = obj.nextFloat();
 
     System.out.println("\n\tSubject \t\t\t\tMarks ");
     System.out.println("\n BCA301 - Mathematics \t\t\t\t"+math);
     System.out.println("\n BCA302 - Operating System \t\t\t" + os);
     System.out.println("\n BCA303 - Programming in CPP \t\t\t" + cpp);
     System.out.println("\n BCA304 - Web Development-I \t\t\t" + web);
  
     total = (math + os + cpp + web);
     per =((total / 400)*100);

     System.out.println("\n Total Marks Obtained : "+total);
     System.out.println("\n Percentage Obtained : "+per);
      
     if(per >= 35 && per < 55)
     {
       System.out.println("\n Student Pass with D Grade");
     }
     else if(per >= 55 && per < 70)
     {
       System.out.println("\n Student Pass with C Grade");
     }
     else if(per >= 70 && per < 85)
     {
       System.out.println("\n Student Pass with B Grade");
     }
     else if(per >= 85 && per < 100)
     {
       System.out.println("\n Student Pass with A Grade");
     }
     else 
     {
        System.out.println("\n Student is Fail..");
     }


   } 
}