package com.example.cms.controller;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

/**
 * @author ef-LORENZ
 */
@ExtendWith(MockitoExtension.class)
@WebMvcTest(MenuController.class)
public class MenuControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private MenuService menuService;

    @Test
    public void testGetAllMenus() throws Exception {
        List<Menu> menus = new ArrayList<>();
        menus.add(new Menu(1L, "Menu 1", "#000000", "/page1", "Internal", "logo1.png", 1, "auth1"));
        menus.add(new Menu(2L, "Menu 2", "#FFFFFF", "/page2", "External", "logo2.png", 2, "auth2"));

        when(menuService.getAllMenus()).thenReturn(menus);

        mockMvc.perform(get("/api/navigation/menus"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$[0].id").value(1))
                .andExpect(jsonPath("$[0].name").value("Menu 1"))
                .andExpect(jsonPath("$[0].fontColor").value("#000000"))
                .andExpect(jsonPath("$[0].pageJumpAddress").value("/page1"))
                .andExpect(jsonPath("$[0].pageJumpingMode").value("Internal"))
                .andExpect(jsonPath("$[0].logo").value("logo1.png"))
                .andExpect(jsonPath("$[0].sort").value(1))
                .andExpect(jsonPath("$[0].googleAuth").value("auth1"))
                .andExpect(jsonPath("$[1].id").value(2))
                .andExpect(jsonPath("$[1].name").value("Menu 2"))
                .andExpect(jsonPath("$[1].fontColor").value("#FFFFFF"))
                .andExpect(jsonPath("$[1].pageJumpAddress").value("/page2"))
                .andExpect(jsonPath("$[1].pageJumpingMode").value("External"))
                .andExpect(jsonPath("$[1].logo").value("logo2.png"))
                .andExpect(jsonPath("$[1].sort").value(2))
                .andExpect(jsonPath("$[1].googleAuth").value("auth2"));
    }

    @Test
    public void testGetMenuById() throws Exception {
        Menu menu = new Menu(1L, "Menu 1", "#000000", "/page1", "Internal", "logo1.png", 1, "auth1");

        when(menuService.getMenuById(1L)).thenReturn(menu);

        mockMvc.perform(get("/api/navigation/menus/1"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.id").value(1))
                .andExpect(jsonPath("$.name").value("Menu 1"))
                .andExpect(jsonPath("$.fontColor").value("#000000"))
                .andExpect(jsonPath("$.pageJumpAddress").value("/page1"))
                .andExpect(jsonPath("$.pageJumpingMode").value("Internal"))
                .andExpect(jsonPath("$.logo").value("logo1.png"))
                .andExpect(jsonPath("$.sort").value(1))
                .andExpect(jsonPath("$.googleAuth").value("auth1"));
    }

    @Test
    public void testCreateMenu() throws Exception {
        Menu menuToCreate = new Menu(null, "New Menu", "#333333", "/new-page", "Internal", "new-logo.png", 3, "auth3");

        mockMvc.perform(post("/api/navigation/menus")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(asJsonString(menuToCreate)))
                .andExpect(status().isOk());

        // Assuming the MenuService has a proper implementation for createMenu,
        // you can add additional assertions or verify that the service method was called.
    }

    @Test
    public void testUpdateMenu() throws Exception {
        Menu existingMenu = new Menu(1L, "Menu 1", "#000000", "/page1", "Internal", "logo1.png", 1, "auth1");
        Menu updatedMenu = new Menu(1L, "Updated Menu", "#777777", "/updated-page", "External", "updated-logo.png", 4, "auth4");

        when(menuService.getMenuById(1L)).thenReturn(existingMenu);

        mockMvc.perform(put("/api/navigation/menus/1")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(asJsonString(updatedMenu)))
                .andExpect(status().isOk());

        // Assuming the MenuService has a proper implementation for updateMenu,
        // you can add additional assertions or verify that the service method was called.
    }
}
