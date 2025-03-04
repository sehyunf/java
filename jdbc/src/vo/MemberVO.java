package vo;

import java.util.Objects;

public class MemberVO {
	private Long id;
	private String memberId;
	private String memberPassword;
	private String memberName;
	private String memberAddress;
	private String memberRecommenderId;
	
	public MemberVO() {;}
	
	public MemberVO(Long id, String memberPassword, String memberName, String memberAddress, String memberRecommenderId) {
		this.id = id;
		this.memberPassword = memberPassword;
		this.memberName = memberName;
		this.memberAddress = memberAddress;
		this.memberRecommenderId = memberRecommenderId;
	}

	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", memberPassword=" + memberPassword + ", memberName=" + memberName
				+ ", memberAddress=" + memberAddress + ", memberRecommenderId=" + memberRecommenderId + "]";
	}

	

	@Override
	public int hashCode() {
		return Objects.hash(id, memberAddress, memberName, memberPassword, memberRecommenderId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MemberVO other = (MemberVO) obj;
		return Objects.equals(id, other.id) && Objects.equals(memberAddress, other.memberAddress)
				&& Objects.equals(memberName, other.memberName) && Objects.equals(memberPassword, other.memberPassword)
				&& Objects.equals(memberRecommenderId, other.memberRecommenderId);
	}

	public Long getId() {
		return id;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMemberPassword() {
		return memberPassword;
	}

	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberAddress() {
		return memberAddress;
	}

	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}

	public String getMemberRecommenderId() {
		return memberRecommenderId;
	}

	public void setMemberRecommenderId(String memberRecommenderId) {
		this.memberRecommenderId = memberRecommenderId;
	}
	
}
