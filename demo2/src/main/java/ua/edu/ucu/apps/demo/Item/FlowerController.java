package ua.edu.ucu.apps.demo.Item;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/flower-controller")
public class FlowerController {
    @GetMapping
    public List<Flower> getFlowers() {
        return List.of(new Flower(50), new Flower(100));
    }
}
