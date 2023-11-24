object HTMLRenderer {
  fun render(element: Element): String {
    return when (element) {
      is Text -> element.text
      is Paragraph -> element.toString()
      is Heading -> element.toString()
      is Div -> element.toString()
      is HTMLList -> element.toString()
      is ListItem -> element.toString()
    }
  }

  fun render(page: Page): String {
    val titleTag = "<title>${page.title}</title>"
    val elements = page.elements.joinToString("\n") { it.toString().indentEachLine(2, "  ") }
    return "<html>\n  <head>\n    $titleTag\n  </head>\n  <body>\n$elements\n  </body>\n</html>"
  }
}
