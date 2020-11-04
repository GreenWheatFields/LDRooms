package test.java

import java.sql.*
import org.junit.Test
//testing database connections
class Sandbox {
    @Test
    fun testDb() {
        //todo, add postgre dependancy to maven
        val driverManager = DriverManager.getConnection("jdbc:postgresql://localhost:5432/RoomsForLDRooms")
    }
}
