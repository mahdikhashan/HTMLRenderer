data class Div(override val elements: List<Element>) : ContainerElement {
  override val tag: String
    get() = "div"

  constructor(vararg elements: Element) : this(elements.toList())

  override fun toString(): String {
    val content = elements.joinToString("\n") { it.toString().indentEachLine(1, "  ") }
    return "$openTag\n$content\n$closeTag"
  }
}
