package library_kotlin.domain.model.item.bibliography

/**
 * 検索キーワード
 */
data class Keyword(val value: String) {
    fun isBlank(): Boolean {
        return value.isBlank()
    }

    override fun toString(): String {
        return value
    }
}

