import java.util.Scanner;

//import javax.security.auth.Subject;
public class Student_grade_calculator {
    int sum;
    public static void main(String[] args)
    {
        float sum=0,percentage;
        int subject,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter how many subjects you have");
        subject=sc.nextInt();
        float marks[]=new float[subject];
        for(i=0;i<subject;i++)
        {
            System.out.println("enter marks");
            marks[i]=sc.nextFloat();
        }
        for(i=0;i<subject;i++)
        {
            System.out.println(marks[i]);
            sum=marks[i]+sum;  
        }
        percentage=(sum/subject);
        System.out.println(percentage);

        if(percentage>=90 && percentage<=100)
        {
            System.out.println("GRADE O");
        }
        else if(percentage>=80 && percentage<=90)
        {
            System.out.println("GRADE E");
        }
        else if(percentage>=70 && percentage<=80)
        {
            System.out.println("GRADE A");
        }
        else if(percentage>=60 && percentage<=70)
        {
            System.out.println("GRADE B");
        }
        else if(percentage>50 && percentage<=60)
        {
            System.out.println("GRADE C");
        }
        else if(percentage>40 && percentage<=30)
        {
            System.out.println("PASS");
        }
        else
        {
            System.out.println("fail");
        }
        
    }
}
