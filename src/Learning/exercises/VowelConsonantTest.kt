package Learning.exercises

import org.junit.Assert
import org.junit.Test

class VowelConsonantTest {

    @Test fun countVowels(){
        Assert.assertEquals(11, countVowels("Quantas vogais tem esta frase"))
    }

    @Test fun countConsonants(){
        Assert.assertEquals(21, countConsonants("Geralmente uma frase possui mais consoantes"))
    }

    @Test fun countVowelsAndConsonants(){
        val frase = "Estou gostam muito de aprender Kotlin!"
        Assert.assertEquals(18, countConsonants(frase))
        Assert.assertEquals(14, countVowels(frase))
    }


}