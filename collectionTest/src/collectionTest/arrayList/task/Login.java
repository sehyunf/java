package collectionTest.arrayList.task;

public class Login {
   public static void main(String[] args) {
      UserField userField = new UserField();
      
//      단위 테스트
      User user = new User();
      user.setId("kdg1008");
      user.setPassword("3238");
      
      System.out.println(user);
      
      if(userField.checkId(user.getId()) == null) {
         userField.join(user);
         System.out.println(DBConnecter.users);
      }
      
      User userForLogin = new User();
      userForLogin.setId("kdg1008");
      userForLogin.setPassword("3238");
      if(userField.login(userForLogin)) {
         System.out.println("로그인 성공");
      }else {
         System.out.println("로그인 실패");
      }
      
//      로그인 후 sessin 대신 사용한 static 필드에 userId로 접근한다.
      System.out.println(UserField.userId);
      
//      마이페이지
      User foundUser = userField.checkId(UserField.userId);
      foundUser.setPassword("1234");
      
//      비밀번호 변경
      userField.changePassword(foundUser);
      
//      로그아웃
      userField.logout();
      
      userForLogin = new User();
      userForLogin.setId("kdg1008");
      userForLogin.setPassword("1234");
      
      if(userField.login(userForLogin)) {
         System.out.println("로그인 성공");
      }else {
         System.out.println("로그인 실패");
      }
      
      
      
   }
}














