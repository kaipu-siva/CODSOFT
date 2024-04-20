
import java.util.*;
public class TASK1 {
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total subjects: ");
        int n=sc.nextInt();
        int[] marks=new int[n]; 
        System.out.println("Enter marks: ");
        for(int i=0;i<n;i++){
            marks[i]=sc.nextInt();
        }
        int total=0;
        for(int i:marks){
            total=total+i;
        }
        System.out.println("Total marks: "+total);
        
        int percentage=total/n;
        System.out.println("Average percentage: "+percentage+"%");
        
        if(percentage>=90 && percentage<=100)
            System.out.println("Student Grade is A+ and passed");
        else if(percentage>=80 && percentage<90)
            System.out.println("Student Grade is A and passed");
        else if(percentage>=70 && percentage<80)
            System.out.println("Student Grade is B and passed");
        else if(percentage>=60 && percentage<70)
            System.out.println("Student Grade is C and passed");
        else if(percentage>=50 && percentage<60)
            System.out.println("Student Grade is D and passed");
        else if(percentage>=40 && percentage<50)
            System.out.println("Student Grade is E and passed");
        else
            System.out.println("Student grade is F and failed");
    }
}
