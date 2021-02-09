package com.aagcaoili.profile;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Angelo Agcaoili
 */
@RestController
@RequestMapping("/test")
public class Controller {

    @GetMapping
    public String test() {
        return "success";
    }
}
