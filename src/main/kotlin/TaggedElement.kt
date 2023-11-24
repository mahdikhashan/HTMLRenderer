sealed interface TaggedElement : Element {
    val tag: String
        get() = "tag"
    val openTag: String
        get() = "<$tag>"
    val closeTag: String
        get() = "</$tag>"
}
