import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ListItemTest {

  private val testListItem: ListItem = ListItem(
    Text("my item"),
    ListItem(
      Paragraph("My short paragraph")
    )
  )

  @Test
  fun `renders paragraph elements correctly`() {
    val expectedText = """
      <li>
        my item
        <li>
          <p>My short paragraph</p>
        </li>
      </li>
    """.trimIndent()
    assertEquals(expectedText, testListItem.toString())
  }

  @Test
  fun `generates open tag correctly`() {
    assertEquals("<li>", testListItem.openTag)
  }

  @Test
  fun `generates close tag correctly`() {
    assertEquals("</li>", testListItem.closeTag)
  }
}
