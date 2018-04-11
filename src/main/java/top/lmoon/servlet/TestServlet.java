package top.lmoon.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import top.lmoon.util.CloseUtil;
import top.lmoon.util.ParamUtil;

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
		String method = null;
		try {
			// 设置不创建Session
			req.getSession(false);

			// 设置响应类型和编码
			resp.setContentType("text/html; charset=UTF-8");

			// 设置请求编码
			req.setCharacterEncoding("UTF-8");

			// 设置响应头
			resp.setHeader("Cache-Control", "no-cache");
			resp.setHeader("Pragma", "no-cache");
			resp.setHeader("Expires", "Thu, 01 Nov 2012 10:00:00 GMT");

			// 获取输出对象
			out = resp.getWriter();

			// 获取请求方法名称
			method = ParamUtil.getParameter(req, "method", "");
			String var = ParamUtil.getParameter(req, "var", "").trim();

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
