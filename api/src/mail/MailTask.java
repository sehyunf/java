package mail;

public class MailTask {
	public static void main(String[] args) {
		MailTest mt = new MailTest();
		String[] teamAddress = {
				"alsdk6761@gmail.com",
				"dcode0971@gmail.com",
				"djduckgoo@gmail.com",
				"ssam010925@gmail.com",
				"croissen214@gmail.com",
				"codefuling@gmail.com"
		};
		String massage = "두번째 안녕하세용";
		for(String address : teamAddress) {
			mt.sendMail(address, massage);
		}
		
	}
}
