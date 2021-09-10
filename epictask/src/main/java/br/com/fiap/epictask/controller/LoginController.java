package br.com.fiap.epictask.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fiap.epictask.model.User;
import br.com.fiap.epictask.repository.UserRepository;

@Controller
public class LoginController {

	@Autowired
	private UserRepository repository;
	
	@GetMapping("/userList")
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView("userList");
		List<User> user = repository.findAll();
		modelAndView.addObject("userList", user);
		return modelAndView;
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@RequestMapping("/login/new")
	public String newUSer(User User) {
		return "newUser";
	}

	@PostMapping("/login")
	public String save(@Valid User user, BindingResult result) {
		if (result.hasErrors()) return "newUser";
		
		repository.save(user);
		System.out.println(user);
		return "redirect:/login";
	}

}
