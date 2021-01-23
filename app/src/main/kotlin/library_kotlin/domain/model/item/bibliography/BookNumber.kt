package library_kotlin.domain.model.item.bibliography

/**
 * 書籍番号
 */
class BookNumber(val value: Int) {
    constructor(value: String): this(value.toInt())

    fun sameValue(other: BookNumber): Boolean {
        return value == other.value
    }

    override fun toString(): String {
        return Integer.toString(value)
    }
}


