class Calculator
{
int first;
int second;
int sumResult;
int mulResult;
int subResult;
double divResult;
int remResult;
Calculator(int a,int b) {
first =a;
second =b;
}
public void performAdd()
{
 sumResult=first + second;
}
public void displaySum()
{
System.out.println(sumResult);
}

//class CalculateManager  {

public static void main(String[] args)  {

Calculator c1=new Calculator(10,5);
c1.performAdd();
c1.displaySum();
System.out.println(c1.sumResult());