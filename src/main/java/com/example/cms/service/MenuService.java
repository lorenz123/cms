package com.example.cms.service;

import com.example.cms.mapper.MenuMapper;
import com.example.cms.model.Menu;
import com.example.cms.model.SubMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ef-LORENZ
 */
@Service
public class MenuService {
    private final MenuMapper menuMapper;

    @Autowired
    public MenuService(MenuMapper menuMapper) {
        this.menuMapper = menuMapper;
    }

    public List<Menu> getAllMenus() {
        return menuMapper.getAllMenus();
    }

    public Menu getMenuById(Long id) {
        return menuMapper.getMenuById(id);
    }

    public void createMenu(Menu menu) {
        menuMapper.createMenu(menu);
    }

    public void updateMenu(Menu menu) {
        menuMapper.updateMenu(menu);
    }

    public void deleteMenu(Long id) {
        menuMapper.deleteMenu(id);
    }

    public List<SubMenu> getAllSubMenus() {
        return menuMapper.getAllSubMenus();
    }

    public SubMenu getSubMenuById(Long id) {
        return menuMapper.getSubMenuById(id);
    }

    public void createSubMenu(SubMenu subMenu) {
        menuMapper.createSubMenu(subMenu);
    }

    public void updateSubMenu(SubMenu subMenu) {
        menuMapper.updateSubMenu(subMenu);
    }

    public void deleteSubMenu(Long id) {
        menuMapper.deleteSubMenu(id);
    }
}
