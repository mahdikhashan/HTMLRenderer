fun String.indentEachLine(depth: Int = 2, symbol: String = " "): String =
  this.split("\n").joinToString("\n") { "${symbol.repeat(depth)}$it" }

fun String.text(): Text = Text(this)

fun String.p(): Paragraph = Paragraph(this)

fun String.h(level: Int): Heading = Heading(this, level)

fun String.h1(): Heading = Heading(this, 1)

fun String.h2(): Heading = Heading(this, 2)

fun String.h3(): Heading = Heading(this, 3)

fun String.h4(): Heading = Heading(this, 4)

fun String.h5(): Heading = Heading(this, 5)

fun String.h6(): Heading = Heading(this, 6)
