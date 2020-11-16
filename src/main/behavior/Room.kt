package main.behavior

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "rooms")
class Room {
        @Id
        lateinit var id: String
        @Column(name = "user1", nullable = true)
        lateinit var user1: String
        @Column(name = "user2", nullable = true)
        lateinit var user2: String
        @Column(name = "user1LastLocation", nullable = true)
        lateinit var user1LastLocation: String
        @Column(name = "user2LastLocation", nullable = true)
        lateinit var user2LastLocation: String
}

