package sullivan.gareth;

/**
 * Hello world!
 *
 */
public class App 
{

	public String getHelloWorldString()
	{
		return "Hello World, Gareth here!";
	}

	public String getHelloWorldString2()
	{
		return "Hello World, master branch here!";
	}

    public static void main( String[] args )
    {
    	App myApp = new App();
    	System.out.println(myApp.getHelloWorldString());
    }
}
