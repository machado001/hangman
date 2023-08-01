package com.machado001.words.data

interface Container {
    val wordsRepository: WordsRepository
}

class ContainerImpl : Container {
    override val wordsRepository: WordsRepository
        get() = WordsRepositoryImpl(WordsDataSource)
}