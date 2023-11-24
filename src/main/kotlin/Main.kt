import java.io.File

fun main() {
  val page = Page(
    "My Page",
    Div(
      Paragraph("This is a paragraph"),
      Div(Paragraph("This is a paragraph")),
    ),
    Div(Heading("Heading 1", 1)),
    HTMLList(
      true,
      ListItem("my item 1".h2()),
      ListItem("my item 2".h2()),
      ListItem(
        HTMLList(
          true,
          ListItem("d".text()),
        )
      )
    )
  )

  val renderedPage = HTMLRenderer.render(page)
  println(renderedPage)

  // Writing to a file
  val outputFile = File("output.html")
  outputFile.writeText(renderedPage)
  println("HTML page written to: ${outputFile.absolutePath}")
}
