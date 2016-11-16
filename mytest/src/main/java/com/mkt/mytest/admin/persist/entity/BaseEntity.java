package com.mkt.mytest.admin.persist.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.mkt.mytest.base.PersistenceEntity;

@MappedSuperclass
public class BaseEntity extends PersistenceEntity{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected long pkId;
	
	@Column(name="last_modified_by")
	protected long LastModifiedBy;

	@Column(name="created_by")
	protected long createdBy;
	
	@Column(name="created_on")
	@Temporal(TemporalType.TIMESTAMP)
	protected Date createdOn;
	
	@Column(name="last_modified_on")
	@Temporal(TemporalType.TIMESTAMP)
	protected Date lastModifiedOn;

	public long getLastModifiedBy() {
		return LastModifiedBy;
	}

	public void setLastModifiedBy(long lastModifiedBy) {
		LastModifiedBy = lastModifiedBy;
	}

	public long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(long createdBy) {
		createdBy = createdBy;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	
	@PrePersist
	public void setCreatedOn() {
		System.out.println("inside------------------------------------------@PrePersist-------------------------------");
		createdOn = new Date();
	}

	public Date getLastModifiedOn() {
		return lastModifiedOn;
	}

	@PreUpdate
	public void setLastModifiedOn() {
		lastModifiedOn=new Date();
	}

	public long getPkId() {
		return pkId;
	}

	public void setPkId(long pkId) {
		this.pkId = pkId;
	}
}
