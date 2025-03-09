package aboutOOP

/**
 * ini materi Override
 *
 * override adalah membuat ulang atau mengambil segala element yang ada di parent class ke dalam chill class. elemen ini bisa berupa function, constructor, properties
 */

open class Building(val luas: Int, val lebar: Int, val kondisi: String){

    //gunakan kata kunci open agar function bisa dioverride
    open fun result(nama: String){
        println("hallo $nama, saya akan menawarkan bangunan dengan ${this.luas}, lebar ${this.lebar}, dan kondisi ${this.kondisi}")
    }

}

class Rumah (luas: Int, lebar: Int, kondisi: String): Building(luas,lebar,kondisi){

    //gunakan kata kunci override untuk mengoverride
    override fun result(nama: String) {
        println("hallo bapak $nama, saya akan menawarkan rumah dengan ${this.luas}, lebar ${this.lebar}, dan kondisi ${this.kondisi}")
    }

}

open class HitungPerent{
    open var angka = 10
}

class HitungChill: HitungPerent(){
    var angkaTanpaOverride = 15
    val angkaMengambilNilaiDariClassParent = super.angka //bisa juga mengambil nilai dari properties yang ada di Class Parent dnegan kata kunci super
   override var angka = 20
}


fun main() {
    val building = Building(20,24,"dipinggi jalan")
    building.result("anton")

    val rumah = Rumah(12,20, "di dalam gang")
    //karna saya sudah meng override function yang ada di class Building, makan function result bisa saya modif di kelas Bumah
    rumah.result("toni")

    val hitung = HitungPerent()
    println(hitung.angka)

    //outputnya berubah karena properties angka sudah di override dan saya modifikasi valuenya
    val hitung2 = HitungChill()
    println(hitung2.angkaTanpaOverride)
    println(hitung2.angkaMengambilNilaiDariClassParent)
    println(hitung2.angka)
}