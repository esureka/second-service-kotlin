package esperer.secondservice

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class SecondServiceController {

    @GetMapping("/welcome")
    fun welcome(): String {
        return "Welcome to a Second Service"
    }
}