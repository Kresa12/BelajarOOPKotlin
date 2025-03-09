package aboutOOP

data class Friend(val nama : String)

fun sayHello(friend: Friend?): Unit{

//    if (friend != null){
//        println("hello ${friend.nama}")
//    }

    //elvis opration bekerja apabila object kosong maka yang akan terjadi adalah elvis
    //cara pertama
//    val elvis = friend?.nama ?: throw IllegalArgumentException("tidak boleh kosong")
    //cara kedua
    val elvis = friend?.nama ?: "friend"
    println("hello $elvis")
}

fun main() {
    sayHello(Friend("dava"))
    sayHello(null)
}