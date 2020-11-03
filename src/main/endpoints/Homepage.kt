package main.endpoints

import org.springframework.web.bind.annotation.RequestMapping

@RequestMapping
class Homepage {
    fun home(): String{
        print("home!")
        return "welcome home!"
    }
}