package main.endpoints

import main.behavior.Room
import main.behavior.RoomRepository
import org.springframework.web.bind.annotation.*
import kotlin.random.Random


@RestController
class CreateRoom(private val repo: RoomRepository){


    @RequestMapping("/rooms/create{id}")
    @ResponseBody
    fun createRoom(@RequestParam(value = "id", required = true) id: String): String {
        println("id: $id")
        val room = Room().also{
            room ->  room.id = id
            room.user1 = "user1"
            room.user2 = "user2"
            room.user1LastLocation = "1"
            room.user2LastLocation = "2"
        }

        return "room created"
    }
    fun generateId(): String {
        //todo, companion object?
        val characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray()
        val builder = StringBuilder()
        for (temp in 0..8){
            builder.append(characters[Random.nextInt(characters.size)])
        }
        return builder.toString()
    }
}