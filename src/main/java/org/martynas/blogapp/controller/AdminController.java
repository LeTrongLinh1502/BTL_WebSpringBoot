package org.martynas.blogapp.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.martynas.blogapp.model.Post;
import org.martynas.blogapp.service.PostService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.Collection;
@Controller
public class AdminController {
	private final PostService postService;

    @Autowired
    public AdminController(PostService postService) {
        this.postService = postService;
    }
	@GetMapping("/admin")
    public String loginAdmin(Model model) {
		
		Collection<Post> posts = this.postService.getAll();
        model.addAttribute("posts", posts);
        return "admin";
    }
	
	@GetMapping("/edit-user")
    public String EditUser() {
	
        return "edit-user";
    }
	
}
