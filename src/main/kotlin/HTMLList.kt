data class HTMLList(
  override val elements: List<ListItem>,
  val ordered: Boolean
) : ContainerElement {
  override val tag: String
    get() = if (ordered) "ol" else "ul"

  constructor(ordered: Boolean, vararg items: ListItem) : this(items.toList(), ordered)

  override fun toString(): String {
    val listItems = elements.joinToString("\n") { it.toString().indentEachLine(1, "  ") }
    return "$openTag\n$listItems\n$closeTag"
  }
}
