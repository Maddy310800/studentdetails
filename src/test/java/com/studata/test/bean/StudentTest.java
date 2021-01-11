/**
 * 
 */
package com.studata.test.bean;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Madhaw Agrawal
 *
 */
@RunWith(SpringRunner.class)
public class StudentTest {

	@Mock
	private Student student;
	
	@Mock
	private Address address;
	
	@Mock
	private Address address1;
	
	@Test
	public void constructorTest() {
		address = new Address(3, "Sambalpur", "bagal Gali");
		address1 = new Address(4, "pune", "khau Gali");
		List<Address> addressList = new ArrayList<>();
		addressList.add(address);
		addressList.add(address1);
		student= new Student(2, "John", 34, 54, addressList);
		assertEquals(54, student.getAvgMarks());
		assertEquals("Sambalpur", student.getAddress().get(0).getCity());
	}
	
	@Test
	public void setterTest() {
		address = new Address();
		address.setAddressid(3);
		address.setCity("Sambalpur");
		address.setStreetName("Bagal Gali");
		address1 = new Address(4, "pune", "khau Gali");
		List<Address> addressList = new ArrayList<>();
		addressList.add(address);
		addressList.add(address1);
		student= new Student();
		student.setAddress(addressList);
		student.setStudentId(2);
		student.setAvgMarks(54);
		student.setStudentName("John");
		assertEquals(54, student.getAvgMarks());
		assertEquals("Sambalpur", student.getAddress().get(0).getCity());
	}
}
