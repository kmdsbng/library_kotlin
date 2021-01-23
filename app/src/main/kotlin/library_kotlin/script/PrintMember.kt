package library_kotlin.script

import library_kotlin.domain.model.member.Member
import library_kotlin.domain.model.member.MemberNumber
import library_kotlin.domain.model.member.MemberType
import library_kotlin.domain.model.member.Name

fun main(argv: Array<String>) {
    val number = MemberNumber(1)
    val name = Name("John Doe")
    val type = MemberType.大人

    val member: Member = Member(
            number,
            name,
            type
    )

    println(member.toString())

}
