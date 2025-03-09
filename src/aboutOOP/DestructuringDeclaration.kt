package aboutOOP

data class Mahsiswa (val nama : String, val umur : Int)

data class Dosen(val data : Map<String, String> = mapOf(
    "dyah" to "teknik informatika",
    "slamet" to "akuntansi",
    "dhoyo" to "plugin"
))

fun main() {

    val mahasiswa1 = Mahsiswa("Davi", 24)
    val (nama, umur) = mahasiswa1
    println(nama)
    println(umur)

    //merubah data map
    val baru = Dosen().data.toMutableMap().apply {
        this["dyah"] = "fikal"
        this["slamet"] = "perawat"
    }
    println(baru)

    //destrusturing untuk map
    val dosen1 = Dosen().data
    val (hehe, haha) = listOf(dosen1["dyah"], dosen1["slamet"])
    println(hehe)
    println(haha)
}