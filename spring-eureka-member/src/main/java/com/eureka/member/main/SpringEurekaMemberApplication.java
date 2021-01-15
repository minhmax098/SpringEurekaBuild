package com.eureka.member.main;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@EnableEurekaClient
@SpringBootApplication
public class SpringEurekaMemberApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaMemberApplication.class, args);
	}

}

// restcontroller: composed annotation kết nối từ anno @Controller vs @ResponseBody
@RestController
class MemberRestController {
	 @RequestMapping(value = "list", method = RequestMethod.GET, produces = "application/json")
     public List<Member> getMembers() {
           List<Member> members = Arrays.asList(
        		   new Member(1, "Nguyen Thanh Huyen"),
        		   new Member(2, "Le Ba Hoang Anh"),
                   new Member(3, "Hoang Huu Phuc")
                   );

           return members;
     }
}

class Member {
	private Integer id; 
	private String name; 
	
	public Member() {
		
	}
	
	public Member(Integer id, String name) {
		this.id = id; 
		this.name = name; 
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
