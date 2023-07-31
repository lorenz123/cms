package com.example.cms.service;

import com.example.cms.mapper.FooterMapper;
import com.example.cms.model.Footer;
import com.example.cms.model.FooterMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ef-LORENZ
 */
@Service
public class FooterService {
    private final FooterMapper footerMapper;

    @Autowired
    public FooterService(FooterMapper footerMapper) {
        this.footerMapper = footerMapper;
    }

    public List<Footer> getAllFooters() {
        return footerMapper.getAllFooters();
    }

    public Footer getFooterById(Long id) {
        return footerMapper.getFooterById(id);
    }

    public void createFooter(Footer footer) {
        footerMapper.createFooter(footer);
    }

    public void updateFooter(Footer footer) {
        footerMapper.updateFooter(footer);
    }

    public void deleteFooter(Long id) {
        footerMapper.deleteFooter(id);
    }

    public List<FooterMenu> getAllFooterMenus() {
        return footerMapper.getAllFooterMenus();
    }

    public FooterMenu getFooterMenuById(Long id) {
        return footerMapper.getFooterMenuById(id);
    }

    public void createFooterMenu(FooterMenu footerMenu) {
        footerMapper.createFooterMenu(footerMenu);
    }

    public void updateFooterMenu(FooterMenu footerMenu) {
        footerMapper.updateFooterMenu(footerMenu);
    }

    public void deleteFooterMenu(Long id) {
        footerMapper.deleteFooterMenu(id);
    }
}
