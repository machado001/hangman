package com.machado001.words.fake

object FakeDataSource {

    private const val category = "animal"
    private const val wordOne = "elephant"
    private const val wordTwo = "elephant"
    private const val wordThree = "elephant"

    val wordsPair: Map<String, Set<String>> = mapOf(category to setOf(wordOne, wordTwo, wordThree))
}