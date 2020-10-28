fun main() {
    val sequenceNumber = generateSequence(1) { it + 1 }
    sequenceNumber.take(5).forEach { print("$it ") }
}

/*
   output:
       1 2 3 4 5
*/