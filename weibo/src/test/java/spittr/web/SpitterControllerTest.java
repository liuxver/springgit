package spittr.web;



import static org.hamcrest.core.IsCollectionContaining.hasItems;
import static org.mockito.Mockito.*;//mock函数

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

import org.junit.Test;
import spittr.Spitter;
import spittr.Spittle;
import spittr.data.SpitterRepository;
import spittr.data.SpittleRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.view.InternalResourceView;

/**
 * created by liuxv on 2018/7/23
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
public class SpitterControllerTest {
   @Test
    public void shouldShowRegistration() throws Exception{
        SpitterRepository mockRepository=mock(SpitterRepository.class);
        SpitterController controller=new SpitterController(mockRepository);
        MockMvc mockMvc=standaloneSetup(controller).build();

        mockMvc.perform( get("/spitter/register"))
        .andExpect(view().name( "registerForm" ));

    }


    @Test
    public void shouldProcessRegistration() throws Exception{
        SpitterRepository mockRepository=mock(SpitterRepository.class);
        Spitter unsaved=new Spitter("liuxv","1234","liu","xv","1369058574@qq.com");
        Spitter saved=new Spitter( 24L,"liuxv","1234","liu","xv","1369058574@qq.com");

        when(mockRepository.save( unsaved )).thenReturn( saved );

        SpitterController controller=new SpitterController( mockRepository );
        MockMvc mockMvc=standaloneSetup( controller ).build();

        mockMvc.perform( post("/spitter/register")
        .param( "firstName","liu" )
        .param( "lastName","xv" )
        .param( "username","liuxv" )
        .param( "password","1234" ))
                .andExpect( redirectedUrl( "/spitter/liuxv" ) );

        verify( mockRepository,atLeastOnce() ).save( unsaved );

    }



    @Test
    public void shouldShowSpitter() throws Exception{
        String s=new String( "liuxv" );
        SpitterRepository mockRepository=mock(SpitterRepository.class);

        Spitter spitter=new Spitter( 24L,"liuxv","1234","liu","xv","1369058574@qq.com");

        when( mockRepository.findByUsername( s) ).thenReturn( spitter );

        SpitterController controller=new SpitterController( mockRepository );
        MockMvc mockMvc=standaloneSetup( controller ).build();

        System.out.println( "11111111111" );
        mockMvc.perform( get( "/spitter/liuxv" ) )
                .andExpect( model().attributeExists( "spitter" ) )
                .andExpect( view().name( "profile" ) )
                .andExpect( model().attribute( "spitter",spitter ) );

    }












}
