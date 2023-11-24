import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class HelperTest {

  @Test
  fun indentEachLine() {
    val multiLineTextfirst = """<div>
  <p>my custom paragraph</p>
</div>"""
    val multiLineText = "<div>\n  <p>my custom paragraph</p>\n</div>"
    val testMultiLineText = multiLineText.indentEachLine(depth = 2, symbol = "")
    assertEquals(multiLineTextfirst, testMultiLineText)
  }

  @Test
  fun text() {
    val text = "my-test-text"
    val textInstance = Text("my-test-text")
    assertEquals(text.text(), textInstance)
  }

  @Test
  fun p() {
    val text = "my-test-paragraph"
    val paragraphInstance = Paragraph("my-test-paragraph")
    assertEquals(text.p(), paragraphInstance)
  }

  @ParameterizedTest
  @ValueSource(ints = [1, 2, 3, 4, 5, 6])
  fun h(level: Int) {
    val text = "my-test-heading"
    val headingInstance = Heading("my-test-heading", level = level)
    assertEquals(text.h(level), headingInstance)
  }

  @Test
  fun h1() {
    val text = "my-test-heading"
    val headingInstance = Heading("my-test-heading", level = 1)
    assertEquals(text.h(1), headingInstance)
  }

  @Test
  fun h2() {
    val text = "my-test-heading"
    val headingInstance = Heading("my-test-heading", level = 2)
    assertEquals(text.h(2), headingInstance)
  }

  @Test
  fun h3() {
    val text = "my-test-heading"
    val headingInstance = Heading("my-test-heading", level = 3)
    assertEquals(text.h(3), headingInstance)
  }

  @Test
  fun h4() {
    val text = "my-test-heading"
    val headingInstance = Heading("my-test-heading", level = 4)
    assertEquals(text.h(4), headingInstance)
  }

  @Test
  fun h5() {
    val text = "my-test-heading"
    val headingInstance = Heading("my-test-heading", level = 5)
    assertEquals(text.h(5), headingInstance)
  }

  @Test
  fun h6() {
    val text = "my-test-heading"
    val headingInstance = Heading("my-test-heading", level = 6)
    assertEquals(text.h(6), headingInstance)
  }
}
