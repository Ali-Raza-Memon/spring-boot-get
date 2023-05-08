package com.springboot.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
public class Application {

	@Autowired
	private HomeServices homeServices;

	@RequestMapping("/home-page")

	public List<Home> getAllList(){
		return this.homeServices.getList();
	}

	@RequestMapping ("single-list/{id}")
	public Home getDetailById(@PathVariable String id){
		return this.homeServices.getDataById(id);
	}


	@GetMapping("/test")
	public Home showMsg(){
		Home hm = new Home();
		hm.setName("Next.Js");
		hm.setDetail("For front End Web Developer can learn this.");
		return hm;
	}


	@PostMapping("/add")
	//@RequestMapping(value="/add",method= RequestMethod.POST)
	public Home addData(@RequestBody Home home){
		this.homeServices.addDetails(home);
		return home;
	}

	@DeleteMapping("delete/{homeId}")
	public void deleteData(@PathVariable String homeId){
		System.out.println(homeId);
	}

	@PutMapping("update/{homeId}")
	public Home updateRecord(@RequestBody Home home,@PathVariable String homeId){
		System.out.println(homeId);
		return home;
	}




	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}

}
