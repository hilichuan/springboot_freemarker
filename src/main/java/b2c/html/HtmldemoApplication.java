package b2c.html;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("b2c.html.dao")
public class HtmldemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HtmldemoApplication.class, args);
	}
}
