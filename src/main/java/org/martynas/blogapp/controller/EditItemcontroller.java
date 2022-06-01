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
public class EditItemcontroller {
	private final PostService postService;
    private final BlogUserService blogUserService;

    @Autowired
    public EditItemcontroller(PostService postService, BlogUserService blogUserService) {
        this.postService = postService;
        this.blogUserService = blogUserService;
    }
    @Secured("ROLE_ADMIN")
	@GetMapping("/editItem/{id}")
    public String editPost(@PathVariable Long id, Model model, Principal principal) {
      
        String authUsername = "anonymousUser";
        if (principal != null) {
            authUsername = principal.getName();
        }     
        Optional<Post> optionalPost = this.postService.getById(id);
        if (optionalPost.isPresent()) {
            Post post = optionalPost.get();
           
            if (authUsername.equals(post.getUser().getUsername())) {
                model.addAttribute("post", post);
                System.err.println("EDIT post: " + post); 
                return "add-item";
            } else {
                System.err.println("Current User has no permissions to edit anything on post by id: " + id); // for testing debugging purposes
                return "403";
            }
        } else {
            System.err.println("Could not find a post by id: " + id); 
            return "error";
        }
    }
}
