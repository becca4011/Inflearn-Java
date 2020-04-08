package destructor;

public class ObjectClass 
{
	public ObjectClass() 
	{
		System.out.println("Default constructor");
	}
	
	/* ¼Ò¸êÀÚ */
	
	protected void finalize() throws Throwable
	{
		System.out.println("-- finalize method --");
		
		super.finalize();
	}
}
