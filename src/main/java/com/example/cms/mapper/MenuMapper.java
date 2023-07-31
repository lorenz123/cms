package com.example.cms.mapper;

import com.example.cms.model.Menu;
import com.example.cms.model.SubMenu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author ef-LORENZ
 */
@Mapper
public interface MenuMapper {
    List<Menu> getAllMenus();
    Menu getMenuById(Long id);
    void createMenu(Menu menu);
    void updateMenu(Menu menu);
    void deleteMenu(Long id);

    List<SubMenu> getAllSubMenus();
    SubMenu getSubMenuById(Long id);
    void createSubMenu(SubMenu subMenu);
    void updateSubMenu(SubMenu subMenu);
    void deleteSubMenu(Long id);
}
