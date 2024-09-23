package id.ac.polbeng.famelaoktavianda.test_kelas

fun main() {
    val greeter = Greeter()
    greeter.greet()
    greeter.text = "Hi"
    greeter.greet("Anton")
    greeter.greet("Budi")
    greeter.text = "Hello Programmer"
    println(greeter.with_ret_val("Dono"))
}