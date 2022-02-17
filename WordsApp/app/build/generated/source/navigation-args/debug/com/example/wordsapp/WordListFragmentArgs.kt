package com.example.wordsapp

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

data class WordListFragmentArgs(
  val letter: String
) : NavArgs {
  fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("letter", this.letter)
    return result
  }

  companion object {
    @JvmStatic
    fun fromBundle(bundle: Bundle): WordListFragmentArgs {
      bundle.setClassLoader(WordListFragmentArgs::class.java.classLoader)
      val __letter : String?
      if (bundle.containsKey("letter")) {
        __letter = bundle.getString("letter")
        if (__letter == null) {
          throw IllegalArgumentException("Argument \"letter\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"letter\" is missing and does not have an android:defaultValue")
      }
      return WordListFragmentArgs(__letter)
    }
  }
}
