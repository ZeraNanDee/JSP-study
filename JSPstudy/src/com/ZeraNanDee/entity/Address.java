package com.ZeraNanDee.entity;

public class Address extends idEntity {
	private String city;
	private String country;
	private Long userid;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", country=" + country + ", userid=" + userid + ", id=" + id + "]";
	}

}
