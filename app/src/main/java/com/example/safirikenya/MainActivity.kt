
package com.example.safirikenya

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var currentImage = 0
    lateinit var Image:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val next = findViewById<ImageButton>(R.id.btnNext)
        val prev = findViewById<ImageButton>(R.id.btnPrev)
        val placeName= findViewById<TextView>(R.id.tVName)
        var image: ImageView
        var places = arrayOf("Oloolua Nature Trail","Nairobi Arboretum","Paradise Lost")

        next.setOnClickListener{
            // i want to get the next image
            var idCurrentImageString = "pic$currentImage"
            // i have to get  the intenger address
            var idCurrentImageInt = this.resources.getIdentifier(idCurrentImageString, "id", packageName)
            image = findViewById(idCurrentImageInt)
            image.alpha = 0f

            currentImage = (4+currentImage+1)%4
            var idImageToShowString= "pic$currentImage"
            var idImageToShowInt = this.resources.getIdentifier(idImageToShowString,"id",packageName)
            image = findViewById(idCurrentImageInt)
            image.alpha = 1f

            placeName.text=places[currentImage]
        }
        prev.setOnClickListener {
            // i want to get the previous image
            var idCurrentImageString = "pic$currentImage"
            // i have to get  the integer address
            var idCurrentImageInt = this.resources.getIdentifier(idCurrentImageString, "id", packageName)
            image = findViewById(idCurrentImageInt)
            image.alpha = 0f

            currentImage = (4+currentImage-1)%4
            var idImageToShowString= "pic$currentImage"
            var idImageToShowInt = this.resources.getIdentifier(idImageToShowString,"id",packageName)
            image = findViewById(idCurrentImageInt)
            image.alpha = 1f

            placeName.text=places[currentImage]
        }
    }
} 