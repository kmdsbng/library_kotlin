package library_kotlin.domain.model.item.bibliography

/**
 * 本のタイトル
 */
data class Title(val value: String) {
    override fun toString(): String {
        return value
    }
}
