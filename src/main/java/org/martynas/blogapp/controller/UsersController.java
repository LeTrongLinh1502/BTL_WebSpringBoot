package org.martynas.blogapp.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.martynas.blogapp.model.BlogUser;
import org.martynas.blogapp.model.Post;
import org.martynas.blogapp.service.BlogUserService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.Collection;
@Controller
public class UsersController {
	private final BlogUserService blogUserService;

    @Autowired
    public UsersController(BlogUserService blogUserService) {
        this.blogUserService = blogUserService;
    }
	@GetMapping("/users")
	public String users(Model model) {
		Collection<BlogUser> users = this.blogUserService.getAll();
		
        model.addAttribute("users", users);
		return "users";
	}
}
