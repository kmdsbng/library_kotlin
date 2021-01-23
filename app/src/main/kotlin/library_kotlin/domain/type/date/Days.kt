package library_kotlin.domain.type.date

/**
 * 日数
 */
class Days(var value: Int) {
    fun value(): Int {
        return value
    }

    fun lessThan(other: Int): Boolean {
        return value < other
    }
}