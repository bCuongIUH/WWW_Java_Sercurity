/*
*(#) HomeController.java  1.0    Dec 21, 2024
*Copyright (c) 2024 IUH. All rights reserved.
*/
package com.example.OnThiCK_V1.controllers;
/*
* @description :
* @author: Bach Van Cuong
* @date:   Dec 21, 2024
* @version: 1.0
*/

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String home() {
		return "index";
	}
}
