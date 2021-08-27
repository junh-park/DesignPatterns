package com.jun.creational.builder;

class UserBasicInfo {
	String nickName;
	String birthDate;
	String gender;

	public UserBasicInfo(String nickName, String birthDate, String gender) {
		this.nickName = nickName;
		this.birthDate = birthDate;
		this.gender = gender;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Name:DOB:Gender:").append(nickName).append(":").append(birthDate).append(":").append(gender);
		return sb.toString();
	}
}

class ContactInfo {
	String eMail;
	String mobileHome;
	String mobileWork;

	public ContactInfo(String eMail, String mobileHome, String mobileWork) {
		this.eMail = eMail;
		this.mobileHome = mobileHome;
		this.mobileWork = mobileWork;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("email:mobile(H):mobile(W):").append(eMail).append(":").append(mobileHome).append(":")
				.append(mobileWork);
		return sb.toString();
	}
}

class FaceBookUser {
	String userName;
	UserBasicInfo userInfo;
	ContactInfo contactInfo;

	public FaceBookUser(String userName) {
		this.userName = userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setUserInfo(UserBasicInfo userInfo) {
		this.userInfo = userInfo;
	}

	public void setContactInfo(ContactInfo contactInfo) {
		this.contactInfo = contactInfo;
	}

	public String getUserName() {
		return userName;
	}

	public UserBasicInfo getUserInfo() {
		return userInfo;
	}

	public ContactInfo getContactInfo() {
		return contactInfo;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("|USER|:").append(userName).append("|UserInfo|").append(userInfo).append("|ContactInfo|")
				.append(contactInfo);
		return sb.toString();
	}

	static class FaceBookUserBuilder {
		FaceBookUser user;

		public FaceBookUserBuilder(String userName) {
			this.user = new FaceBookUser(userName);
		}

		public FaceBookUserBuilder setUserBasicInfo(UserBasicInfo info) {
			user.setUserInfo(info);
			return this;
		}

		public FaceBookUserBuilder setContactInfo(ContactInfo info) {
			user.setContactInfo(info);
			return this;
		}

		public FaceBookUser build() {
			return user;
		}
	}
}

public class BuilderPattern {
	public static void main(String[] args) {
		UserBasicInfo info = new UserBasicInfo("shaodu", "1996-09-15", "F");
		FaceBookUser fbUser1 = new FaceBookUser.FaceBookUserBuilder("Dodo").setUserBasicInfo(info).build();

		System.out.println("Facebook User 1:"+fbUser1);
	}
}
