import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals

class ParagraphTest {

  private val testParagraph: Paragraph = Paragraph(
    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut mattis vestibulum auctor."
  )

  @Test
  fun `renders paragraph elements correctly`() {
    val expectedText = "<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut mattis vestibulum auctor.</p>"
    assertEquals(expectedText, testParagraph.toString())
  }

  @Test
  fun `generates open tag correctly`() {
    assertEquals("<p>", testParagraph.openTag)
  }

  @Test
  fun `generates close tag correctly`() {
    assertEquals("</p>", testParagraph.closeTag)
  }

  @Test
  fun `sets the content correctly`() {
    assertEquals(
      "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut mattis vestibulum auctor.",
      testParagraph.text
    )
  }
}
