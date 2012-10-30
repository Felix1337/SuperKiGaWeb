package servlets;

import html.KLeiterGruppenHtml;
import html.ParentsHomeHtml;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TestServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {

		@SuppressWarnings("rawtypes")
		Enumeration enumeration = request.getParameterNames();

		if (!enumeration.hasMoreElements()) {
			parseSite(response,getServletContext().getRealPath("index.html"));
			return;
		}
		String par = (String) enumeration.nextElement();
		String seite = request.getParameter(par);
		
		if (!enumeration.hasMoreElements()) {
			parseSite(response,getServletContext().getRealPath(seite));
			return;
		}
//		while (enumeration.hasMoreElements()) {
//
//			System.out.println((String) enumeration.nextElement());
//		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		
		if (request.getParameter("name").equals("AnmeldenEltern")) {
			ParentsHomeHtml.getInstance().write(response);
		}
		
		if (request.getParameter("name").equals("AnmeldenLeiter")) {
			KLeiterGruppenHtml.getInstance().write(response);
		}
		
		
		
	}

	private void parseSite(HttpServletResponse res, String site)
			throws IOException {

		// output an HTML page
		res.setContentType("text/html");

		// print some html
		PrintWriter out = res.getWriter();

		// print the file
		InputStream in = null;
		try {
			in = new BufferedInputStream(new FileInputStream(site));
			int ch;
			while ((ch = in.read()) != -1) {
				out.print((char) ch);
			}
		} finally {
			if (in != null)
				in.close(); // very important
		}
	}

}
