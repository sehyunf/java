package view;

import dao.MemberDAO;
import vo.MemberVO;

public class View {
	public static void main(String[] args) {
		MemberVO memberVO = new MemberVO();
		MemberDAO memberDAO = new MemberDAO();
		
//		회원가입
//		if(memberDAO.checkId("psh12345")) {
//			System.out.println("사용 가능한 아이디");
//			memberVO.setMemberId("psh12345");
//			memberVO.setMemberPassword("1234");
//			memberVO.setMemberName("박세현");
//			memberVO.setMemberAddress("서울시 송파구");
//			
//			memberDAO.join(memberVO);
//		}else {
//			System.out.println("중복된 아이디");
//		}
		

//		System.out.println(memberDAO.login("psh1234", "1234"));
//		if(memberDAO.login("psh1234", "1234")) {
//			System.out.println("로그인 실패 다시 입력해 주세요");
//		}else {
//			System.out.println("로그인 성공");
//		}
//		
//		if(memberDAO.login("psh12345", "1234")) {
//			System.out.println("로그인 실패 다시 입력해 주세요");
//		}else {
//			System.out.println("로그인 성공");
//		}
//		
//		if(memberDAO.login("hong1234", "1234")) {
//			System.out.println("로그인 실패 다시 입력해 주세요");
//		}else {
//			System.out.println("로그인 성공");
//		}
		
//		로그아웃
//		memberDAO.logout();
//		System.out.println("로그아웃 되었습니다.");
		
//		정보수정
//		MemberVO updatedMember = new MemberVO();
//		updatedMember.setMemberId("hgd12345");
//		updatedMember.setMemberPassword("hgd12345");
//		updatedMember.setMemberName("홍길동");
//		updatedMember.setMemberAddress("서울시 강남구");
//		
//		memberDAO.update(updatedMember);
//		System.out.println("수정완료");
//		
//		if(memberDAO.login("psh1234", "1234")) {
//			System.out.println("로그인 실패 다시 입력해 주세요");
//		}else {
//			System.out.println("로그인 성공");
//		}
//		
//		memberDAO.goodBye(memberVO);
//		System.out.println("회원 탈퇴 완료 바이바이~");
		
//		if(memberDAO.checkId("jang1234")) {
//			System.out.println("사용 가능한 아이디");
//			memberVO.setMemberId("jang1234");
//			memberVO.setMemberPassword("1234");
//			memberVO.setMemberName("장보고");
//			memberVO.setMemberAddress("서울시 송파구");
//			
//			memberDAO.join(memberVO);
//		}else {
//			System.out.println("중복된 아이디");
//		}
		
		if(memberDAO.login("jang1234", "123123")) {
			System.out.println("로그인 실패 다시 입력해 주세요");
		}else {
			System.out.println("로그인 성공");
		}
		
		memberDAO.changePassword("123123");
		System.out.println("비밀번호 변경 완료");
		
		memberDAO.goodBye(memberVO);
		System.out.println("회원 탈퇴 완료. 안녕히가세요");
		
		
	}
}
