package com.example.FDP.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.FDP.Dao.FoodMenuRepository;
import com.example.FDP.Model.FoodMenu;

@RestController
public class UserController {

	@Autowired
	FoodMenuRepository fmrepo;
	
	@GetMapping("/menu")
	public List<FoodMenu> viewAll() {
		return fmrepo.findAll();
	}
	
	@DeleteMapping("/menu/{sno}")
	public String deleteItem(@PathVariable int sno) {
		FoodMenu fm = fmrepo.getOne(sno);
		fmrepo.delete(fm);
		return "deleted";
	}
	
	@PutMapping("/menu")
	public FoodMenu updateItem(@RequestBody FoodMenu fm) {
		fmrepo.save(fm);
		return fm;
	}
}
