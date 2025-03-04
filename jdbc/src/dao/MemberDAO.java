package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import vo.MemberVO;

public class MemberDAO {
	Connection connection;
	PreparedStatement preparedStatement;
	ResultSet resultSet;
	
//	로그인 시 공용 저장소(세션)
	public static Long session;
	
//	회원가입
	public void join(MemberVO memberVO) {
		connection = DBConnecter.getConnect();
		String query = "INSERT INTO TBL_MEMBER" 
				+ "(ID, MEMBER_ID, MEMBER_PASSWORD, MEMBER_NAME, MEMBER_ADDRESS)"
				+ "VALUES(SEQ_MEMBER.NEXTVAL, ?, ?, ?, ?)";
		
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1,  memberVO.getMemberId());
			preparedStatement.setString(2,  memberVO.getMemberPassword());
			preparedStatement.setString(3,  memberVO.getMemberName());
			preparedStatement.setString(4,  memberVO.getMemberAddress());
			
//			preparedStatement.executeUpdate();
			preparedStatement.executeQuery();
			
			
		} catch (SQLException e) {
			System.out.println("join(MemberVO) query문 오류");
			e.printStackTrace();
		} finally {
//			드라이브를 열었던 순서의 반대로 닫음
			try {
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				System.out.println("SQL 쿼리 실행 이후 오류 발생");
				e.printStackTrace();
				throw new RuntimeException();
			}
		}
		
	}
	
//	아이디 중복검사
	
	public boolean checkId(String memberId) {
		connection = DBConnecter.getConnect();
		String query = "SELECT ID FROM TBL_MEMBER WHERE MEMBER_ID = ?";
		boolean check = false;
		
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, memberId);
			
			resultSet = preparedStatement.executeQuery();
			
//			데이터 접근은 행부터 실행한다
			resultSet.next();
			
//			있는지 없는지 검사
			resultSet.getLong(1);
			
		} catch (SQLException e) {
			check = true;
		} finally {
			try {
				if(resultSet != null) {
					resultSet.close();				
				}
				if(preparedStatement != null) {
					preparedStatement.close();				
				}
				if(connection != null) {
					connection.close();				
				}
			} catch (SQLException e) {
				System.out.println("checkId 퀴리 실행 후 오류");
				e.printStackTrace();
				throw new RuntimeException();
			}
		}
		return check;
		
	}
	
//	로그인
	
	public boolean login(String memberId, String memberPw) {
		connection = DBConnecter.getConnect();
		String query = "SELECT ID FROM TBL_MEMBER WHERE MEMBER_ID = ? AND MEMBER_PASSWORD = ?";
		boolean check = false;
		
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, memberId);
			preparedStatement.setString(2, memberPw);
			
			resultSet = preparedStatement.executeQuery();
			
//			데이터 접근은 행부터 실행한다
			resultSet.next();
			
//			있는지 없는지 검사
			session = resultSet.getLong(1);
			
		} catch (SQLException e) {
			check = true;
		} finally {
			try {
				if(resultSet != null) {
					resultSet.close();				
				}
				if(preparedStatement != null) {
					preparedStatement.close();				
				}
				if(connection != null) {
					connection.close();				
				}
			} catch (SQLException e) {
				System.out.println("login 퀴리 실행 후 오류");
				e.printStackTrace();
				throw new RuntimeException();
			}
		}
		return check;
		
	}
	
//	로그아웃
	
	public void logout() {
		session = null;
	}
	
//	정보 수정
	
	public void update(MemberVO memberVO) {
		connection = DBConnecter.getConnect();
		String query = "UPDATE TBL_MEMBER SET MEMBER_ID = ?, MEMBER_PASSWORD = ?, MEMBER_NAME = ?, MEMBER_ADDRESS = ?  WHERE ID = ?";
		
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1,  memberVO.getMemberId());
			preparedStatement.setString(2,  memberVO.getMemberPassword());
			preparedStatement.setString(3,  memberVO.getMemberName());
			preparedStatement.setString(4,  memberVO.getMemberAddress());
			preparedStatement.setLong(5, session);
			
			
//			preparedStatement.executeUpdate();
			preparedStatement.executeQuery();
			
			
		} catch (SQLException e) {
			System.out.println("join(MemberVO) query문 오류");
			e.printStackTrace();
		} finally {
//			드라이브를 열었던 순서의 반대로 닫음
			try {
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				System.out.println("SQL 쿼리 실행 이후 오류 발생");
				e.printStackTrace();
				throw new RuntimeException();
			}
		}
		
	}
	
//	비밀번호 변경
//	- 비밀번호 찾기
//	public void findPassword(MemberVO memberVO) {
//		
//	}
	
	public void changePassword(String changePassword) {
		connection = DBConnecter.getConnect();
		String query = "UPDATE TBL_MEMBER SET MEMBER_PASSWORD = ? WHERE ID = ?";
		
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1,  changePassword);
			preparedStatement.setLong(2, session);
			
			
//				preparedStatement.executeUpdate();
			resultSet = preparedStatement.executeQuery();
			
			resultSet.next();
			
			session = resultSet.getLong(1);
			
			
		} catch (SQLException e) {
			System.out.println("join(MemberVO) query문 오류");
			e.printStackTrace();
		} finally {
//				드라이브를 열었던 순서의 반대로 닫음
			try {
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				System.out.println("SQL 쿼리 실행 이후 오류 발생");
				e.printStackTrace();
				throw new RuntimeException();
			}
		}
			
		
	}
	
	
//	회원 탈퇴
	public void goodBye(MemberVO memberVO) {
		connection = DBConnecter.getConnect();
		String query = "DELETE FROM TBL_MEMBER WHERE ID = ?";
		
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, session);
			
			
			preparedStatement.executeUpdate();
//			preparedStatement.executeQuery();
			
			
		} catch (SQLException e) {
			System.out.println("join(MemberVO) query문 오류");
			e.printStackTrace();
		} finally {
			try {
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				System.out.println("SQL 쿼리 실행 이후 오류 발생");
				e.printStackTrace();
				throw new RuntimeException();
			}
		}
	}
	
	
}
