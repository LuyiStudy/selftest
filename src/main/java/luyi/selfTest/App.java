package luyi.selfTest;

/**
 * Hello world!
 *
 */
public class App 
{
	public String sayHello(){
		return "Hello World";
	}
    public static void main( String[] args )
    {
       App objOfApp = new App();
       System.out.println(objOfApp.sayHello());
    }
}
