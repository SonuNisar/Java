package singleton;

class AadharCard
{
	static AadharCard ac;
	private AadharCard()
	{
		System.out.println("AadharCard object created");
	}
	public static void createAadharCardObject()
	{
		if(ac ==null)
		{
			ac = new AadharCard();
		}
		else
		{
			System.out.println("cannot create object");
		}
	}
}
public class Person {

	public static void main(String[] args) {
		
		AadharCard.createAadharCardObject();

	}

}
