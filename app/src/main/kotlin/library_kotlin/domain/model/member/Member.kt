package library_kotlin.domain.model.member

/**
 * 会員
 */
data class Member(val memberNumber: MemberNumber, val name: Name, val memberType: MemberType) {
    fun number(): MemberNumber {
        return memberNumber
    }

    fun name(): Name {
        return name
    }

    fun type(): MemberType {
        return memberType
    }
}
