package servlets;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServ
 */
public class LoginServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

	    // output an HTML page
	    res.setContentType("text/html");
	 
	    // print some html
	    PrintWriter out = res.getWriter();
	 
	    String path = req.getSession().getServletContext().getRealPath("/");
	    		
	    // print the file
	    InputStream in = null;
	    try {
	        in = new BufferedInputStream
	            (new FileInputStream(path +"loginKLeiter.html") );
	        int ch;
	        while ((ch = in.read()) !=-1) {
	            out.print((char)ch);
	        }
	    }
	    finally {
	        if (in != null) in.close();  // very important
	    }	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
