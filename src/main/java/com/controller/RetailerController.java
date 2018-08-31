package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/retailer")
public class RetailerController extends BaseController {
    @RequestMapping("/list")
    public String list() {
        return "home";
    }
}
