data class Page(val title: String, val elements: List<Element>) {
    constructor(title: String, vararg elements: Element): this(title, elements.toList())
}
