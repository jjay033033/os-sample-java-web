package top.lmoon.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import top.lmoon.util.CloseUtil;

public class TestServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1128635005944926844L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		StringBuffer result = new StringBuffer();
		PrintWriter out = null;
		try {
			// 获取输出对象
			out = resp.getWriter();
			result.append("hello test!");
			out.print(result);
			return;
		} catch (Exception e) {
			out.print(result);
		} finally {
			CloseUtil.closeSilently(out);
		}

	}

}
