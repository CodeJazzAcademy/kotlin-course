/**
 * main() - программаны баштатуучу жогорку деңгээлдеги (top-level) функция
 * @param args бир же бир нече саптарды камтыган массив; массив бош болушу дагы мүмкүн
 */
fun main(args: Array<String>) {
    // BOOLEAN - Логикалык тип
    val bool = true
    println("bool: $bool")

    // BYTE - Байт
    println("Byte берилме тибинин өлчөмү: ${Byte.SIZE_BITS} бит")
    println("Byte берилме тибинин минималдык мааниси: ${Byte.MIN_VALUE}")
    println("Byte берилме тибинин максималдык мааниси: ${Byte.MAX_VALUE}")

    // SHORT - Кыска сан
    println("Short берилме тибинин өлчөмү: ${Short.SIZE_BITS} бит")
    println("Short берилме тибинин минималдык мааниси: ${Short.MIN_VALUE}")
    println("Short берилме тибинин максималдык мааниси: ${Short.MAX_VALUE}")

    // INTEGER - Бүтүн сан
    println("Int берилме тибинин өлчөмү: ${Int.SIZE_BITS} бит")
    println("Int берилме тибинин минималдык мааниси: ${Int.MIN_VALUE}")
    println("Int берилме тибинин максималдык мааниси: ${Int.MAX_VALUE}")

    val a = 9
    val b = 6
    println("a: $a")
    println("b: $b")

    // Өзгөрмөнүн берилме тибин билүү
    println("'a' өзгөрмөсүнүн берилме тиби: ${a::class.qualifiedName}")

    // Кошуу
    println(a + b)
    println("a + b = ${a + b}")
    println("a + b = $a + $b = ${a + b}")
    println("a + b = ${a.plus(b)}")

    // Кемитүү
    println("a - b = ${a - b}")
    println("a - b = ${a.minus(b)}")

    // Көбөйтүү
    println("a * b = ${a * b}")
    println("a * b = ${a.times(b)}")

    // Бөлүү
    println("a / b = ${a / b}")
    println("a / b = ${a.div(b)}")

    // Модулдук бөлүү (бөлүүдөн калган калдыкты эсептөө)
    println("a % b = ${a % b}")
    println("a % b = ${a.mod(b)}")

    // Сап тибине айландыруу
    println("a.toString(): ${a.toString()}")

    // Башка сан менен салыштыруу
    println("$a менен 1ди салыштыруу: ${a.compareTo(1)}")
    println("$a менен 9ду салыштыруу: ${a.compareTo(9)}")
    println("$a менен 20ны салыштыруу: ${a.compareTo(20)}")

    //val c: Int = a + 3000000000
    //println("c: $c")

    val c = a + 3000000000
    println("'c' өзгөрмөсүнүн берилме тиби: ${c::class.qualifiedName}")

    // LONG - Бүтүн сан
    println("Long берилме тибинин өлчөмү: ${Long.SIZE_BITS} бит")
    println("Long берилме тибинин минималдык мааниси: ${Long.MIN_VALUE}")
    println("Long берилме тибинин максималдык мааниси: ${Long.MAX_VALUE} - (10^18, Quintillion, E, Exa-)")

    val l = 9L
    println("'l' өзгөрмөсүнүн берилме тиби: ${l::class.qualifiedName}")

    // FLOAT - бөлчөктүү чыныгы сан
    println("Float берилме тибинин өлчөмү: ${Float.SIZE_BITS} бит")
    println("Float берилме тибинин минималдык мааниси: ${Float.MIN_VALUE}")
    println("Float берилме тибинин максималдык мааниси: ${Float.MAX_VALUE}")

    val f = 9.0f
    println("'f' өзгөрмөсүнүн берилме тиби: ${f::class.qualifiedName}")

    // DOUBLE - бөлчөктүү чыныгы сан
    println("Double берилме тибинин өлчөмү: ${Double.SIZE_BITS} бит")
    println("Double берилме тибинин минималдык мааниси: ${Double.MIN_VALUE}")
    println("Double берилме тибинин максималдык мааниси: ${Double.MAX_VALUE}")

    val d = 6.0
    println("'d' өзгөрмөсүнүн берилме тиби: ${d::class.qualifiedName}")

    println("f / d = ${f / d}")

    // CHARACTER - символ
    println("Char берилме тибинин өлчөмү: ${Char.SIZE_BITS} бит")

    val ch = 'A'
    println("Символ: $ch")

    println("'$ch' символунун ASCII коду: ${ch.code}")

    // Сап тибине айландыруу
    println("ch.toString(): ${ch.toString()}")

    println("'$ch' символу санбы?: ${ch.isDigit()}")

    println("'$ch' символу тамгабы?: ${ch.isLetter()}")

    println("'$ch' символунун категориясы: ${ch.category}")

    // STRING - Сап (текст)
    val s = "Кыргызстан"

    println("'$s' сабында канча символ бар? ${s.length}")

    println("'$s' сабынын биринчи тамгасы: ${s[0]}")

    println("'$s' сабынын экинчи тамгасы: ${s[1]}")

    //println("'$s' сабынын 20чы тамгасы: ${s[20]}")

    println("'$s' жана 'Кыргызстан' саптары бирдейби? ${s == "Кыргызстан"}")

    println("'$s' жана 'Бишкек' саптары бирдейби? ${s == "Бишкек"}")

    println("'$s' сабындагы 'стан' сабын ' Республикасы' сабына алмаштыруу: ${s.replace("стан", " Республикасы")}")

    println("'$s' сабынын баш/чоң тамгалар менен жазылышы: ${s.uppercase()}")

    println("'$s' сабынын кичине тамгалар менен жазылышы: ${s.lowercase()}")

    val days = "ДүйшөмбүШейшемби"
    println("days: $days")

    println("'$days' сабын 0. индекстен 8. индекске чейинки сапты бөлүп алуу: ${days.substring(0, 8)}")

    println("'$days' сабын 8. индекстен акыркы индекске чейинки сапты бөлүп алуу: ${days.substring(8, days.length)}")

    val capital = "    Бишкек  "
    println("Борбор шаар: $capital")

    println("'$capital' сабынын оң жана сол жагындагы боштук символдорду өчүрүү: ${capital.trim()}")

    // ARRAY - Массив
    val students = Array<String>(5) { "" }

    // Ljava.lang.Character;@1e81...
    println("'students' массив: $students")
    println("'students' массивдин ичиндеги элементтери (мазмуну) менен кошо сапка айландыруу: ${students.contentToString()}")

    students[0] = "Бектур"
    students[1] = "Чолпонай"
    students[2] = "Нурзат"
    students[3] = "Айжан"
    students[4] = "Акыл"
    println("'students' массивдин ичиндеги элементтери (мазмуну) менен кошо сапка айландыруу: ${students.contentToString()}")

    //               Индекстер: 0    1    2    3    4    5    6    7    8    9   10   11   12
    val keyboardRow2 = arrayOf('`', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '-', '=')
    println("'keyboardRow2' массивдин өлчөмү? ${keyboardRow2.size}")

    //             Индекстер: 0           1           2           3           4       5         6
    val weekdaysKG = arrayOf("Дүйшөмбү", "Шейшемби", "Шаршемби", "Бейшемби", "Жума", "Ишемби", "Жекшемби")
    println("Жүманын 1. күнү: ${weekdaysKG[0]}")
    println("Жүманын 1. күнү: ${weekdaysKG.first()}")
    println("Жүманын 2. күнү: ${weekdaysKG[1]}")
    println("Жүманын акыркы күнү: ${weekdaysKG[6]}")
    println("Жүманын акыркы күнү: ${weekdaysKG[weekdaysKG.size - 1]}")
    println("Жүманын акыркы күнү: ${weekdaysKG.last()}")

    val weekdaysUS = weekdaysKG.clone()
    weekdaysUS[0] = weekdaysKG[6]
    weekdaysUS[1] = weekdaysKG[0]
    weekdaysUS[2] = weekdaysKG[1]
    weekdaysUS[3] = weekdaysKG[2]
    weekdaysUS[4] = weekdaysKG[3]
    weekdaysUS[5] = weekdaysKG[4]
    weekdaysUS[6] = weekdaysKG[5]
    println("АКШдагы жуманын күндөрү: ${weekdaysUS.contentToString()}")

    //            Индекстер: 0   1  2  3  4   5   6   7   8  9
    val numbers = intArrayOf(17, 5, 2, 3, 19, 11, 23, 29, 7, 13)

    val sortedNumbers = numbers.sortedArray()
    println("'sortedNumbers' - сорттолгон массив: ${sortedNumbers.contentToString()}")

    // Массивдин өзүн сорттош үчүн .sort() методун колдонобуз
    numbers.sort()
    println("'numbers' - сорттолгон массив: ${numbers.contentToString()}")

    numbers.reverse()
    println("'numbers' - тескери тизилген массив: ${numbers.contentToString()}")

    // Массивдин элементтерин тартипсиз/баш-аламан кылып тизүү
    numbers.shuffle()
    println("'numbers' - баш-аламан массив: ${numbers.contentToString()}")

    println("'args' - аргументтерди камтыган массив: ${args.contentToString()}")

    // Эки өлчөмдүү массив (матрица)
    val matrix = Array(4) { IntArray(5) }
    matrix.forEach { println(it.contentToString()) }
    matrix[1][1] = 5
    matrix.forEach { println(it.contentToString()) }

    // ж.б. көп колдонулган, пайдалуу методтор жана lambda туюнтмалар
    //.average()
    //.min()
    //.max()
    //.toList()
    //.filter { lambda expression }
    //.map { lambda expression }
    //.flatMap { lambda expression }
    //.count { lambda expression }
    //.find { lambda expression }
    //.forEach { lambda expression }
    //.groupBy { lambda expression }
    //.joinToString { lambda expression }
}