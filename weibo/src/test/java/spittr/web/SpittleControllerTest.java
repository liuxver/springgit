package spittr.web;


import static org.hamcrest.core.IsCollectionContaining.hasItems;
import static org.mockito.Mockito.*;//mock函数

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
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
 * created by liuxv on 2018/7/21
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
public class SpittleControllerTest {


    @Test
    public void shouldShowRecentSpittles() throws Exception{
        List<Spittle> expectedSpittles=createSpittleList(20);
        SpittleRepository mockRepository=mock(SpittleRepository.class);
        when(mockRepository.findSpittles( Long.MAX_VALUE,20 )).thenReturn( expectedSpittles );

        System.out.println( Long.MAX_VALUE );
        SpittleController controller=new SpittleController(mockRepository);
        MockMvc mockMvc=standaloneSetup(controller).setSingleView(new InternalResourceView( "/WEB-INF/views/spittles.jsp" )).build();


        mockMvc.perform( get("/spittles") )
                .andExpect( view().name( "spittles" ) )
                .andExpect( model().attributeExists( "spittleList" ) )
                .andExpect( model().attribute( "spittleList",hasItems(expectedSpittles.toArray()) ) );
    }


    @Test
    public void shouldShowPagedSpittles() throws Exception{
        List<Spittle> expectedSpittles=createSpittleList( 50 );
        SpittleRepository mockReposity=mock( SpittleRepository.class );

        when(mockReposity.findSpittles( 238900,50 )).thenReturn( expectedSpittles );

        SpittleController controller=new SpittleController( mockReposity );

        MockMvc mockMvc=standaloneSetup( controller ).setSingleView( new InternalResourceView( "/WEB-INF/views/spittles.jsp" ) ).build();

        mockMvc.perform( get( "/spittles?max=238900&count=50" ) )
                .andExpect( view().name( "spittles" ) )
                .andExpect( model().attributeExists( "spittleList" ) )
                .andExpect( model().attribute( "spittleList",hasItems(expectedSpittles.toArray()) ) );



    }


    @Test
    public void testSpittle() throws Exception{
        Spittle expectedSpittle=new Spittle( "hello",new Date());

        SpittleRepository mockRepository=mock(SpittleRepository.class);

        when( mockRepository.findOne( 12345 )).thenReturn( expectedSpittle );


        SpittleController controller=new SpittleController( mockRepository );
        MockMvc mockMvc=standaloneSetup( controller ).build();

        mockMvc.perform( get("/spittles/12345") )
                .andExpect( view().name( "spittle" ) )
                .andExpect( model().attributeExists("spittle") )
                .andExpect( model().attribute( "spittle",expectedSpittle ) );

    }



    private List<Spittle> createSpittleList(int count){
        List<Spittle> spittles=new ArrayList<Spittle>(  );
        for(int i=0;i<count;i++){
            spittles.add( new Spittle( "spittle "+i,new Date(  ) ) );
        }
        return spittles;
    }



}
