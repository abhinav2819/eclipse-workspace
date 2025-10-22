package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//Hear by using @Component annotation we remove the need of creating the bean in the XML file
//In this way we use the stereotype annotation also inject values using @Value annotation
/*If we didn't given the name of the object to be created in the background by IOC container then by default
//IOC will create the object with name using the class name and change it to camelCase for example - here 
//we have created 'Student' class and we didn't given any name then by default the object will be 
created as 'student' and we can use this to getBean method*/
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
	
	//If we wanted to insert any collections then in this way we can do so (we have to create one standalone collection type )
	//This is collection with value(Here we have used spring expression language)
	@Value("#{add}")
	private List<String> address;
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
	
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + "]";
	}
	
}
