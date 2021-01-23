package library_kotlin.domain.model.item.bibliography

/**
 * 本の点数
 * (本の種類の数)
 */
data class NumberOfBook(val value: Int) {
    fun show(): String {
        val over = if (value > NumberOfBook.Companion.MAX_TO_SHOW) "以上" else ""
        return value.toString() + "件" + over
    }

    override fun toString(): String {
        return "$value"
    }

    companion object {
        var MAX_TO_SHOW = 20
    }
}