import java.util.Scanner;

class AreaCalculator
{
	public static void main(String[] args)
	{
		Scanner Scan = new Scanner (System.in);
		System.out.println("Enter The Shape Name : Circle, Square, Rectangle, Triangle");
		String Shape = Scan.nextLine().toLowerCase();
		
		switch(Shape)
		{
			case "circle":
			System.out.println("Enter A Number Of Radius");
			
			double radius = Scan.nextDouble();
			double circle = 3.14159*radius*radius;
			System.out.println("Area of Circle: "+circle);
			break;
			
			case "square":
			System.out.println("Enter A Number Of Side Lenght");
			
			int sideLenght = Scan.nextInt();
			int square = sideLenght*sideLenght;
			System.out.println("Area of Square: "+square);
			break;
			
			case "rectangle":
			System.out.println("Enter A Number Of Length");
			int Length = Scan.nextInt();
			
			System.out.println("Enter A Number Of Width");
			int Width = Scan.nextInt();
			
			
			int rectangle = Length*Width;
			System.out.println("Area Of Rectangle: "+rectangle);
			break;
			
			case "triangle":
			System.out.println("Enter A Number Of Base");
			int Base = Scan.nextInt();
			
			System.out.println("Enter A Number Of Height");
			int Height = Scan.nextInt();
			
			double triangle = 0.5*Base*Height;
			System.out.println("Area Of Triangle: "+triangle);
			
			default:
			System.out.println("Invaild Shape Name");
			break;
			
			}
			Scan.close();
	}
}