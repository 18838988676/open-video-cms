package com.zhiyou100.entity;

import java.io.Serializable;
import java.sql.Date;

public class SpeakerDO implements Serializable {

	private static final long serialVersionUID = -5927100350941685233L;

	private Integer id;

	private String name;

	private String job;

	private String subjectId;

	public String getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}

	private String imageUrl;

	private String describe;

	private CourseDO course;

	private SubjectDO subject;

	private VideoDO video;

	private boolean status;

	private Date gmtCreate;

	private Date gmtmodified;

	public CourseDO getCourse() {
		return course;
	}

	public void setCourse(CourseDO course) {
		this.course = course;
	}

	public SubjectDO getSubject() {
		return subject;
	}

	public void setSubject(SubjectDO subject) {
		this.subject = subject;
	}

	public VideoDO getVideo() {
		return video;
	}

	public void setVideo(VideoDO video) {
		this.video = video;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Date getGmtCreate() {
		return gmtCreate;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtmodified() {
		return gmtmodified;
	}

	public void setGmtmodified(Date gmtmodified) {
		this.gmtmodified = gmtmodified;
	}

	@Override
	public String toString() {
		return "SpeakerDO [id=" + id + ", name=" + name + ", job=" + job + ", imageUrl=" + imageUrl + ", describe="
				+ describe + ", course=" + course + ", subject=" + subject + ", video=" + video + ", status=" + status
				+ ", gmtCreate=" + gmtCreate + ", gmtmodified=" + gmtmodified + "]";
	}

}
