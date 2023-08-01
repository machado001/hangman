package com.machado001.words.data


interface WordsRepository {
    fun getWords(): Map<String, Set<String>>
}

class WordsRepositoryImpl(
    private val wordsDataSource: WordsDataSource
) : WordsRepository {
    override fun getWords(): Map<String, Set<String>> {
        return wordsDataSource.getWords()
    }
}