package ir.freeland.springboot.xml;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.core.io.ClassPathResource;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import generated.Course;
import generated.Note;
import generated.Office;
import generated.Staff;
import generated.Student;
import generated.Teacher;


@SpringBootApplication
@EntityScan("ir.freeland.springboot.persistence.model")
public class XMLApplication {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		SpringApplication.run(XMLApplication.class, args);
		
		
		//student
		 File xmlfile = new ClassPathResource("student.xml").getFile();
		 XmlMapper xmlMapper = new XmlMapper();
		 Student s = xmlMapper.readValue(xmlfile, Student.class);
		 
		 		 
		 Student s1 = new Student();
		 s1.setFirstname("Parisa");
		 s1.setLastname("Taiyari");
		 s1.setPhonenumber("09057515591");
		 s1.setCountry("Iran");
		 s1.setCity("Tehran");
		xmlMapper.writeValue(new File("Student.xml"), s1);
		
		
        //course		
		 xmlfile = new ClassPathResource("course.xml").getFile();
		 Course c = xmlMapper.readValue(xmlfile, Course.class);
		 
		 
		 Course c1=new Course();
		 c1.setName("Math");
		 c1.setLevel("Elementary");
		 c1.setTeacher("Dr.Abbasi");
		 xmlMapper.writeValue(new File("Course.xml"), c1);
		 
		
		
		
        //teacher		
		File jfile = new ClassPathResource("teacher.json").getFile();
		ObjectMapper mapper = new ObjectMapper();
		var t = mapper.readValue(jfile,  Teacher.class);
		Teacher t1=new Teacher();
		t1.setFirstname("Abbas");
		t1.setLastname("Abbasi");
		t1.setAge("80");
		mapper.writeValue(new File("forjson.json"), t1);
	}

}
