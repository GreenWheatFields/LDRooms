package main.endpoints

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.servlet.http.HttpServletRequest

@RestController
class Homepage {
    @RequestMapping("/")
    fun home(request:HttpServletRequest): String{
        print(request.remoteAddr)
        print("home")
        return "welcome home!"
    }
}