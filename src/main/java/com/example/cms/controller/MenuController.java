package com.example.cms.controller;

import com.example.cms.model.Menu;
import com.example.cms.model.SubMenu;
import com.example.cms.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ef-LORENZ
 */
@RestController
@RequestMapping("/api/navigation")
public class MenuController {
    private final MenuService menuService;

    @Autowired
    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    @GetMapping("/menus")
    public List<Menu> getAllMenus() {
        return menuService.getAllMenus();
    }

    @GetMapping("/menus/{id}")
    public Menu getMenuById(@PathVariable Long id) {
        return menuService.getMenuById(id);
    }

    @PostMapping("/menus")
    public void createMenu(@RequestBody Menu menu) {
        menuService.createMenu(menu);
    }

    @PutMapping("/menus/{id}")
    public void updateMenu(@PathVariable Long id, @RequestBody Menu menu) {
        menu.setId(id);
        menuService.updateMenu(menu);
    }

    @DeleteMapping("/menus/{id}")
    public void deleteMenu(@PathVariable Long id) {
        menuService.deleteMenu(id);
    }

    @GetMapping("/submenus")
    public List<SubMenu> getAllSubMenus() {
        return menuService.getAllSubMenus();
    }

    @GetMapping("/submenus/{id}")
    public SubMenu getSubMenuById(@PathVariable Long id) {
        return menuService.getSubMenuById(id);
    }

    @PostMapping("/submenus")
    public void createSubMenu(@RequestBody SubMenu subMenu) {
        menuService.createSubMenu(subMenu);
    }

    @PutMapping("/submenus/{id}")
    public void updateSubMenu(@PathVariable Long id, @RequestBody SubMenu subMenu) {
        subMenu.setId(id);
        menuService.updateSubMenu(subMenu);
    }

    @DeleteMapping("/submenus/{id}")
    public void deleteSubMenu(@PathVariable Long id) {
        menuService.deleteSubMenu(id);
    }
}
