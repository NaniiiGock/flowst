package ua.edu.ucu.apps.demo.delivery;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/post-del")
public class PostController {
    @GetMapping
    public List<? extends Delivery> getDeliveries() {
        return List.of(new PostDeliveryStrategy());
    }
}

