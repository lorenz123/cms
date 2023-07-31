package com.example.cms.controller;

import com.example.cms.model.Footer;
import com.example.cms.model.FooterMenu;
import com.example.cms.service.FooterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ef-LORENZ
 */
@RestController
@RequestMapping("/api/footer")
public class FooterController {
    private final FooterService footerService;

    @Autowired
    public FooterController(FooterService footerService) {
        this.footerService = footerService;
    }

    @GetMapping("/footers")
    public List<Footer> getAllFooters() {
        return footerService.getAllFooters();
    }

    @GetMapping("/footers/{id}")
    public Footer getFooterById(@PathVariable Long id) {
        return footerService.getFooterById(id);
    }

    @PostMapping("/footers")
    public void createFooter(@RequestBody Footer footer) {
        footerService.createFooter(footer);
    }

    @PutMapping("/footers/{id}")
    public void updateFooter(@PathVariable Long id, @RequestBody Footer footer) {
        footer.setId(id);
        footerService.updateFooter(footer);
    }

    @DeleteMapping("/footers/{id}")
    public void deleteFooter(@PathVariable Long id) {
        footerService.deleteFooter(id);
    }

    @GetMapping("/footermenus")
    public List<FooterMenu> getAllFooterMenus() {
        return footerService.getAllFooterMenus();
    }

    @GetMapping("/footermenus/{id}")
    public FooterMenu getFooterMenuById(@PathVariable Long id) {
        return footerService.getFooterMenuById(id);
    }

    @PostMapping("/footermenus")
    public void createFooterMenu(@RequestBody FooterMenu footerMenu) {
        footerService.createFooterMenu(footerMenu);
    }

    @PutMapping("/footermenus/{id}")
    public void updateFooterMenu(@PathVariable Long id, @RequestBody FooterMenu footerMenu) {
        footerMenu.setId(id);
        footerService.updateFooterMenu(footerMenu);
    }

    @DeleteMapping("/footermenus/{id}")
    public void deleteFooterMenu(@PathVariable Long id) {
        footerService.deleteFooterMenu(id);
    }
}
