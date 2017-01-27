import java.util.Scanner;

public class calculator
	{
		public static void main(String[] args)
		{
//			userInput();
			
		}
		
		static double num1 = 0;
		static double subtraction = 0;
		static double multiplication = 0;
		static double division = 0;
		
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


					}
				else if(input.equals("2"))
					{
						
					}
				else if(input.equals("3"))
					{
						
					}
				else if(input.equals("4"))
					{
						
					}
				else if(input.equals("5"))
					{
						
					}
			}
				
		
	    public static double add(double x, double y)
		{
			num1 = userInput1.nextDouble();
			System.out.println(add(x,y));
			return x + y;	
		}
		public static double subtract(double x, double y)
		{
			Scanner userInput2 = new Scanner(System.in);
			System.out.println("What is the first number that you would like to add?");
			subtraction = userInput2.nextDouble();
			System.out.println(subtract(x,y));
			return x - y;
		}
		public static double multiply(double x, double y)
		{
			Scanner userInput3 = new Scanner (System.in);
			System.out.println("What is the first number that you would like to add?");
			multiplication = userInput3.nextDouble();
			System.out.println(multiply(x,y));
			return x * y;
		}
		public static double divide(double x, double y)
		{
			Scanner userInput4 = new Scanner(System.in);
			System.out.println("What is the first number that you would like to add?");
			division = userInput4.nextDouble();
			System.out.println(divide(x,y));
			return x / y;
		}
		public static double exponents(double x, double y)
		{
			Math.pow(x, y);
			return x + y;
		}
	}
// hi
