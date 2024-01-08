// Компиляция учурунда (compile-time) эсепке алынат
const val MONDAY = "Дүйшөмбү"

/**
 * Көп саптуу (блок) түшүндүрмө - /* ... */
 * Бир сап түшүндүрмө - //
 * main() - программаны баштатуучу жогорку деңгээлдеги (top-level) функция
 * print() - консолго (буйрук сабына) жазып берүүчү функция
 * println() - бир гана сапка жазып берүүчү функция
 */
fun main() {
    println("Салам, дүйнө!!!")

    // val - өзгөрбөс (immutable); компиляция учурунда (compile-time) эсепке алынбайт
    val birthYear = 2014
    println(birthYear)
    println("Туулган жыл: " + birthYear)
    println("Туулган жыл: $birthYear")

    val tuulganJyl = 2014
    println("Туулган жыл: $tuulganJyl")

    //val туулганЖыл = 2014
    //println("Туулган жыл: $туулганЖыл")

    // Ката: val кайрадан ыйгарууга мүмкүн эмес
    //birthYear = 2015

    var age = 10
    println("Жаш: $age")

    age = 11
    println("Жаш: $age")

    println("MONDAY: $MONDAY")

    // Ката: const val жергилүктүү өзгөрмө боло албайт
    //const val TUESDAY = "Шейшемби"
    //println("TUESDAY: $TUESDAY")
}