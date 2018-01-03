package com.genpact.demo;

import java.lang.reflect.InvocationTargetException;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.beanutils.BeanUtils;
import org.hibernate.validator.HibernateValidator;
import org.springframework.stereotype.Component;

import com.genpact.demo.CheckAttr.EDataType;
@SuppressWarnings("all")
@Component
public class CheckAttrValidator implements ConstraintValidator<CheckAttr, Object> {
	private String tableName;
	private String colName;
	private EDataType[] dataType;
    
	public void initialize(CheckAttr checkAttr) {
		this.tableName = checkAttr.tableName();  
        this.colName = checkAttr.colName(); 
        this.dataType = checkAttr.dataType(); 
	}

	public boolean isValid(Object obj, ConstraintValidatorContext context) {
		try {  
            String tableName= BeanUtils.getProperty(obj,"tableName");  
            String colName= BeanUtils.getProperty(obj,"colName");  
            return false;  
        } catch (IllegalAccessException e) {  
            e.printStackTrace();  
        } catch (InvocationTargetException e) {  
            e.printStackTrace();  
        } catch (NoSuchMethodException e) {  
            e.printStackTrace();  
        }  
        return true; 
        
        
	}

}
