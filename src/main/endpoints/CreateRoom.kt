package main.endpoints

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.lang.StringBuilder
import kotlin.random.Random

@RestController
class CreateRoom {
    // todo, create database entry, todo later: authenticate requests
    @RequestMapping("/createRoom")
    fun createRoom(): String {
        // if authorized
        print("create room")
        return "room created"
    }
    fun generateId(): String {
        val characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUV0123456789".toCharArray()
        val builder = StringBuilder()
        for (temp in 0..8){
            builder.append(characters[Random.nextInt(62)])
        }
        return builder.toString()
    }
}