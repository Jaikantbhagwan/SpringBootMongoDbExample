package com.example.demo.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Document(collection="UserCollection")
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {

	@Id
	private ObjectId userId = new ObjectId();
	private String userName;
	private Date creationDate=new Date();
	private Map<String,String> userSetting=new HashMap<>();	
	
	public ObjectId getUserId() {
		return userId;
	}
	public void setUserId(ObjectId userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Map<String, String> getUserSetting() {
		return userSetting;
	}
	public void setUserSetting(Map<String, String> userSetting) {
		this.userSetting = userSetting;
	}
	
}
