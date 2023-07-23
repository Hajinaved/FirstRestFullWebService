package com.haji.Restfulwebservice.filteringExample;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
@JsonFilter("somefilter")
public class DemoBean {
int field1;
/* @JsonIgnore */
int field2;
int field3;
public int getField1() {
	return field1;
}
public void setField1(int field1) {
	this.field1 = field1;
}
public int getField2() {
	return field2;
}
public void setField2(int field2) {
	this.field2 = field2;
}
public int getField3() {
	return field3;
}
public void setField3(int field3) {
	this.field3 = field3;
}
DemoBean(int field1, int field2, int field3) {
	super();
	this.field1 = field1;
	this.field2 = field2;
	this.field3 = field3;
}

}
