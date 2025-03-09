package aboutOOP

/**
 * interface kurang lebihnya sama dengan class, namun lebih tepatnya sama dengan abstract class yaitu tidak bisa langsung digunakan dan harus membuat turunannya
 * interface bisa di turunkan menjadi sebuah class
 * interface tidak bisa menggunakan constractor
 */

interface Interaction{
    val name : String
    fun sayHello(name : String)
}

interface Go{
    //function yang ada di interface tidak wajib di override jika funcion tersebut sudah memiliki body function
    fun go(){
        println("Go!")
    }
}

open class Contoh

/**
 * turunan dari interface harus mewarisi semua yang ada di interface, misalnya properties, function, dll
 */

class Human (override val name: String) : Interaction{
    override fun sayHello(name: String) {
        println("hallo ${this.name} perkenalkan nama saya $name")
    }
}

/**
 * berbeda dengan turunan class yang hanya bisa mempunyai satu parent. jika menggunakan parent interface, turunan bisa mempunya lebih dari satu parent
 * dan turunan juga bisa mempunyai satu parent class
 * jadi turunan bisa mempunyai satu parent class dan lebih dari satu parent interface
 */

class Menungsa(override val name: String) :Contoh(), Interaction, Go{
    override fun sayHello(name: String) {
        println("hallo ${this.name} perkenalkan nama saya $name")
    }
}


fun main() {
    val human = Human("Rony")
    human.sayHello("abas")

    val menungsa = Menungsa("Badrun")
    menungsa.sayHello("Wisnu")
    menungsa.go()
}