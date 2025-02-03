package constructor

/**
 * ini materi inheritence
 */

open class Employee(val name : String, val sience : Int) {
    open fun sayHello(name : String){
        println("hallo $name, im pt ${this.name} berdiri tahun ${this.sience}")
    }
}

open class Manager (name: String, sience: Int, val kontol : String) : Employee(name, sience){
    final override fun sayHello(name: String) {
        println("hallo $name, im pt ${this.name} berdiri tahun ${this.sience}, jenisnya ${this.kontol}")
    }
}

class VicePresinent (name: String, sience: Int, kontol : String) : Manager(name,sience,kontol){
//    override fun sayHello(name: String) {
//        println("hallo $name, im pt ${this.name} berdiri tahun ${this.sience}, jenisnya ${this.kontol}")
//    }
}

fun main() {
    val karyawan = Manager("Cokro", 2000, "memek")

    karyawan.sayHello("asep")
}