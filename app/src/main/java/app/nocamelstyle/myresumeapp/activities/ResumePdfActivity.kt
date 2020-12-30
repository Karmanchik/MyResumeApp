package app.nocamelstyle.myresumeapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.nocamelstyle.myresumeapp.R
import com.github.barteksc.pdfviewer.PDFView

class ResumePdfActivity : AppCompatActivity(R.layout.activity_resume_pdf) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        findViewById<PDFView>(R.id.pdfView).fromAsset("Kormachenko_Andrii_2021.pdf")
    }

}