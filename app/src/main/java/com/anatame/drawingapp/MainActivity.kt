package com.anatame.drawingapp

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.dialog_brush_size.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dvDrawingView.setSizeForBrush(20.toFloat())
        ib_brush.setOnClickListener{
            showBrushSizeChooserDialog()
        }
    }

    private fun showBrushSizeChooserDialog(){
        val brushDialog = Dialog(this)
        brushDialog.setContentView(R.layout.dialog_brush_size)
        brushDialog.setTitle("Brush Size: ")

        val smallBtn = brushDialog.ib_small_brush
        val mediumBtn = brushDialog.ib_medium_brush
        val largeBtn = brushDialog.ib_large_brush

        smallBtn.setOnClickListener{
            dvDrawingView.setSizeForBrush(10.toFloat())
            brushDialog.dismiss()
        }
        mediumBtn.setOnClickListener{
            dvDrawingView.setSizeForBrush(20.toFloat())
            brushDialog.dismiss()
        }
        largeBtn.setOnClickListener{
            dvDrawingView.setSizeForBrush(30.toFloat())
            brushDialog.dismiss()
        }

        brushDialog.show()
    }
}