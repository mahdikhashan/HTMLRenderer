import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.Arguments.arguments
import org.junit.jupiter.params.provider.MethodSource

import java.util.stream.Stream

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class HTMLListTest {

  private fun booleanAndStringProvider(): Stream<Arguments> {
    return Stream.of(
      arguments(false, "ul"),
      arguments(true, "ol")
    )
  }

  @ParameterizedTest
  @MethodSource("booleanAndStringProvider")
  fun `generates open tag correctly`(
    ordered: Boolean,
    tagName: String
  ) {
    val testHTMLList = HTMLList(
      ordered = ordered,
      ListItem(Text("my text"))
    )
    assertEquals("<$tagName>", testHTMLList.openTag)
  }

  @ParameterizedTest
  @MethodSource("booleanAndStringProvider")
  fun `generates close tag correctly`(
    ordered: Boolean,
    tagName: String
  ) {
    val testHTMLList = HTMLList(
      ordered = ordered,
      ListItem(Text("my text"))
    )
    assertEquals("</$tagName>", testHTMLList.closeTag)
  }

  @ParameterizedTest
  @MethodSource("booleanAndStringProvider")
  fun `renders list of elements correctly`(
    ordered: Boolean,
    tagName: String
  ) {
    val testHTMLList = HTMLList(
      ordered = ordered,
      ListItem(Text("my first item in list")),
      ListItem(Text("my second item in list"))
    )

    // "<$tagName><li>my first item in list</li><li>my second item in list</li></$tagName>"
    val expectedText = """
      <$tagName>
        <li>
          my first item in list
        </li>
        <li>
          my second item in list
        </li>
      </$tagName>
    """.trimIndent()
    assertEquals(expectedText, testHTMLList.toString())
  }
}
