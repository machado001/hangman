package com.machado001.words.fake

import com.machado001.words.data.WordsRepository

class FakeWordsRepository : WordsRepository {
    override fun getWords(): Map<String, Set<String>> {
        return FakeDataSource.wordsPair
    }
}