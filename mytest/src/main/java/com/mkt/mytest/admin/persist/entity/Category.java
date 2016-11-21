/**
 * The HelloWorld program implements an application that
 * simply displays "Hello World!" to the standard output.
 *
 * @author  mkt
 * @version 1.0
 * @since   06-11-2016 
 */

package com.mkt.mytest.admin.persist.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.mkt.mytest.base.PersistenceEntity;

@Entity
@Table(name = "category")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "category_type", discriminatorType = DiscriminatorType.STRING)
public class Category extends BaseEntity{
	
	public Category() {
		this.isActive=true;
	}

	@NotNull(message = "error.name.notnull")
	@Size(min = 2, max = 20,message = "error.name.size")
	String name;
	
	@NotNull(message = "error.description.notnull")
	@Size(min = 2, max = 700,message = "error.description.size")
	String description;

	@NotNull(message = "error.imgUrl.notnull")
	@Column(name="img_url")
	String imgUrl;
	
	@Column(name="is_active")
	boolean isActive;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	@PrePersist
	public void setCreatedDate(){
		System.out.println("pre presist method");
		this.createdOn=new Date();
	}

	@Override
	public String toString() {
		return "Category [name=" + name + ", description=" + description
				+ ", imgUrl=" + imgUrl + ", isActive=" + isActive + "]";
	}

	
}
