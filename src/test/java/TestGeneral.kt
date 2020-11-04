package test.java

import main.endpoints.CreateRoom
import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.fail


class TestGeneral {

    @Test
    fun testUniqueIds() {
        val uniqueIds = mutableSetOf<String>()
        val idGenerator = CreateRoom()
        val limit= 10_000_000
        for (i in 0..limit){
            val temp = idGenerator.generateId()
            if (uniqueIds.contains(temp)){
                fail("duplicate found: $temp , $i")
            }else{
                uniqueIds.add(temp)
            }

        }
        assertEquals(uniqueIds.size, limit + 1)

    }
}