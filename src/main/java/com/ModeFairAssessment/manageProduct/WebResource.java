package com.ModeFairAssessment.manageProduct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class WebResource {
        @GetMapping(value = "/**/{path:[^\\.]*}")
    public RedirectView redirectToIndex() {
        return new RedirectView("/index.html");
    }
}
