package com.mkt.mytest.admin.persist.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="sub_category")
@DiscriminatorValue("sub_category")
public class SubCategory extends Category{

}
