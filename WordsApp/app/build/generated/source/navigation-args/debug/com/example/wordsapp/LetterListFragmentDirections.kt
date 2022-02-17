package com.example.wordsapp

import android.os.Bundle
import androidx.navigation.NavDirections
import kotlin.Int
import kotlin.String

class LetterListFragmentDirections private constructor() {
  private data class ActionLetterListFragmentToWordListFragment(
    val letter: String
  ) : NavDirections {
    override fun getActionId(): Int = R.id.action_letterListFragment_to_wordListFragment

    override fun getArguments(): Bundle {
      val result = Bundle()
      result.putString("letter", this.letter)
      return result
    }
  }

  companion object {
    fun actionLetterListFragmentToWordListFragment(letter: String): NavDirections =
        ActionLetterListFragmentToWordListFragment(letter)
  }
}
