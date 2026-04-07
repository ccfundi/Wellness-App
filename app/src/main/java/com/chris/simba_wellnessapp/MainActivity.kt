package com.chris.simba_wellnessapp

import android.content.Intent
import android.os.Bundle
import android.provider.Telephony
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
//        Finding ids using  find view by id from the layout
//        Create a variable to store the button
        val recipe=findViewById<Button>(R.id.recipes)

//        Set on Click listener
        recipe.setOnClickListener {
//            Enable our intent or do navigation

            val recipeIntent= Intent(applicationContext, HealthyRecipes::class.java)
            startActivity(recipeIntent)
        }

//        Nutrition Intent
        val nutrition=findViewById<Button>(R.id.nutrition)

//        Set on click listener
        nutrition.setOnClickListener {
//            Enable our intent or do our navigation

            val nutritionIntent= Intent(applicationContext,NutritionalAdvice::class.java)
            startActivity(nutritionIntent)

//


        }

//        Meditation intent
        val meditation=findViewById<Button>(R.id.meditation)

//        Set on click listener
        meditation.setOnClickListener {

            val meditationIntent= Intent(applicationContext,Meditation::class.java)
            startActivity(meditationIntent)
        }

//        Hydration Alert intent
        val hydration=findViewById<Button>(R.id.hydration)

//        set on click listener
        hydration.setOnClickListener {
            val hydrationIntent= Intent(applicationContext,HydrationAlert::class.java)
            startActivity(hydrationIntent)
        }

//        Weekly Goals intent
        val goals=findViewById<Button>(R.id.goals)

//        onClickListener
        goals.setOnClickListener {
            val goalsIntent= Intent(applicationContext,WeeklyGoals::class.java)
            startActivity(goalsIntent)

        }

//        Check Progress Intent
        val progress=findViewById<Button>(R.id.progress)

//        Set on Click Listener
        progress.setOnClickListener {
            val progressIntent= Intent(applicationContext,CheckProgress::class.java)
            startActivity(progressIntent)
        }

//        Daily motivation Intent
        val motivation=findViewById<Button>(R.id.motivation)

//        OnClickListener
        motivation.setOnClickListener {
            val motivationIntent= Intent(applicationContext, DailyMotivation::class.java)
            startActivity((motivationIntent))
        }

//        Start exercise intent
        val exercise=findViewById<Button>(R.id.exercise)

//        OnClickListener
        exercise.setOnClickListener {
            val exerciseIntent= Intent(applicationContext,StartExercise::class.java)
            startActivity(exerciseIntent)
        }
    }
}



