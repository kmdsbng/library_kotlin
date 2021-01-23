package library_kotlin.domain.model.member

import javax.validation.constraints.NotNull


/**
 * 会員番号
 */
class MemberNumber(@NotNull(message = "会員番号を入力してください。") val value: Int?) {
    fun value(): Int? {
        return value
    }

    override fun toString(): String {
        if (value == null || value == 0)
            return ""

        return Integer.toString(value)
    }

    companion object {
        fun empty(): MemberNumber {
            return MemberNumber(null)
        }
    }
}