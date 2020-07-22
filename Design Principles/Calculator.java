import java.util.*;

class DoOperations {
double add(double a,double b)
{
	return a+b;
}
double subtract(double a,double b)
{
	return a-b;
}

double multiply(double a,double b)
{
	return a*b;
}

double divide(double a,double b)
{
	return a/b;
}
}
class Calculator
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");

        double first = sc.nextDouble();
        double second = sc.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        double result=0.0;
		int flag=0;
        DoOperations obj=new DoOperations();
        switch(operator)
        {
            case '+':
                result =obj.add(first,second);
                break;

            case '-':
                result =obj.subtract(first,second);
                break;

            case '*':
                result =obj.multiply(first,second);
                break;

            case '/':
			    if(second!=0)
				{
                result =obj.divide(first,second);
                break;
				}
				else
				{
					System.out.println("Error! Division by zero");
					flag=1;
					break;
				}

            default:
                System.out.printf("Error! operator is not correct");
                return;
        }
        if(flag==0)
        System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);
    }
}