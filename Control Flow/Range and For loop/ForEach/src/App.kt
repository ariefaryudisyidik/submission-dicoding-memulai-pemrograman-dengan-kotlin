// main function
fun main() {
    val ranges = 1.rangeTo(10) step 3

    ranges.forEach { value ->
        println("value is $value!")
    }
}

/*
   output:
       value is 1!
       value is 4!
       value is 7!
       value is 10!
*/