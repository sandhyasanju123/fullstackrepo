public class ClassB
{
void add()
{
int x=10;
int y=20;
System.out.println("addition:"+(x+y));
}
void substract()
{
int x=30;
int y=20;
System.out.println("subtraction:"+(x-y));
}
void multiplication()
{
int x=10;
int y=10;
System.out.println("multiplication:"+(x*y));
}
void div()
{
int x=10;
int y=2;
System.out.println("division:"+(x/y));
}
public static void main(String[] args)
{
System.out.println("java program on mathematical operations");
System.out.println("start");
ClassB bobj=new ClassB();
bobj.add();
bobj.substract();
bobj.multiplication();
bobj.div();
System.out.println("end");
}
}
