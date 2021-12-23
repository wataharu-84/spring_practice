package com.example.BookManager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.BookManager.controller.form.BookForm;

@Controller
public class BookController {
	
	@GetMapping("/add")
	public String getAdd(BookForm form, Model model) {
		model.addAttribute("bookForm", form);
		return "add";
	}

}