import java.util.Scanner;

public class calculator
	{
		public static void main(String[] args)
		{
		userInput();
		add(x,y);
		subtract(x,y);
		multiply(x,y);
		divide(x,y);
		exponents(x,y);
		}
		
		static double x = 0;
		static double y = 0;
		
		public static void userInput()
			{
				Scanner userInput =new Scanner(System.in);
				System.out.println("Which type of math would you like to do today?");
				System.out.println("1) Addition");
				System.out.println("2) Subtraction");
				System.out.println("3) Multiplication");
				System.out.println("4) Division");
				System.out.println("5) exponents");
				String input=userInput.nextLine();
				
				if(input.equals("1"))
					{
					Scanner userInput1 = new Scanner(System.in);	
					System.out.println("What is the first number that you would like to add?");
					x = userInput1.nextDouble();
					Scanner userInput2 = new Scanner(System.in);	
					System.out.println("What is the second number that you would like to add?");
					y = userInput2.nextDouble();
					add(x,y);
					}
				else if(input.equals("2"))
					{
					Scanner userInput1 = new Scanner(System.in);	
					System.out.println("What is the number that you would like to subtract from?");
					x = userInput1.nextDouble();
					Scanner userInput2 = new Scanner(System.in);	
					System.out.println("What is the number that you would like to subtract?");
					y = userInput2.nextDouble();
					subtract(x,y);
					}
				else if(input.equals("3"))
					{
					Scanner userInput1 = new Scanner(System.in);	
					System.out.println("What is the number that you would like to multiply?");
					x = userInput1.nextDouble();	
					Scanner userInput2 = new Scanner(System.in);	
					System.out.println("What is the number that you would like to multiply by?");
					y = userInput2.nextDouble();	
					multiply(x,y);	
					}
				else if(input.equals("4"))
					{
					Scanner userInput1 = new Scanner(System.in);	
					System.out.println("What is the number that you would like to divide?");
					x = userInput1.nextDouble();
					Scanner userInput2 = new Scanner(System.in);	
					System.out.println("What is the number that you would like to divide by?");
					y = userInput2.nextDouble();
					divide(x,y);
					}
				else if(input.equals("5"))
					{
					Scanner userInput1 = new Scanner(System.in);	
					System.out.println("Which number would you like to start with?");
					x = userInput1.nextDouble();
					Scanner userInput2 = new Scanner(System.in);	
					System.out.println("To the (_?_) power");
					y = userInput2.nextDouble();
					Math.pow(x, y);
					}
			}
				
		
	    public static double add(double x, double y)
		{
			System.out.println(x + y);
			return x + y;	
		}
		public static double subtract(double x, double y)
		{
			System.out.println(x - y);
			return x - y;
		}
		public static double multiply(double x, double y)
		{
			System.out.println(x * y);
			return x * y;
		}
		public static double divide(double x, double y)
		{
			System.out.println(x / y);
			return x / y;
		}
		public static double exponents(double x, double y)
		{
			System.out.println(Math.pow(x, y));
			return x + y;
		}
	}
