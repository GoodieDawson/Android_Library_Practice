package com.example.custom_view_practice

import android.content.Context
import android.util.AttributeSet
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class ProfileView(context: Context, attrs: AttributeSet): LinearLayout(context, attrs) {

    init {
        inflate(context, R.layout.profile_view, this)

        val textView: TextView = findViewById(R.id.title)
        val imageView: ImageView = findViewById(R.id.image)
        val textView2: TextView = findViewById(R.id.caption)

        val attributes = context.obtainStyledAttributes(attrs, R.styleable.ProfileView)
        textView.text = attributes.getString(R.styleable.ProfileView_titleText)
        imageView.setImageDrawable(attributes.getDrawable(R.styleable.ProfileView_image))
        textView2.text = attributes.getString(R.styleable.ProfileView_captionText)
        attributes.recycle()

    }
}