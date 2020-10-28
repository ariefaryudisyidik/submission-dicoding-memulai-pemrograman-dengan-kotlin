import kotlinx.coroutines.*

@ExperimentalCoroutinesApi
fun main() = runBlocking<Unit> {
    launch(Dispatchers.Unconfined) {
        println("Starting in ${Thread.currentThread().name}")
        delay(1000)
        println("Resuming in ${Thread.currentThread().name}")
    }.start()
}

/*
   output:
       Starting in main
       Resuming in kotlinx.coroutines.DefaultExecutor
*/