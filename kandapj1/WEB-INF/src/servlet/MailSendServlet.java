package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mailSend")
	public class MailSendServlet extends HttpServlet{
		private static final long serialVersionUID = 1L;

		public MailSendServlet() {
			super();
		}
		protected void doPost (HttpServletRequest request,
				HttpServletResponse response) throws ServletException, IOException{
			request.setCharacterEncoding("UTF-8"); // 한글 정보 안 깨지도록 한글 설정

	        // 메일전송에 사용하기 위해 전송되온 파라미터들
			String sender = request.getParameter("sender");
			String receiver = request.getParameter("receiver");
			String subject = request.getParameter("subject");
			String content = request.getParameter("content");

			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out = response.getWriter();
			try {
				Properties properties = System.getProperties();
				properties.put("mail.smtp.starttls.enable", "true"); // Starttls Command 사용할 수 있게, gmail은 true
				properties.put("mail.smtp.host", "smtp.gmail.com"); // smtp 서버를 지정하는 부분  smtp 주소
				properties.put("mail.smtp.auth", "true"); // gmail은 무조건 true 고정
				properties.put("mail.smtp.port", "587"); // gmail 포트
				Authenticator auth = new GoogleAuthentication(); // 인증정보 생성하는 부분
				Session s = Session.getDefaultInstance(properties, auth);

				Message message = new MimeMessage(s); // 생성한 세션 객체를 사용해 전송할 message객체 생성
				Address sender_address = new InternetAddress(sender); // 메일 송신할 송신 주소 생성
				Address receiver_address = new InternetAddress(receiver); // 메일 수신할 수신 주소 생성

				// 메일 전송에 필요한 값 설정하는 부분
				message.setHeader("content-type", "text/html;charset=UTF-8");
				message.setFrom(sender_address);
				message.addRecipient(Message.RecipientType.TO, receiver_address);
				message.setSubject(subject);
				message.setContent(content, "text/html;charset=UTF-8");
				message.setSentDate(new java.util.Date());

				Transport.send(message);
				out.println("<h3>送信に成功しました。</h3>");
				RequestDispatcher dispatcher = request.getRequestDispatcher("/replyok");
				dispatcher.forward(request, response);

			} catch (Exception e) {
				out.println("送信に失敗しました。\n" + e);
				e.printStackTrace();
				RequestDispatcher dispatcher = request.getRequestDispatcher("view/replyfail.jsp");
				dispatcher.forward(request, response);
			}
		}
	}

