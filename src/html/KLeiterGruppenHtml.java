package html;

import javax.servlet.http.HttpServletResponse;

public class KLeiterGruppenHtml {

	static KLeiterGruppenHtml instance= null;
	
	public static KLeiterGruppenHtml getInstance() {
		if(instance == null)
			instance = new KLeiterGruppenHtml();
		return instance;
	}
	
	public void write(HttpServletResponse res){
		System.out.println("not implemented yet");
	}
}
