package AboutOOP


/**
 * ini materi constructor
 */

class Car (val brandParam : String, val typeParam : String, val colorParam : String, val yearParam : Int){

//    val brand = brandParam
//    val type = typeParam
//    val color = colorParam
//    val year = yearParam

    constructor(brandParam: String, typeParam: String, yearParam: Int): this(brandParam, typeParam, colorParam = "red", yearParam)

    constructor(brandParam: String, typeParam: String): this(brandParam, typeParam, yearParam = 2024)
}

fun main() {
    val mobil1 = Car("Wuling","almaz",2021)
    println(mobil1.brandParam)
    println(mobil1.typeParam)
    println(mobil1.colorParam)
    println(mobil1.yearParam)
}