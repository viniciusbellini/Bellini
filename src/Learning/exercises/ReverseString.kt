package Learning.exercises

fun reverseUsingStringBuilder(str: String) = StringBuilder(str).reverse().toString()

fun reverseUsingStringLoop(str: String): String{
    var reverse = StringBuilder()

    for (x in str.length downTo 1){
        reverse.append(str.get(x-1))
    }

    return "$reverse"
}
