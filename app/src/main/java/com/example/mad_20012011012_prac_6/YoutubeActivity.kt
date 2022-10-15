package com.example.mad_20012011012_prac_6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
class YoutubeActivity : AppCompatActivity() {
    private val youtubeId = "PavAuUAIlTk"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube)
        val mywebview=findViewById<WebView>(R.id.web)
        val settings=mywebview.settings
        settings.javaScriptEnabled=true
        settings.loadWithOverviewMode=true
        settings.useWideViewPort=true
        mywebview.loadUrl("https://www.youtube.com/embed/$youtubeId")
    }
}