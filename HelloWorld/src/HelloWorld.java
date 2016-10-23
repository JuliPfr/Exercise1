import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 */

/**
 * @author Mohsen
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello ASE2016 - how are you now? :)");
		System.out.print("Please enter your name:");
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		HelloUser user;
		try{
			user = new HelloUser(br.readLine());
		}
		catch(IOException io){
			System.out.println("Error! Enter the user name!");
			return;
		}
		user.greetUser();
				}

}
