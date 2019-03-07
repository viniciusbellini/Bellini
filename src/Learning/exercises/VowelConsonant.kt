package Learning.exercises

fun countVowels(frase : String) : Int{
    val VOWELS = "aeiou"
    var totalVowels = 0;

    for (letter in frase.toLowerCase()){
        if (letter in VOWELS) totalVowels++
    }
   return totalVowels
}

fun countConsonants(frase : String) : Int{
    val CONSONANTS = "bcdfghjklmnpqrstvwxyz"
    var totalConsonants = 0;

    for (letter in frase.toLowerCase()){
        if (letter in CONSONANTS) totalConsonants++
    }
    return totalConsonants
}