package library_kotlin.script

import library_kotlin.domain.model.item.bibliography.Author
import library_kotlin.domain.model.item.bibliography.Book
import library_kotlin.domain.model.item.bibliography.BookNumber
import library_kotlin.domain.model.item.bibliography.Title
import library_kotlin.domain.model.member.Member
import library_kotlin.domain.model.member.MemberNumber
import library_kotlin.domain.model.member.MemberType
import library_kotlin.domain.model.member.Name

fun main(argv: Array<String>) {

    val bookNumber: BookNumber = BookNumber(12345)
    val title: Title = Title("Book A")
    val author: Author = Author("Yujin Kinami")

    val book = Book(
        bookNumber = bookNumber,
        title = title,
        author = author
    )

    println(book.toString())

}
