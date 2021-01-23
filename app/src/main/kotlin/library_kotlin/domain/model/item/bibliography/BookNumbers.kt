package library_kotlin.domain.model.item.bibliography

/**
 * 書籍番号のリスト
 */
class BookNumbers(val list: List<BookNumber>) {
    fun asList(): List<BookNumber> {
        return list
    }

    fun isEmpty(): Boolean {
        return list.isEmpty()
    }
}
