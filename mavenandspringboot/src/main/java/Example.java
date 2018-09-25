import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 张明亮
 * @date 2018/9/25 14:19
 */
@RestController
@EnableAutoConfiguration
public class Example {
    @RequestMapping("/")
    public String home() {
        return "Hello World";
    }

    public static void main(String[] args)throws Exception {
        SpringApplication.run(Example.class, args);
    }
}
