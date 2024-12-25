class Area
{
	static void fun1()
	{
	   System.out.println("Function Area 1 called!!");
	}
	static void fun2()
	{
	   System.out.println("Function Area 2 called!!");
	}
}

class Function
{
	static void fun1()
	{
	   System.out.println("Function 1 called!!");
	}
	static void fun2()
	{
	   System.out.println("Function 2 called!!");
	}

public static void main(String[] args)
{
	fun1();
	System.out.println("Main Function");
	fun2();
	Area.fun1();
	Area.fun2();
}
}