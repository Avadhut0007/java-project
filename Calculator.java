import java.util.Scanner;

public class Calculator 
{

  public static void main(String []args){
  int option,a=0,b=0,c=0,i=0,r=0;
  boolean decision=false;
  Scanner scanner=new Scanner(System.in);
 
    do{
       System.out.println("1.Addition");
       System.out.println("2.Substraction");
       System.out.println("3.Multiplication");
       System.out.println("4.Division");
       System.out.println("5.Percentage");
       System.out.println("6.Square");
       System.out.println("7.Factorial");
       System.out.println("8.Remender");
       System.out.println("9.Area of Rectangle");
       System.out.println("10.Area of Square");
       System.out.println("11.Area of Circle");
       System.out.println("12.Find pi Value");
       System.out.println("Enter the operation which you want to perform:");
       option=scanner.nextInt();

         
        switch(option){

                 case 1:
                    System.out.println("Enter Two numbers for addition:");
                    a=scanner.nextInt();
                    b=scanner.nextInt();
                    c=a+b;
                    System.out.println("The Addition of two number is:"+c);
                    break;

                    case 2:
                    System.out.println("Enter Two numbers for Substraction:");
                    a=scanner.nextInt();
                    b=scanner.nextInt();
                    c=a-b;
                    System.out.println("The Substraction of two number is:"+c);
                    break;

		    case 3:
  		    System.out.println("Enter Two numbers for Multiplication:");
		    a=scanner.nextInt();
		    b=scanner.nextInt();
		    c=a*b;
		    System.out.println("The Multiplication of two number is:"+c);
                    break;

		    case 4:
	            System.out.println("Enter Two numbers for Division:");
		    a=scanner.nextInt();
		    b=scanner.nextInt();
		    c=a/b;
		    System.out.println("The Addition of two number is:"+c);
		    break;

		    case 5:
		    System.out.println("Enter the numbers for percentage:");
		    a=scanner.nextInt();
		    b=scanner.nextInt();
		    c=((a/b)*100);
		    System.out.println("The percentage is:"+c);
		    break;

 		    case 6:
		    System.out.println("Enter the number :");
		    a=scanner.nextInt();
		    c=a*a;
		    System.out.println("The Square of the number is:"+c);
		    break;

		    case 7:
		   System.out.println("Enter Number for Factorial:");
		   a=scanner.nextInt();
		c=1;
		     for(i=1;i<=a;i++){//5*4*3*2*1
		   c=c*i;
		    }
		   System.out.println("Factorial is "+c);
		   break;

		   case 8:
		   System.out.println("Enter Two numbers :");
		   a=scanner.nextInt();
		   b=scanner.nextInt();
		   c=a%b;
		   System.out.println("The Remender:"+c);
		   break;

		   case 9:
		   System.out.println("Enter Width and height of recatngle:");
		   a=scanner.nextInt();
		   b=scanner.nextInt();
		   c=a*b;
		   System.out.println("The Area of Rectangle is:"+c);
		   break;

		   case 10:
		   System.out.println("Enter the value");
		   a=scanner.nextInt();
		   c=a*a;
		   System.out.println("The Area of Square is:"+c);
		   break;

		   case 11:
		   System.out.println("Enter Radius of Circle");
		   a=scanner.nextInt();
		   r=a*a;
	           double c1=3.14*r;
		   System.out.println("The Area of Circle is:"+c1);
                   break;
		

                   case 12:
		   System.out.println("The pi value is 3.14");
		   break;

		   default:
                   System.out.println("Enter Valid Number 1 to 12");
                   break;
                 }

                 System.out.println("Do you want to continue press true:");
                 decision=scanner.nextBoolean();
                 
              }while(decision==true);
          }
     }









