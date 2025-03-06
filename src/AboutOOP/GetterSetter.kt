package AboutOOP

class Note(title : String){
    var title = title

        get(){
            println("call getter")
            return field //field itu mengacu pada title properties
        }

        set(value) {
            if (value.isNotBlank()){
                println("call setter")
                field = value
            }else{
                println("apa ya")
            }
        }
}

fun main() {

    val tes = Note("Mikaela")

    tes.title = "Miguel" //untuk memanggil object yang telah di set, di kotlin hanya perlu menggunakan cara seperti ini

    println(tes.title)


}

/**
 * perlu dipahami, kita juga bisa memanggil salah satu, bisa getter saja ataupun setter saja, tidak harus memenaggil keduanya
 */