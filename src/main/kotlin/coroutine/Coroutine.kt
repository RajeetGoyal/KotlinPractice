package coroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/***
 *
 * Dispatcher:
 * Decides the thread on which the coroutine will run.
 * 4 Types: Default, IO, Main, Unconfined
 *
 *
 *
 */


fun main() {
    launchRunBlockingCoroutine()
}


fun launchRunBlockingCoroutine() {
    // Creating a coroutine scope
    runBlocking {
        // Launching a new coroutine within the scope
        launch {
            delay(1000L) // Non-blocking delay for 1 second
            println("World!")
        }
        println("Hello,")
    }
}
