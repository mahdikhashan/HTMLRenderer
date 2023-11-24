import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals

class PageTest {

  private val myPage = Page(
    "My HTML Page",
    Div(
      "Welcome to my website!".h1(),
      "Here's a list:".h2(),
      "My paragraph".p()
    )
  )

  @Test
  fun `page title is correct`() {
    val expectedTitle = "My HTML Page"
    assertEquals(expectedTitle, myPage.title)
  }

  @Test
  fun `page elements are correct`() {
    assertEquals(listOf(
      Div(
        "Welcome to my website!".h1(),
        "Here's a list:".h2(),
        "My paragraph".p()
      )
    ), myPage.elements)
  }
}