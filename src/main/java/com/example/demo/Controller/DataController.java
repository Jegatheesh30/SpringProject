package com.example.demo.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.UserDataRepo;
import com.example.demo.model.LoginData;
import com.example.demo.model.UserData;

@Controller
public class DataController {
	
	@Autowired
	UserDataRepo repo;
	
	
	@RequestMapping("")
	private String indexPage() {
		return "index.jsp";
	}
	
	@RequestMapping("/saveData")
	@ResponseBody
	private String saveData(UserData userData) {
		repo.save(userData);
		return "Success";
	}

	/*
	 * @RequestMapping("/showData") public ModelAndView showData() { ModelAndView mv
	 * = new ModelAndView(); UserData mv1=repo.findByName("siva");
	 * mv.addObject("ID", mv1.getId()); mv.addObject("Name", mv1.getName());
	 * mv.addObject("email", mv1.getemail()); mv.addObject("Password",
	 * mv1.getpassword()); mv.setViewName("view1"); return mv; }
	 */
	 
	@RequestMapping("/deleteData")
	public ModelAndView deleteData(@RequestParam("id") int id) {
		repo.deleteById(id);
		ModelAndView mv = new ModelAndView();
		List<UserData> datalist = repo.findAll();
		mv.addObject("data",datalist);
		mv.setViewName("view");
		return mv;
		
	}
	
	@RequestMapping("login")
	private String loginPage() {
		return"login";
	}
	
	
	@RequestMapping("log")
	public ModelAndView logincheck(LoginData log) {
		ModelAndView mv = new ModelAndView();
		UserData mav = repo.findByemail(log.getemail());
		System.out.println(log.getemail());
		System.out.println(mav.getpassword());
		if(mav.getpassword().contains(log.getPassword())) {
			mv.setViewName("Welcom");
		}
		else {
			mv.setViewName("Fail");
		}
		return mv;
		
		
		
		
	}
	
}
