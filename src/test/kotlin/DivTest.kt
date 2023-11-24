import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DivTest {

  private val testDiv = Div(
    Text("my text in a div"),
    Paragraph("my looooong paragraph")
  )

  @Test
  fun `renders list of elements correctly`() {
    val expectedText = """
      <div>
        my text in a div
        <p>my looooong paragraph</p>
      </div>""".trimIndent()
    assertEquals(expectedText, testDiv.toString())
  }

  @Test
  fun `generates open tag correctly`() {
    assertEquals("<div>", testDiv.openTag)
  }

  @Test
  fun `generates close tag correctly`() {
    assertEquals("</div>", testDiv.closeTag)
  }
}
