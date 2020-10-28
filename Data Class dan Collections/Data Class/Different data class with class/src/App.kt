class User(val name: String, val age: Int)

data class DataUser(val name: String, val age: Int)

fun main() {
    val user = User("nrohmen", 17)
    val dataUser = DataUser("nrohmen", 17)

    println(user)
    println(dataUser)
}

/*
   output:
       User@677327b6
       DataUser(name=nrohmen, age=17)
*/