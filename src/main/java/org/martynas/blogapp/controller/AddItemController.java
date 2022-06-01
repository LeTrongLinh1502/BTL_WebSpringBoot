package org.martynas.blogapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.martynas.blogapp.model.BlogUser;
import org.martynas.blogapp.model.Post;
import org.martynas.blogapp.service.BlogUserService;
import org.martynas.blogapp.service.PostService;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import java.security.Principal;
import java.util.Collection;
import java.util.Optional;

import javax.validation.Valid;
@Controller
@SessionAttributes("post")
public class AddItemController {
	 private final PostService postService;
	    private final BlogUserService blogUserService;

	    @Autowired
	    public AddItemController(PostService postService, BlogUserService blogUserService) {
	        this.postService = postService;
	        this.blogUserService = blogUserService;
	    }
	    @Secured("ROLE_ADMIN")
	    @GetMapping("/themItem")
	    public String createNewPost(Model model, Principal principal) {

	        String authUsername = "anonymousUser";
	        if (principal != null) {
	            authUsername = principal.getName();
	        }
	       
	        Optional<BlogUser> optionalBlogUser = this.blogUserService.findByUsername(authUsername);

	        if (optionalBlogUser.isPresent()) {
	            Post post = new Post();
	            post.setUser(optionalBlogUser.get());
	            model.addAttribute("post", post);
	            return "add-item";
	        } else {
	            return "error";
	        }
	    }

	    @Secured("ROLE_ADMIN")
	    @PostMapping("/themItem")
	    public String createNewPost(@Valid @ModelAttribute Post post, BindingResult bindingResult, SessionStatus sessionStatus) {
	        System.err.println("POST post: " + post); // for testing debugging purposes
	        if (bindingResult.hasErrors()) {
	            System.err.println("Post did not validate");
	            return "add-item";
	        }
	        this.postService.save(post);
	        System.err.println("SAVE post: " + post); 
	        sessionStatus.setComplete();
//	        return "redirect:/post/" + post.getId();
	        return "redirect:/admin";
	    }
//	@GetMapping("/add-item")
//	public String addItem(Model model,Principal principal) {
////		String authUsername = "anonymousUser";
////        if (principal != null) {
////            authUsername = principal.getName();
////        }
//		Post post = new Post();
////		Optional<BlogUser> optionalBlogUser = this.blogUserService.findByUsername(authUsername);
////		post.setUser(optionalBlogUser.get());
//        model.addAttribute("post", post);
////		return "add-item";
//		return "postForm";
//	}
}
