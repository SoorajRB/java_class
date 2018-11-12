import java.io.*;

public class HelloWorldCommand {

	public static void main(String[] args) {
		
		String s = null;
		
		try {
			
			Process p = Runtime.getRuntime().exec("curl --request POST  --data @/home/vagrant/jobfiles/curl.json http://38.130.230.62:4646/v1/jobs");
			BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
			BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));
			
			while((s = stdInput.readLine())!=null) {
				System.out.println("Standard output" + s);
			}
			
			while((s = stdError.readLine())!=null) {
				System.out.println("Standard error" + s);
			}
		
		
		} catch (IOException e) {
			System.out.println("Error from try block" + e);
			
		}
		
		
	}
	
	
}
