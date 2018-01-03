package com.genpact.demo;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CheckAttr {
	public String tableName() ;
	public String colName();
	public EDataType[] dataType();
	/**
	 * the type
	 * @author 710009498
	 *
	 */
	public enum EDataType{Double,Integer,String,NotNull,BeforeToday};
}
