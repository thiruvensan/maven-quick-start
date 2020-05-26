package clinic.programming.training;

import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;

public class Application {
	public int countWords(String statement){
		String[] words = StringUtils.split(statement,' ');
		return (words == null)?0:words.length;
	}
	
	public void greet(){
		ArrayList<String> list = new ArrayList<String>();
		list.add("hello");
		
		for(String say:list){
			System.out.println(say);
		}
	}
	
    
    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
	Application app = new Application();
	app.greet();
	int count = app.countWords("this is thirumalai. testing");
	System.out.println("words count: "+count);
    }
}