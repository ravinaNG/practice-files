public class Ruvi
{
	public static void main(String []args)
	{
	final SplashScreen splash = 	SplashScreen.getSplashScreen();
	if (splash == null){
						System.out.println("SplashScreen.getSplashScreen() 		returned null");
	return;
}
	Graphics2D g = splash.createGraphics();
	if (g == null) {
	System.out.println("g is null");
	return;
		}
	}

}
