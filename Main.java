import java.util.Scanner;
class Rect
{
double l,b,area; 
void carea()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Length");
l=sc.nextDouble();
System.out.println("Enter a Breadth");
b=sc.nextDouble();
area=l*b;
System.out.println("the area is "+ area);
}
}

class Circle
{
double r,circum,pi;
void ccircum()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Radius");
r=sc.nextDouble();;
pi=3.14;
circum=2*pi*r;
System.out.println("the circumference of circle is "+ circum);
}
}

class Main
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
Rect re=new Rect();
Circle ci=new Circle();
System.out.println("Welcome To Maths World");
System.out.println(" ");
System.out.println("1. Rectangle ");
System.out.println("2. Circle ");
int choice=sc.nextInt();
switch(choice)
{
case 1:
re.carea();
break;
case 2:
ci.ccircum();
break;
}
}
}