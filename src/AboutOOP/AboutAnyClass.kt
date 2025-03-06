package AboutOOP


fun main() {

    class Tecnologi(val Brand : String, val Type : String){

        //ketika kita mau menampilkan apapun yang ada didalam class, kita biasanya membuat function untuk menampilkan isinya, namun kita juga bisa mengoverride function toString() yang di ambil dari class Any
        override fun toString(): String {
            return "brand : ${this.Brand}, Type : ${this.Type}"
        }

        //funciton display
        fun display(){
            println("brand : ${this.Brand}, Type : ${this.Type}")
        }



    }

    val handphone = Tecnologi("Xiaomi", "Redmi note 11")
    //menampilkan menggunakan function toString()
    println(handphone)

    //menampilkan menggunakan function display()
    handphone.display()

    //menampilkan tanpa menggunakan function
    println(handphone.Brand)
    println(handphone.Type)
}