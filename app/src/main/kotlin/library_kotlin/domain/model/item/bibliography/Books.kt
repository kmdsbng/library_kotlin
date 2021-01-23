package library_kotlin.domain.model.item.bibliography

import java.util.*

/**
 * 本のリスト
 */
class Books(val list: List<Book>) {
    fun count(): String {
        return NumberOfBook(list.size).show()
    }

    fun size(): Int {
        return list.size
    }

    fun asList(): List<Book> {
        return Collections.unmodifiableList(list)
    }
}

