package main.behavior

import org.springframework.data.repository.CrudRepository

interface RoomRepository : CrudRepository<Room, String>