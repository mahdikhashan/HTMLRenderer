data class Text(override val text: String) : TextElement {
  override fun toString(): String = text
}
