data class Paragraph(override val text: String) : TaggedTextElement {
  override val tag: String
    get() = "p"

  override fun toString(): String = "$openTag$text$closeTag"
}