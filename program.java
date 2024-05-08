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

import java.util.Scanner;
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

 import java.util.Scanner;
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

import java.util.Scanner;
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

import java.util.Scanner;
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

import java.util.Scanner;
class program{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a charcter: ");
        char ch=sc.next().charAt(0);
        if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ||ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' || ch=='U')
        {
            System.out.print(ch +" it is vowel");
        }
        else{
            System.out.print(ch +" it is consonent");
         }
        }
 }

//java program to check whether the character is vowel by using switch case

import java.util.Scanner;
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

// java program to find sum of integer between 1 to 10 using do while loop

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

//java program to find maximum and minimum

import java.util.Scanner;
class program{
    public static void main(String args[]){
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of an array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];

        for(int i=1;i<=size;i++){
        arr[i]=sc.nextInt();
        sum=sum+arr[i];
        }
        System.out.print(sum);
    }
}

//java program to print number

 import java.util.*;
 class program{
    public static void main(String args[]){
        int number[]={1,2,3,4,5};
        for(int i=0;i<5;i++){
            System.out.println(number[i]);
        }
    }
 }

//java program to display the input number

import java.util.*;
class program{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of an array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];

        //loop for input
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
    }
}

//java program to find sum

import java.util.Scanner;
class program{
    public static void main(String args[]){
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of an array: ");
        int size=sc.nextInt();
        int ar[]=new int[size];

        for(int i=0;i<size;i++){
            ar[i]=sc.nextInt();
            sum=sum+ar[i];
        }
        System.out.print(sum);
    }
}

//java program to search index of a number

import java.util.Scanner;
class program{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of an array: ");
        int size=sc.nextInt();
        int ar[]=new int[size];

        for(int i=0;i<size;i++){
            ar[i]=sc.nextInt();
        }
        System.out.print("enter the valur you want to search:");
        int x=sc.nextInt();

        for(int i=0;i<size;i++){
            if(ar[i]==x){
                System.out.print("x found at index:"+ i);
            }
        }
    }
}


//java program to find maximum and minimum number

import java.util.*;
class program{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of an array:");
        int size=sc.nextInt();
        int ar[]=new int[size];

        for(int i=0;i<size;i++){
            ar[i]=sc.nextInt();
        }
        int max=ar[0];
        int min=ar[0];

        for(int i=0;i<size;i++){
            if(ar[i]>max){
                max=ar[i];
            }
            if(ar[i]<min){
                min=ar[i];
            }
        }
        System.out.print("maximum number is " + max);
        System.out.print("minimum number is " + min);
        
    }
}

//java program to print odd number between 1 to 20

import java.util.Scanner;
class program{
    public static void main(String args[]){
        for(int i=0;i<20;i++){
            if(i%2 !=0){
                System.out.println(i);
            }
        }
    }
}

//java program to find factorial

import java.util.Scanner;
class program{
    public static void main(String args[]){
        int fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number you want to find factorial: ");
        int a=sc.nextInt();
        for(int i=a;i>0;i--){
            fact=fact*i;
        }
        System.out.print("factorial of a number is: "+ fact);
    }
}

//java program to find first n fibonacci series

import java.util.Scanner;
class program{
    public static void main(String args[]){
        int a=0;
        int b=1;
        int c;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of series: ");
        int size=sc.nextInt();
        System.out.print( a);
         System.out.print( b);
        for(int i=1;i<=size-2;i++){
            c=a+b;
            System.out.print( c);
            a=b;
            b=c;
        }
     }
}

//java program to reverse a number

import java.util.Scanner;
class program{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number: ");
        int num=sc.nextInt();
        while(num>0){
            int rev=num%10;
            System.out.print(rev);
            num=num/10;
        }
    }
}

//java program to evaluate the series 1^2 + 2^2 + 3^2 + 4^2

import java.util.Scanner;
class program{
    public static void main(String args[]){
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number till you want to find sum: ");
        int num=sc.nextInt();
        for(int i=0;i<=num;i++){
            sum=sum+(i*i);
        }
        System.out.print(sum);
    }
}

//java program to print pattern

class program{
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}

//java program to print pattern

class program{
    public static void main(String args[]){
        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}

//java program to print pattern

class program{
    public static void main(String args[]){
        for(char i='A';i<='E';i++){
            for(char j='A';j<=i;j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}

//or

class program{
    public static void main(String args[]){
        for(char i=65;i<=69;i++){
            for(char j=65;j<=i;j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}

//java program to find even or odd from given number

import java.util.Scanner;
class program{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of element: ");
        int size=sc.nextInt();
        int ar[]=new int[size];

        for(int i=0;i<size;i++){
            ar[i]=sc.nextInt();
        }

        for(int i=0;i<size;i++){
            if(ar[i]%2==0){
                System.out.print(ar[i] + " is even");
            }
            else{
                System.out.print(ar[i] + " is odd");
            }
        }
    }
}

//java program to find palindrome

import java.util.Scanner;
class q{
    public static void main(String args[]){
        int s=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number: ");
        int n=sc.nextInt();
        int c=n;
        while(n>0){
            int r=n%10;
             s=(s*10)+r;
            n=n/10;
        }
        if(c==s){
            System.out.print("It is pallindrome number");
        }
        else{
            System.out.print("It is not pallindrome number");
        }
    }
}

