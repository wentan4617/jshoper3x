package com.jshop.entity;

// Generated 2013-10-22 20:45:18 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * UserT generated by hbm2java
 */
@Entity
@Table(name = "user_t", catalog = "jshoper3")
public class UserT implements java.io.Serializable {

	private String userid;
	private String username;
	private String realname;
	private String email;
	private String telno;
	private String mobile;
	private String question;
	private String answer;
	private String password;
	private String userstate;
	private Date postingcount;
	private String section;
	private String position;
	private String groupid;
	private String parttime1;
	private String parttime2;
	private String parttime3;
	private String qq;
	private String sinaweibo;
	private String state;
	private String uid;
	private String rolemname;
	private String rolemid;
	private String headpath;
	private String weixin;

	public UserT() {
	}

	public UserT(String userid, String username, String email, String password,
			String userstate, Date postingcount, String rolemid, String headpath) {
		this.userid = userid;
		this.username = username;
		this.email = email;
		this.password = password;
		this.userstate = userstate;
		this.postingcount = postingcount;
		this.rolemid = rolemid;
		this.headpath = headpath;
	}

	public UserT(String userid, String username, String realname, String email,
			String telno, String mobile, String question, String answer,
			String password, String userstate, Date postingcount,
			String section, String position, String groupid, String parttime1,
			String parttime2, String parttime3, String qq, String sinaweibo,
			String state, String uid, String rolemname, String rolemid,
			String headpath, String weixin) {
		this.userid = userid;
		this.username = username;
		this.realname = realname;
		this.email = email;
		this.telno = telno;
		this.mobile = mobile;
		this.question = question;
		this.answer = answer;
		this.password = password;
		this.userstate = userstate;
		this.postingcount = postingcount;
		this.section = section;
		this.position = position;
		this.groupid = groupid;
		this.parttime1 = parttime1;
		this.parttime2 = parttime2;
		this.parttime3 = parttime3;
		this.qq = qq;
		this.sinaweibo = sinaweibo;
		this.state = state;
		this.uid = uid;
		this.rolemname = rolemname;
		this.rolemid = rolemid;
		this.headpath = headpath;
		this.weixin = weixin;
	}

	@Id
	@Column(name = "USERID", unique = true, nullable = false, length = 20)
	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	@Column(name = "USERNAME", nullable = false, length = 50)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "REALNAME", length = 50)
	public String getRealname() {
		return this.realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	@Column(name = "EMAIL", nullable = false, length = 100)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "TELNO", length = 20)
	public String getTelno() {
		return this.telno;
	}

	public void setTelno(String telno) {
		this.telno = telno;
	}

	@Column(name = "MOBILE", length = 20)
	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Column(name = "QUESTION", length = 50)
	public String getQuestion() {
		return this.question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	@Column(name = "ANSWER", length = 50)
	public String getAnswer() {
		return this.answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Column(name = "PASSWORD", nullable = false, length = 32)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "USERSTATE", nullable = false, length = 1)
	public String getUserstate() {
		return this.userstate;
	}

	public void setUserstate(String userstate) {
		this.userstate = userstate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "POSTINGCOUNT", nullable = false, length = 0)
	public Date getPostingcount() {
		return this.postingcount;
	}

	public void setPostingcount(Date postingcount) {
		this.postingcount = postingcount;
	}

	@Column(name = "SECTION", length = 20)
	public String getSection() {
		return this.section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	@Column(name = "POSITION", length = 20)
	public String getPosition() {
		return this.position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Column(name = "GROUPID", length = 20)
	public String getGroupid() {
		return this.groupid;
	}

	public void setGroupid(String groupid) {
		this.groupid = groupid;
	}

	@Column(name = "PARTTIME1", length = 20)
	public String getParttime1() {
		return this.parttime1;
	}

	public void setParttime1(String parttime1) {
		this.parttime1 = parttime1;
	}

	@Column(name = "PARTTIME2", length = 20)
	public String getParttime2() {
		return this.parttime2;
	}

	public void setParttime2(String parttime2) {
		this.parttime2 = parttime2;
	}

	@Column(name = "PARTTIME3", length = 20)
	public String getParttime3() {
		return this.parttime3;
	}

	public void setParttime3(String parttime3) {
		this.parttime3 = parttime3;
	}

	@Column(name = "QQ", length = 50)
	public String getQq() {
		return this.qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	@Column(name = "SINAWEIBO", length = 100)
	public String getSinaweibo() {
		return this.sinaweibo;
	}

	public void setSinaweibo(String sinaweibo) {
		this.sinaweibo = sinaweibo;
	}

	@Column(name = "STATE", length = 1)
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "UID", length = 32)
	public String getUid() {
		return this.uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	@Column(name = "ROLEMNAME", length = 45)
	public String getRolemname() {
		return this.rolemname;
	}

	public void setRolemname(String rolemname) {
		this.rolemname = rolemname;
	}

	@Column(name = "ROLEMID", nullable = false, length = 20)
	public String getRolemid() {
		return this.rolemid;
	}

	public void setRolemid(String rolemid) {
		this.rolemid = rolemid;
	}

	@Column(name = "HEADPATH", nullable = false, length = 225)
	public String getHeadpath() {
		return this.headpath;
	}

	public void setHeadpath(String headpath) {
		this.headpath = headpath;
	}

	@Column(name = "WEIXIN", length = 45)
	public String getWeixin() {
		return this.weixin;
	}

	public void setWeixin(String weixin) {
		this.weixin = weixin;
	}

}
