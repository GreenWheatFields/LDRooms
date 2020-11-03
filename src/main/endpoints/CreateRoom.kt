package main.endpoints

import org.springframework.web.bind.annotation.*
import java.awt.im.InputMethodRequests
import javax.servlet.http.HttpServletRequest
import kotlin.random.Random

@RestController
class CreateRoom {
    // todo, create database entry, todo later: authenticate requests
    @RequestMapping("/rooms/create{id}")
    @ResponseBody
    fun createRoom(@RequestParam(value = "id") id: String, request: HttpServletRequest): String {
        if (id.isEmpty()) println("empty id") else println(id)
        println(request.getParameter("id"))
        return "room created"
    }
    fun generateId(): String {
        val characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray()
        val builder = StringBuilder()
        for (temp in 0..8){
            builder.append(characters[Random.nextInt(characters.size)])
        }
        return builder.toString()
    }
}