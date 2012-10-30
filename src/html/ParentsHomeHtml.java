package html;

import javax.servlet.http.HttpServletResponse;

public class ParentsHomeHtml {

	static ParentsHomeHtml instance= null;
	
	public static ParentsHomeHtml getInstance() {
		if(instance == null)
			instance = new ParentsHomeHtml();
		return instance;
	}
	
	public void write(HttpServletResponse res){
		System.out.println("not implemented yet");
	}
}
