import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource

class HeadingTest {

  @ParameterizedTest
  @CsvSource(quoteCharacter = '"', textBlock = """
    <h1>My Heading</h1>, 1, My Heading
    <h2>My Heading</h2>, 2, My Heading
    <h3>My Heading</h3>, 3, My Heading
    <h4>My Heading</h4>, 4, My Heading
    <h5>My Heading</h5>, 5, My Heading
    <h6>My Heading</h6>, 6, My Heading""")
  fun `to string works correctly for levels 1 to 6`(
    element: String,
    level: Int,
    text: String
   ) {
    val heading = Heading(text = "My Heading", level = level)
    assertEquals(element, heading.toString())
    assertEquals(text, heading.text)
   }

  @ParameterizedTest
  @ValueSource(ints = [0, 7, 24, -3])
  fun `throws an error for level 7`(level: Int) {
    assertThrows<HeadingLevelException>{ Heading(text = "My Heading", level = level) }
  }

  @Test
  fun `generates open tag correctly`() {
    val heading = Heading(text = "My Heading")
    assertEquals("<h1>", heading.openTag)
  }

  @Test
  fun `generates close tag correctly`() {
    val heading = Heading(text = "My Heading")
    assertEquals("</h1>", heading.closeTag)
  }

  @Test
  fun `sets the content correctly`() {
    val heading = Heading(text = "My Heading")
    assertEquals(
      "My Heading",
      heading.text
    )
  }
 }
