import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class TextTest {

  private val testText = Text("my text")

  @Test
  fun `renders text element correctly`() {
    val expectedText = "my text"
    assertEquals(expectedText, testText.toString())
  }
}
