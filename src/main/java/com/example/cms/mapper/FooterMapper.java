package com.example.cms.mapper;

import com.example.cms.model.Footer;
import com.example.cms.model.FooterMenu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author ef-LORENZ
 */
@Mapper
public interface FooterMapper {
    List<Footer> getAllFooters();
    Footer getFooterById(Long id);
    void createFooter(Footer footer);
    void updateFooter(Footer footer);
    void deleteFooter(Long id);

    List<FooterMenu> getAllFooterMenus();
    FooterMenu getFooterMenuById(Long id);
    void createFooterMenu(FooterMenu footerMenu);
    void updateFooterMenu(FooterMenu footerMenu);
    void deleteFooterMenu(Long id);
}
