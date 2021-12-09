interface One {
	void methodOne();
}


interface Two {
	void methodTwo();
}


interface Three extends One, Two {
	void methodThree();
}


class Four {
	int propertyFour=4;
	void methodFour(){
		System.out.println(propertyFour);
	}
}


class Five extends Four {
	int propertyFive=propertyFour+1;
	public void methodFive(){
		System.out.println(propertyFive);
	}
}


class Six extends Five implements Three {
	int propertySix=propertyFive+1;
	public void methodOne()
	{
		System.out.println("1");
	}
	public void methodTwo()
	{
		System.out.println("2");
	}
	public void methodThree()
	{
		System.out.println("3");
	}
	public void methodSix(){
		System.out.println(propertySix);
	}
}

public class Main{

	public static void main(String[] args){
		Six instanceSix = new Six();
		instanceSix.methodFive();
		instanceSix.methodSix();
	}
}	

