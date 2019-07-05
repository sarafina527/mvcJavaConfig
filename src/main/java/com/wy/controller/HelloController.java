package com.wy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * describe:
 *
 * @author wangying49
 * @date 2019/07/04
 */
@Controller
public class HelloController {
    @RequestMapping("/home")
	public  String hello(){

		return "index";
	}
}
