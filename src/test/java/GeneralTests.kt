package test.java

import main.endpoints.CreateRoom
import org.junit.Assert
import org.junit.Test
import kotlin.test.assertEquals


class GeneralTests {

    @Test
    fun testUniqueIds() {
        var uniqueIds = mutableSetOf<String>()
        val idGenerator = CreateRoom()

        for (i in 0..1000){
            print(idGenerator.generateId())
        }
    }
}