//java program to print hello world

class program{
    public static void main(String args[]){
        System.out.print("hello world");
    }
}

//java program to display name.roll,branch

class program{
    public static void main(String args[]){
        System.out.println("My name is Rajeev Singh");
        System.out.println("Roll no.:32");
        System.out.println("Branch:CSE");
    }
}

//java program to perform calculation

import java.util.*;
class program{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter 1st number");
        int a=sc.nextInt();
        System.out.print("enter 2nd number");
        int b=sc.nextInt();
        System.out.println("Sum  of the number is "+ (a+b));
        System.out.println("Subtraction  of the number is "+ (a-b));
        System.out.println("multiplication  of the number is "+ (a*b));
        System.out.println("division  of the number is "+ (a/b));
    }
}

//java program to find area of triangle

 import java.util.*;
class program{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of base:");
        float b=sc.nextFloat();
         System.out.print("enter the value of height:");
        float h=sc.nextFloat();
        float area=(b*h)/2;
        System.out.print("Area of the triangle is "+ area);
    }
}

//java program to find area of circle

import java.util.*;
class program{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of radius: ");
        double r=sc.nextDouble();
        double area=3.14*r*r;           //Math.PI
        System.out.print(area);
    }
}

//java program to calculate simple interest

import java.util.*;
class program{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the principle:");
        float p=sc.nextFloat();
        System.out.print("enter the rate of interest:");
        float r=sc.nextFloat();
        System.out.print("enter the time:");
        float t=sc.nextFloat();
        float SI=(p*r*t)/100;
        System.out.print("The simple interest is "+ SI);
    }
}

//java program to calculate fahrenheit from centigrade

import java.util.*;
class program{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of centigrade:");
        float c=sc.nextFloat();
        float f=1.8*c+32;
        System.out.print(f);
    }
}

//java program to find sqrt

import java.util.*;
class program{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number:");
        double a=sc.nextInt();
        double result=Math.sqrt(a);
        System.out.print(result);
    }
}

//java program to interchange two number

import java.util.*;
class program{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter 1st number: ");
        int a=sc.nextInt();
        System.out.print("enter 2nd number: ");
        int b=sc.nextInt();
        System.out.println("vaue of a is "+a);
        System.out.println("vaue of b is "+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After Exchanging the value");
        System.out.println("value of a is "+ a);
        System.out.print("value of b is "+ b);
    }
}

//java program to check whether the character is vowel or not

import java.util.*;
class program{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a charcter: ");
        char ch=sc.next().charAt(0);
        if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ||ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' || ch=='U')
        {
            System.out.print("it is vowel");
        }
        else{
            System.out.print("it is consonent");
         }
        }
 }

//java program to check whether the character is vowel or not using switch case

import java.util.*;
class program{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a character: ");
        char ch=sc.next().charAt(0);
        switch(ch){
            case'a':
            System.out.print("it is vowel");
            break;
              case'e':
            System.out.print("it is vowel");
            break;  
            case'i':
            System.out.print("it is vowel");
            break;
              case'o':
            System.out.print("it is vowel");
            break;  
            case'u':
            System.out.print("it is vowel");
            break;
              case'A':
            System.out.print("it is vowel");
            break;
              case'E':
            System.out.print("it is vowel");
            break;
              case'I':
            System.out.print("it is vowel");
            break;
              case'O':
            System.out.print("it is vowel");
            break;
              case'U':
            System.out.print("it is vowel");
            break;
            default:
                System.out.print("it is consonent");
            break;
        }
    }
}

//java program to find sum of integer between 1 to 10 using for loop

import java.util.*;
class program{
    public static void main(String args[]){
           int sum=0;
       for(int i=0;i<=10;i++){
        sum=sum+i;
       }
       System.out.print(sum);
    }
}

// //java program to find sum of integer between 1 to 10 using do while loop

class program{
    public static void main(String args[]){
        int i=0,sum=0;
        
        do{
            sum=sum+i;
            i++;
        }
        while(i<=10);
        System.out.print(sum);
    }
}


