package com.spring;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
  
public class TestCase {  
public static void main(String[] args) {  
 Resource resource=new ClassPathResource("beans.xml");  
    BeanFactory beans=new XmlBeanFactory(resource);  
         
    Student student=(Student)beans.getBean("sb");  
    student.displayInfo();
    
}  
}  