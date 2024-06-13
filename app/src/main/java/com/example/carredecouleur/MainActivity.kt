package com.example.carredecouleur

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var squareView: View
    private val moveDistance = 20
    private val colors = listOf(Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW, Color.CYAN, Color.MAGENTA)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        squareView = findViewById(R.id.squareView)

        findViewById<Button>(R.id.buttonUp).setOnClickListener { moveSquare(0, -moveDistance) }
        findViewById<Button>(R.id.buttonDown).setOnClickListener { moveSquare(0, moveDistance) }
        findViewById<Button>(R.id.buttonLeft).setOnClickListener { moveSquare(-moveDistance, 0) }
        findViewById<Button>(R.id.buttonRight).setOnClickListener { moveSquare(moveDistance, 0) }
    }

    private fun moveSquare(dx: Int, dy: Int) {
        squareView.x += dx
        squareView.y += dy
        squareView.setBackgroundColor(colors.random())
    }
}
