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
public class DeleteItemController {
	private final PostService postService;
    private final BlogUserService blogUserService;

    @Autowired
    public DeleteItemController(PostService postService, BlogUserService blogUserService) {
        this.postService = postService;
        this.blogUserService = blogUserService;
    }
    @Secured("ROLE_ADMIN")
    @GetMapping("/deleteItem/{title}")
	public String deleteItem(@PathVariable String title) {
    	Optional<Post> optionalPost = this.postService.getByTitle(title);
    	Post post = optionalPost.get();
    	this.postService.delete(post);
    	return "redirect:/admin";
	}
}
