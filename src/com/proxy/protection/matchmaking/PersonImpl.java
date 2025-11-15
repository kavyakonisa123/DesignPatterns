package com.proxy.protection.matchmaking;

public class PersonImpl implements Person {
	
	String name;
	String gender;
	String interest;
	int rating;
	int ratingCount =0;

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getInterest() {
		return interest;
	}
	public void setInterest(String interest) {
		this.interest = interest;
	}
	public int getGeekRating() {
		if(ratingCount ==0) return 0;
		
		return (rating/ratingCount);
	}
	public void setGeekRating(int rating) {
		this.rating += rating;
		ratingCount++;
	}

}
