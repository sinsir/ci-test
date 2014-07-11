package sullivan.gareth;

/**
 * Hello world!
 *
 */
public class App 
{

	protected static final String HELLO_WORLD_STRING = "Hello World";
	
	public String getHelloWorldString()
	{
		return HELLO_WORLD_STRING  + ", Gareth here!";
	}

	public String getHelloWorldString2()
	{
		return HELLO_WORLD_STRING  + ", master branch here!";
	}

	public String getHelloWorldString3()
	{
		return HELLO_WORLD_STRING  + ", master branch here!";
	}
    public static void main( String[] args )
    {
    	App myApp = new App();
    	System.out.println(myApp.getHelloWorldString());
    }
}
