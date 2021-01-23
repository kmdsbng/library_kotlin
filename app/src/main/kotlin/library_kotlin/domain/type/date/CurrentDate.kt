package library_kotlin.domain.type.date

import java.time.LocalDate

/**
 * 現在日
 * （状態の時点を表現するクラス）
 */
class CurrentDate(var value: LocalDate) {
    fun value(): LocalDate {
        return value
    }

    companion object {
        fun parse(dateText: String): CurrentDate {
            return CurrentDate(LocalDate.parse(dateText))
        }
    }
}
