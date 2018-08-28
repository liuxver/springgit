package spittr.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import spittr.Spittle;
import spittr.data.SpittleRepository;

import java.util.List;

/**
 * created by liuxv on 2018/7/21
 * email:liuxver444@gmail.com
 * qq:1369058574
 */

@Controller
@RequestMapping("/spittles")
public class SpittleController {



    //这里的数字必须是  long 的最大值，不然的话 测试不会通过的
    private static final String MAX_LONG_AS_STRING="9223372036854775807";

    private SpittleRepository spittleRepository;

    @Autowired
    public SpittleController(SpittleRepository spittleRepository){
        this.spittleRepository=spittleRepository;
    }


    /*
    @RequestMapping(method = RequestMethod.GET)
    public String spittles(Model model){
        //key会 根据值的对象类型推断确定。在本例中，因为它是一 个List<Spittle>，因此，键将会推断为spittleList。
        model.addAttribute("spittleList",
                spittleRepository.findSpittles( Long.MAX_VALUE,20 )
        );
        return "spittles";
    }
    */






    //这个函数的情况表明啊  输出的结果 会直接将这个list传回去作为参数
    //同时 会自动推断出这个controller返回的视图名称和路径名称相同 即为spittles
    @RequestMapping(method = RequestMethod.GET)
    public List<Spittle> spittles(
            @RequestParam(value = "max",defaultValue = MAX_LONG_AS_STRING) long max,
            @RequestParam(value = "count",defaultValue = "20") int count
    ){
        return spittleRepository.findSpittles( max,count );
    }



    @RequestMapping(value = "/{spittleId}",method = RequestMethod.GET)
    public String spittle(@PathVariable("spittleId") long spittleId,Model model){
        model.addAttribute( spittleRepository.findOne( spittleId ) );
        return "spittle";
    }






}
