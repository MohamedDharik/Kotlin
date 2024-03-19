fun main(){
     val input: Int = readln().toInt()
     getCalorieCount(input)
}

fun getCalorieCount(input : Int): Double {
    return input * 0.4
}