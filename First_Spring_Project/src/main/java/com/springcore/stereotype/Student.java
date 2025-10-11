package com.springcore.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//Hear by using @Component annotation we remove the need of creating the bean in the XML file
//In this way we use the stereotype annotation also inject values using @Value annotation

@Component("student1")
//Hear we have used @Scope annotation to determine the object that it will be created once or more than once.
/*As by default object created as singleton object means once created then the same object will be called 
overtime whenever we create any new object of the same class(more than one).To change this into prototype
we have to use @Scope annotation which will create newer object every time whenever we create there are 
much more type are also there(i.e. request, session(for http) and globalsession) but those are used on 
specific cases. */
//We can also perform this while by creating bean in the XML file also just we have to use the scope keyword
//while specifying the new bean we add like this <bean class="" name="" scope="" />

@Scope("prototype")
public class Student {
	@Value("Abhinav")
	private String studentName;
	@Value("Ranchi")
	private String city;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + "]";
	}
	
}
