package com.ib.giffify

import android.content.Context
import android.graphics.*
import android.text.Html
import android.util.AttributeSet
import android.view.View
import android.widget.ImageView
import android.graphics.drawable.BitmapDrawable


class Giffy : View {
    lateinit var imageView : ImageView
    lateinit var bitmap: Bitmap
    lateinit var paint: Paint
    private var x1=0f
    private var x2=0f
    private var y1=0f
    private var y2=0f

    constructor(context : Context ) : super(context){
        init(context,null)
    }

    constructor(context: Context,attributeSet: AttributeSet) : super(context,attributeSet){
        init(context,attributeSet)
    }

    private fun init(context: Context, attributeSet: AttributeSet?) {

    }

    private fun Draw() {
        val tempBitmap: Bitmap = Bitmap.createBitmap(bitmap.width,bitmap.height,Bitmap.Config.RGB_565)
        val tempCanvas = Canvas(tempBitmap)

        tempCanvas.drawBitmap(bitmap, 0f, 0f, null)

        tempCanvas.drawRoundRect(RectF(x1, y1, x2, y2), 2f, 2f, paint)

        imageView.setImageDrawable(BitmapDrawable(resources, tempBitmap))
    }
}