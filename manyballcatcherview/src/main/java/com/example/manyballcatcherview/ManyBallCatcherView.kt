package com.example.manyballcatcherview

import android.view.View
import android.view.MotionEvent
import android.app.Activity
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Canvas
import android.content.Context

val colors : Array<Int> = arrayOf(
    "#f44336",
    "#311B92",
    "#00C853",
    "#00C853",
    "#C51162"
).map {
    Color.parseColor(it)
}.toTypedArray()
val balls : Int = 4
val parts : Int = 2 + balls
val scGap : Float = 0.02f / parts
val strokeFactor : Float = 90f
val delay : Long = 20
val backColor : Int = Color.parseColor("#BDBDBD")
val deg : Float = 90f
