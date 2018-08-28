import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 444 on 2018/5/1.
 */
@Controller
@EnableAutoConfiguration
public class SampleController {
    @RequestMapping("/")
    @ResponseBody
    String hone(){
        return "Hello liuxv!";
    }

    public static void main(String[] args) throws Exception{
        SpringApplication.run(SampleController.class,args);
    }
}
