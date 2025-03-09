package aboutOOP

interface Base{
    fun sayHello(name : String)
}

class Mybase : Base{
    override fun sayHello(name: String) {
        println("Hallo $name")
    }
}

class Delegation(val base : Base) : Base{
    override fun sayHello(name: String) {
        base.sayHello("Hello $name")
    }
}

fun main() {

    val base = Mybase()
    base.sayHello("Esa")

    val baseDelegation = Delegation(base)
    baseDelegation.sayHello("Juki")
}