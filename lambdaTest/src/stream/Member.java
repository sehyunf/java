package stream;

import java.util.Objects;

//필드 : 이름, 취미, 소개
//홍길동, 축구_농구_야구, 나는 축구왕!
//이순신, 개발_당구_축구, 나는 개발자 좋아!
//장보고, 피아노, 피아노만 한 우물!
//김철수, 스포츠댄스_개발, 취미로 춤을 춘다 ~
//김영희, 골프_야구, 운동 선수는 나의 꿈
//흰둥이, 개발_축구_농구, 개발도 운동도 다 잘해요!
public class Member {
	private String name;
	private String hobby;
	private String intro;
	
	public Member() {;}
	public Member(String name, String hobby, String intro) {
		this.name = name;
		this.hobby = hobby;
		this.intro = intro;
	}
	
	@Override
	public String toString() {
		return "Member [name=" + name + ", hobby=" + hobby + ", intro=" + intro + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(hobby, intro, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return Objects.equals(hobby, other.hobby) && Objects.equals(intro, other.intro)
				&& Objects.equals(name, other.name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}
	
}
