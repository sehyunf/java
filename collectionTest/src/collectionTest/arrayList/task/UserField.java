package collectionTest.arrayList.task;

import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import javax.mail.internet.MimeMessage.RecipientType;



public class UserField {
	public static String userId;
	final String SALT = "company";
	public static String code;
	public ArrayList<User> users = DBConnecter.users;
	
	public UserField() {;}
	
//	아이디 검사
	public User checkId(String id) {
		for(User user : users) {
			if(user.getId().equals(id)) {
				return user;
			}
		}
		return null;
	}
	
//	회원가입
	public void join(User user) {
		User userInDB = checkId(user.getId());
		String encryptPassword = null;
		if(userInDB == null) {
			encryptPassword = encrypt(user.getPassword());
			user.setPassword(encryptPassword);
			users.add(user);			
		}
	}
	
//	로그인
	
//	로그인 로직
//	아이디로 유저 호출
//	users반복 돌림
//	아이디로 비번 조회
//	public void login(User user) {
//		if(!login) {
//			for(User users : users) {
//				if(users.getId().equals(user.getId())) {
//					if(users.getPassword().equals(user.getPassword())) {
//						login = true;			
//						System.out.println("로그인~");
//						return;
//					}else {
//						System.out.println("비밀번호가 틀립니다");
//						return;
//					}			
//				}
//			}
//			System.out.println("입력하신 아이디의 사용자가 없습니다.");
//		}else {
//			System.out.println("이미 로그인 되어있습니다. ");
//		}
//	}
	
	public boolean login(User user) {
		User userInDB = checkId(user.getId());
		if(userInDB != null) {
			if(userInDB.getPassword().equals(user.getPassword())) {
				userId = user.getId();
				return true;
			}
		}
		return false;
	}
	
//	로그아웃
	
	public void logout() {
		userId = null;
	}
	
//	암호화
	
	public String encrypt(String password) {
		String result = "";
		for(char c: (SALT + password).toCharArray()) {
			result += (char)('S'+ c * 1101);
		};
		return result;
	}
	
//	비밀번호 변경(마이페이지)
	
	public void changePassword(User user) {
		User userInDB = checkId(user.getId());
		if (userInDB != null) {
			userInDB.setPassword(encrypt(user.getPassword()));			
		}
	}
	
//	비밀번호 변경(30일)
	
	public boolean changePassword(String password, String newPassword) {
		User userInDB = checkId(userId);
		if (userInDB.getPassword().equals(password)) {
			userInDB.setPassword(encrypt(newPassword));	
			return true;
		}
		return false;
	}
	
//	인증번호 생성
	
	public void createCode() {
		String tempcode = "";
		for(int i = 0; i < 6; i++) {
			tempcode += (int)Math.floor(Math.random() * 10);
		}
		code = tempcode;
	}

	
	
//	인증번호 전송
	public void sendMail(String mailAddress) {

		// 메일 인코딩
        final String bodyEncoding = "UTF-8"; //콘텐츠 인코딩
        
        //원하는 메일 제목 작성
        String subject = "[테스트]";
        
        //보낸 이메일 작성
        String fromEmail = "ssam010925@gmail.com";
        String fromUsername = "세현 박";
        
        String toEmail = mailAddress; // 콤마(,)로 여러개 나열
        
        //도메인 사용할 필요 없다
        //앱비밀번호
        final String username = "ssam010925@gmail.com";         
        final String password = "wmhx wbgo nlvs lbip";
        
        // 메일에 출력할 텍스트
        String html = null;
        StringBuffer sb = new StringBuffer();
        sb.append("<marquee>인증번호</marquee>\n");
        sb.append("<h4>"+code+"</h4>\n");    
        html = sb.toString();
        
        // 메일 옵션 설정
        Properties props = new Properties();    
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        props.put("mail.smtp.ssl.protocols", "TLSv1.2");
        
        try {
          // 메일 서버  인증 계정 설정
          Authenticator auth = new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
              return new PasswordAuthentication(username, password);
            }
          };
          
          // 메일 세션 생성
          Session session = Session.getDefaultInstance(props, auth);
          
          // 메일 송/수신 옵션 설정
          Message message = new MimeMessage(session);
          message.setFrom(new InternetAddress(fromEmail, fromUsername));
          message.setRecipients(RecipientType.TO, InternetAddress.parse(toEmail, false));
          message.setSubject(subject);
          message.setSentDate(new Date());
          
//          // 메일 콘텐츠 설정
          Multipart mParts = new MimeMultipart();
          MimeBodyPart mTextPart = new MimeBodyPart();
          MimeBodyPart mFilePart = null;
 //    
//          // 메일 콘텐츠 - 내용
          mTextPart.setText(html, bodyEncoding, "html");
          mParts.addBodyPart(mTextPart);
//                
//          // 메일 콘텐츠 설정
          message.setContent(mParts);
     
          // 메일 발송
          Transport.send( message );
          
        } catch ( Exception e ) {
          e.printStackTrace();
        }
	}	
	
//	public void sendSms(String phoneNumber, String code) {
//		String api_key = "NCSBEJVUIF1XRDJB";
//		String api_secret = "BG6BCSCHL5WLEMU8MMZGKVDD4REEDQSR";
//		Message coolsms = new Message(api_key, api_secret);
//      
//		// 4 params(to, from, type, text) are mandatory. must be filled
//		HashMap<String, String> params = new HashMap<String, String>();
//		params.put("to", phoneNumber);
//		params.put("from", "");
//		params.put("type", "SMS");
//		params.put("text", "");
//		params.put("app_version", "text app 1.2"); // application name and version
//
//		try {
//			JSONObject obj = (JSONObject) coolsms.send(params);
//			System.out.println(obj.toString());
//		} 	catch (CoolsmsException e) { 
//			System.out.println(e.getMessage());
//			System.out.println(e.getCode());
//		}
//	}


//	인증번호 확인
	public boolean checkCode(String inputCode) {
		if(code.equals(inputCode)) {
			return true;
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		UserField user = new UserField();
		User hong = new User("hong123", "홍길동", "hong123", "01012345678");
		user.join(hong);
		System.out.println(user.encrypt(hong.getPassword()));
		user.createCode();
		System.out.println(code);
		
		user.sendMail("ssam010925@gmail.com");
		
	}
	
	
	
}
