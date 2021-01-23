package library_kotlin.domain.model.item.bibliography

/**
 * 本
 */
data class Book(
    val bookNumber: BookNumber,
    val title: Title,
    val author: Author,
) {
    fun isSame(other: Book): Boolean {
        return bookNumber.sameValue(other.bookNumber)
    }

    fun show(): String {
        return "$title ($author)"
    }

    override fun toString(): String {
        return "Book{bookNumber=$bookNumber, title=$title, author=$author}"
    }
}
