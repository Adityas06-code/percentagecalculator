import java.util.Scanner;
class MyClass {
    public static void main(String []args){
        Scanner as = new Scanner(System.in);
       System.out.println("Marks obtained in maths ");
       float maths = as.nextFloat();
       System.out.println("Marks obtained in english ");
       float english = as.nextFloat();
       System.out.println("Marks obtained in physics");
        float physics = as.nextFloat();
       System.out.println("marks obtained in chemistry");
       float chemistry = as.nextFloat();
      float percentage = ((maths + english + physics + chemistry)/400)*100;
       System.out.println("Percentage obtained by Aditya is" + percentage);
       
    }
}
