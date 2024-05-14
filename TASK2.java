import java.util.*;

public class TASK2 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total no of subjects: ");
        int n=sc.nextInt();
        int[] marks=new int[n]; 
        System.out.println("Enter marks: ");
        int k=0;
        while(k<n){
            int mark=sc.nextInt();
            if(mark>=0 && mark<=100){
                marks[k]=mark;
                k++;
            }
            else
                System.out.println("enter correct marks!!!");
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
