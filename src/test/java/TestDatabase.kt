package test.java

import org.junit.BeforeClass
import java.sql.*
import org.junit.Test
import kotlin.test.assertEquals

//testing database connections
class TestDatabase {
    companion object{
        lateinit var driverManager: Connection
        lateinit var statement: Statement
        @BeforeClass @JvmStatic
        fun connectToDB(){
            //todo, can't rename server
            driverManager = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres")
            statement = driverManager.createStatement()
        }
    }
    @Test
    fun testInsert(){

    }


}
