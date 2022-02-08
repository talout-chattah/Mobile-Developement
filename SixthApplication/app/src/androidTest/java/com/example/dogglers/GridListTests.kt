package com.example.dogglers

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.swipeUp
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions.scrollToPosition
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.SmallTest
import com.example.dogglers.BaseTest.DrawableMatcher.hasItemCount
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@SmallTest
class GridListTests : BaseTest() {

    @get:Rule
    var activityRule: ActivityScenarioRule<GridListActivity>
            = ActivityScenarioRule(GridListActivity::class.java)

    @Test
    fun `grid_list_content_at_first_position`() {
        checkFirstPosition()
    }

    @Test
    fun `grid_list_content_on_first_page`() {
        onView(withText("Nox")).check(matches(isDisplayed()))
    }

    @Test
    fun `grid_list_content_at_last_position`() {
        onView(withId(R.id.grid_recycler_view))
            .perform(scrollToPosition<RecyclerView.ViewHolder>(lastPosition))
        onView(withText("Bella")).check(matches(isDisplayed()))
    }

    @Test
    fun `vertical_scrolling`() {
        onView(withId(R.id.grid_recycler_view))
            .perform(swipeUp())
        onView(withText("Bella")).check(matches(isDisplayed()))
    }

    @Test
    fun `recycler_view_item_count`() {
        onView(withId(R.id.grid_recycler_view)).check(hasItemCount(6))
    }
}
