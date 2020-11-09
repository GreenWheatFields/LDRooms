package test.java

import main.endpoints.CreateRoom
import org.junit.BeforeClass
import java.sql.*
import org.junit.Test

//testing database connections
class TestDatabase {
    companion object{
        lateinit var databaseConn: Connection
//        lateinit var statement: Statement
        @BeforeClass @JvmStatic
        fun connectToDB(){
            //todo, can't rename server
            databaseConn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres")
        }
    }
    @Test
    fun testInsert(){
        val id = CreateRoom().generateId()
        val statement = databaseConn.prepareStatement("INSERT INTO rooms (id , user1, user2, user1lastlocation, user2lastlocation) VALUES (?,?,?,?,?)")
        statement.setString(1, id).also { statement.setString(2, "userName") }
        statement.executeUpdate()

    }


}
