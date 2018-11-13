import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
public class App {

    @Controller
    static class Controllers {

        @GetMapping
        public ResponseEntity<String> hello() {
            return ResponseEntity.ok("hi!");
        }
    }
}
