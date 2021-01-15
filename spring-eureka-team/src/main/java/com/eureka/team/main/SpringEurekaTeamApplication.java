package com.eureka.team.main;

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
public class SpringEurekaTeamApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaTeamApplication.class, args);
	}

}

@RestController
class TeamRestController {
	@RequestMapping(value = "list", method = RequestMethod.GET, produces = "application/json")
	public List<Team> getAll(){
		List<Team> teams = Arrays.asList(
			new Team(1, "Team RnD"),
			new Team(2, "Team Smart City"),
			new Team(3, "Team Viettel Map")
				);
		return teams;
	}
}

class Team {
	
	private Integer id; 
	private String name; 
	
	public Team() {
		
	}
	
	public Team(Integer id, String name) {
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
	