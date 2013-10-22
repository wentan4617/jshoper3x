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
 * GradeT generated by hbm2java
 */
@Entity
@Table(name = "grade_t", catalog = "jshoper3")
public class GradeT implements java.io.Serializable {

	private String id;
	private String type;
	private String name;
	private double start;
	private double end;
	private Double increment;
	private Double multiplypower;
	private String mpstate;
	private Double mpchangepower;
	private Date updatetime;
	private int versiont;

	public GradeT() {
	}

	public GradeT(String id, String type, String name, double start,
			double end, Date updatetime, int versiont) {
		this.id = id;
		this.type = type;
		this.name = name;
		this.start = start;
		this.end = end;
		this.updatetime = updatetime;
		this.versiont = versiont;
	}

	public GradeT(String id, String type, String name, double start,
			double end, Double increment, Double multiplypower, String mpstate,
			Double mpchangepower, Date updatetime, int versiont) {
		this.id = id;
		this.type = type;
		this.name = name;
		this.start = start;
		this.end = end;
		this.increment = increment;
		this.multiplypower = multiplypower;
		this.mpstate = mpstate;
		this.mpchangepower = mpchangepower;
		this.updatetime = updatetime;
		this.versiont = versiont;
	}

	@Id
	@Column(name = "ID", unique = true, nullable = false, length = 20)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "TYPE", nullable = false, length = 1)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "NAME", nullable = false, length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "START", nullable = false, precision = 10)
	public double getStart() {
		return this.start;
	}

	public void setStart(double start) {
		this.start = start;
	}

	@Column(name = "END", nullable = false, precision = 10)
	public double getEnd() {
		return this.end;
	}

	public void setEnd(double end) {
		this.end = end;
	}

	@Column(name = "INCREMENT", precision = 10)
	public Double getIncrement() {
		return this.increment;
	}

	public void setIncrement(Double increment) {
		this.increment = increment;
	}

	@Column(name = "MULTIPLYPOWER", precision = 10)
	public Double getMultiplypower() {
		return this.multiplypower;
	}

	public void setMultiplypower(Double multiplypower) {
		this.multiplypower = multiplypower;
	}

	@Column(name = "MPSTATE", length = 1)
	public String getMpstate() {
		return this.mpstate;
	}

	public void setMpstate(String mpstate) {
		this.mpstate = mpstate;
	}

	@Column(name = "MPCHANGEPOWER", precision = 10)
	public Double getMpchangepower() {
		return this.mpchangepower;
	}

	public void setMpchangepower(Double mpchangepower) {
		this.mpchangepower = mpchangepower;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATETIME", nullable = false, length = 0)
	public Date getUpdatetime() {
		return this.updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	@Column(name = "VERSIONT", nullable = false)
	public int getVersiont() {
		return this.versiont;
	}

	public void setVersiont(int versiont) {
		this.versiont = versiont;
	}

}
