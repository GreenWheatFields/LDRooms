package main

import org.springframework.lang.NonNull
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Id
lateinit var id: String

@Entity
@Table(name = "rooms")
class Room constructor(id: String, user1: String, user2: String, user1LastLocation: String, user2LastLocation: String) {

}