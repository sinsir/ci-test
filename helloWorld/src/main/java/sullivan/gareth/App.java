package sullivan.gareth;

/**
 * Hello world!
 *
 */
public class App 
{

	public String getHelloWorldString()
	{
		return "Hello World!";
	}

    public static void main( String[] args )
    {
    	App myApp = new App();
    	System.out.println(myApp.getHelloWorldString());
    }
}
