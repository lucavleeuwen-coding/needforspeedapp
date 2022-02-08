package com.example.rentmycar.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.rentmycar.R

class MainMenuActivity : AppCompatActivity() {
    private lateinit var mainMenuPlanTripsBtn: Button
    private lateinit var mainMenuMyTripBtn : Button
    private lateinit var mainMenuRegisterCarBtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layout)

        //Finds and sets the buttons
        mainMenuMyTripBtn = findViewById(R.id.main_menu_my_trip_btn)
        mainMenuRegisterCarBtn = findViewById(R.id.main_menu_register_car_btn)
        mainMenuPlanTripsBtn = findViewById(R.id.main_menu_plan_trips_btn)


        //Sets intent to go to My Trips screen
        mainMenuMyTripBtn.setOnClickListener{
            val Intent = Intent(this, TripActivity::class.java)
            startActivity(Intent)
        }

        //Sets intent to go to Register Car screen
        mainMenuRegisterCarBtn.setOnClickListener{
            val Intent = Intent(this, CarRegisterActivity::class.java)
            startActivity(Intent)
        }

        //Sets intent to go to Plan Trip screen
        mainMenuPlanTripsBtn.setOnClickListener{
            val Intent = Intent(this, CarActivity::class.java)
            startActivity(Intent)
        }
    }
}