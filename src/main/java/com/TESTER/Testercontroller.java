package com.TESTER;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Testercontroller {
	@Autowired
	Testerrepository tr;
	
@PostMapping("/post")
public String poster(Entityy a) {
	tr.save(a);
	return "bangedup";
	
}

@GetMapping("/get")
public List<Entityy> getAll() {
	return tr.findAll();
}

}
