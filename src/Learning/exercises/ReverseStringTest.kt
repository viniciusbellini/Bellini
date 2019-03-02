package Learning.exercises

import Learning.exercises.reverseUsingStringBuilder
import Learning.exercises.reverseUsingStringLoop
import org.junit.Assert.assertEquals
import org.junit.Test

class ReverseStringTest {

    @Test
    fun reverseUsingStringBuilder(){
        assertEquals("BSniltok", reverseUsingStringBuilder("kotlinSB"))
    }

    @Test fun reverseUsingStringLoop(){
        assertEquals("pooLniltok", reverseUsingStringLoop("kotlinLoop"))
    }
}