package aboutOOP

/**
 * ketika kita membuat absrac class atau interface, itu tidak bisa langsung dibuat objectnya, kita harus mewarisinya dulu
 * namun kita bisa memakai teknik annonymous class dimana kita menggunakan kata kunci object
 */

//absract class
abstract class AlatMusik(val namaAlatMusik : String){
    abstract fun bunyi(bunyiAkatMusik : String): String
}

//class Gitar(name : String) : AlatMusik(name){
//    override fun bunyi(bunyiAkatMusik: String): String {
//        return "hallo saya ${this.namaAlatMusik}, bunyi saya $bunyiAkatMusik"
//    }
//}

fun main() {

    //contoh implementasi abract class
    val alatMusik1 = object : AlatMusik("gitar"){
        override fun bunyi(bunyiAkatMusik: String) : String {
            return "hallo saya ${this.namaAlatMusik}, bunyi saya $bunyiAkatMusik"
        }
    }
    println(alatMusik1.bunyi("Jrengggg"))

    val alatMusik2 = object : AlatMusik("gendang"){
        override fun bunyi(bunyiAkatMusik: String): String {
            return "hallo saya ${this.namaAlatMusik}, bunyi saya $bunyiAkatMusik"
        }
    }
    println(alatMusik2.bunyi("ketaktung"))


//    val contoh = Gitar("Kendang")
//    println(contoh.bunyi("Kraktung"))
}