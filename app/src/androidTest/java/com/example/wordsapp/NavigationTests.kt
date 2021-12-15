package com.example.wordsapp

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class NavigationTests {
    @get:Rule
    val activity = ActivityScenarioRule(MainActivity::class.java)
    @Test
    fun navigate_to_word() {
        onView(withText("C")).perform(click())
        onView(withText("Words that start with C")).check(matches(isDisplayed()))
    }
}