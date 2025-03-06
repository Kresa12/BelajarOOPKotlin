package AboutOOP

/**
 * ini materi override constructor
 */

open class Person (val nama : String, val jenisKelamin : String, val umur : Int){

    constructor(nama: String, jenisKelamin: String): this(nama, jenisKelamin, 25)
    constructor(nama: String): this(nama, "laki laki")
}

//ketika kita ingin mewarisi constructor dari class Parent kita bisa menggunakan cara pertama, yaitu menggunakan super jadi kita tidak perlu membuat constructor di class chill
class Karyawan : Person{

    constructor(nama: String, jenisKelamin: String): super(nama, jenisKelamin, 25)
    constructor(nama: String): super(nama, "perempuan")//super
}

//bisa menggunakan cara kedua yaitu harus membuah constructor di di kelas chill seperti ini
class Pengusaha (nama: String, jenisKelamin: String, umur: Int): Person(nama, jenisKelamin, umur){

    constructor(nama: String, jenisKelamin: String): this(nama, jenisKelamin, 23)
    constructor(nama: String): this(nama, "Perempuan")
}

fun main() {
    val karyawan = Karyawan("marpuah")
    println(karyawan.nama)

    val pengusaha = Pengusaha("marpuah")
    println(pengusaha.nama)
}
