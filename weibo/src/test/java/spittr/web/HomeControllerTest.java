package spittr.web;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

/**
 * created by liuxv on 2018/7/20
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
public class HomeControllerTest {

    /*
    //旧版本的测试文件  只能断言输出是 home
    @Test
    public void testHomePage() throws Exception{
        HomeController controller =new HomeController();
        assertEquals("home",controller.home());
    }
    */


    //新版本的测试代码  发起了对“/”的GET请求，并断言结果视图的名称为 home。
    //它首先传递一个HomeController实例 到MockMvcBuilders.standaloneSetup()
    // 并调用build()来构 建MockMvc实例。
    // 然后它使用MockMvc实例来执行针对“/”的GET请 求并设置期望得到的视图名称。
    @Test
    public void testHomePage() throws Exception{
        HomeController controller=new HomeController();
        MockMvc mockMvc=standaloneSetup(controller).build();
        mockMvc.perform( get("/") ).andExpect( view().name("home") );
    }

}
