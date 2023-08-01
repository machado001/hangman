package com.machado001.words

import com.machado001.words.data.WordsRepository
import com.machado001.words.data.WordsRepositoryImpl
import com.machado001.words.fake.FakeWordsRepository
import com.machado001.words.ui.screens.gameScreen.GameScreenViewModel
import com.machado001.words.ui.screens.gameScreen.alphabetSet
import org.junit.Test
import org.junit.Assert.*


class GameScreenViewModelTest {
    private val viewModel = GameScreenViewModel(FakeWordsRepository())

    @Test
    fun pickRandomWord_NewWorldPicked() {
        viewModel.pickRandomWordAndCategory()
        val wordChosen = viewModel.uiState.value.wordRandomlyChosen
        if (wordChosen != null) {
            assertTrue(wordChosen.isNotEmpty())
        }
    }

    @Test
    fun correctWordGuessed_CorrectLettersUpdated() {
        viewModel.pickRandomWordAndCategory()
        val wordChosen = viewModel.uiState.value.wordRandomlyChosen
        val letter = wordChosen?.first()
        if (letter != null) {
            viewModel.checkUserGuess(letter)
        }
        val correctLetters = viewModel.uiState.value.correctLetters
        assertTrue(correctLetters.contains(letter))
    }

    @Test
    fun wrongWordGuessed_WrongLettersUpdated() {
        viewModel.pickRandomWordAndCategory()
        viewModel.uiState.value.wordRandomlyChosen
        val letter = 'z'
        viewModel.checkUserGuess(letter)
        val wrongLetters = viewModel.uiState.value.wrongLetters
        assertTrue(wrongLetters.contains(letter))
    }

    @Test
    fun gameOver_LivesLeftIsZero() {
        viewModel.pickRandomWordAndCategory()
        val wordChosen = viewModel.uiState.value.wordRandomlyChosen
        val incorrectLetters = alphabetSet.filter { !wordChosen!!.contains(it, ignoreCase = true) }

        var currentLives = viewModel.uiState.value.livesLeft
        var index = 0

        while (currentLives > 0) {
            val letter = incorrectLetters.getOrNull(index)
            if (letter != null) {
                viewModel.checkUserGuess(letter)
                currentLives = viewModel.uiState.value.livesLeft
            }
            index++
        }

        val livesLeft = viewModel.uiState.value.livesLeft
        assertEquals(0, livesLeft)
    }

    @Test
    fun resetGame_NewGameStarted() {
        val livesLeft = viewModel.uiState.value.livesLeft
        viewModel.pickRandomWordAndCategory()
        viewModel.checkUserGuess('A')
        viewModel.resetStates()
        val uiState = viewModel.uiState.value
        println(uiState)
        uiState.wordRandomlyChosen?.let { assertTrue(it.isNotEmpty()) }
        assertTrue(uiState.usedLetters.isEmpty())
        assertTrue(uiState.correctLetters.isEmpty())
        assertTrue(uiState.wrongLetters.isEmpty())
        assertEquals(livesLeft, uiState.livesLeft)
        assertFalse(uiState.isGameOver)
    }
}

