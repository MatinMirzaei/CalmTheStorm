package com.example.calmthestorm;

import android.content.Context;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.*;
import static androidx.test.espresso.matcher.ViewMatchers.*;
import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ActivityUITests {
    @Rule
    public ActivityScenarioRule<MainActivity> activityRule =
            new ActivityScenarioRule<>(MainActivity.class);
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.example.calmthestorm", appContext.getPackageName());
    }

    @Test
    public void can_select_tornado(){
        onView(withId(R.id.tornadoBtn)).perform(click());
    }

    @Test
    public void can_select_tornado_info(){
        onView(withId(R.id.tornadoBtn)).perform(click());
        onView(withId(R.id.disasterInfoBtn)).perform(click());
    }

    @Test
    public void can_select_tornado_kit() {
        onView(withId(R.id.tornadoBtn)).perform(click());
        onView(withId(R.id.survivalKitBtn)).perform(click());
    }

    @Test
    public void can_select_tornado_maps(){
        onView(withId(R.id.tornadoBtn)).perform(click());
        onView(withId(R.id.mapsBtn)).perform(click());
    }

    @Test
    public void can_select_earthquake(){
        onView(withId(R.id.earthquakeBtn)).perform(click());
    }

    @Test
    public void can_select_earthquake_info(){
        onView(withId(R.id.earthquakeBtn)).perform(click());
        onView(withId(R.id.disasterInfoBtn)).perform(click());
    }

    @Test
    public void can_select_earthquake_kit() {
        onView(withId(R.id.earthquakeBtn)).perform(click());
        onView(withId(R.id.survivalKitBtn)).perform(click());
    }

    @Test
    public void can_select_earthquake_maps(){
        onView(withId(R.id.earthquakeBtn)).perform(click());
        onView(withId(R.id.mapsBtn)).perform(click());
    }

    @Test
    public void can_select_wildfire(){
        onView(withId(R.id.wildfireBtn)).perform(click());
    }

    @Test
    public void can_select_wildfire_info(){
        onView(withId(R.id.wildfireBtn)).perform(click());
        onView(withId(R.id.disasterInfoBtn)).perform(click());
    }

    @Test
    public void can_select_wildfire_kit() {
        onView(withId(R.id.wildfireBtn)).perform(click());
        onView(withId(R.id.survivalKitBtn)).perform(click());
    }

    @Test
    public void can_select_wildfire_maps(){
        onView(withId(R.id.wildfireBtn)).perform(click());
        onView(withId(R.id.mapsBtn)).perform(click());
    }

    @Test
    public void can_select_volcano(){
        onView(withId(R.id.volcanoBtn)).perform(click());
    }

    @Test
    public void can_select_volcano_info(){
        onView(withId(R.id.volcanoBtn)).perform(click());
        onView(withId(R.id.disasterInfoBtn)).perform(click());
    }

    @Test
    public void can_select_volcano_kit() {
        onView(withId(R.id.volcanoBtn)).perform(click());
        onView(withId(R.id.survivalKitBtn)).perform(click());
    }

    @Test
    public void can_select_volcano_maps(){
        onView(withId(R.id.volcanoBtn)).perform(click());
        onView(withId(R.id.mapsBtn)).perform(click());
    }
}