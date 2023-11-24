data class Heading(override val text: String, val level: Int = 1) : TaggedTextElement {
  init {
    require(level in 1..6) {
      throw HeadingLevelException("Heading level must be between 1 and 6")
    }
  }

  override val tag: String
    get() = "h$level"

  override fun toString(): String = "$openTag$text$closeTag"
}

class HeadingLevelException(message: String): Exception(message)
