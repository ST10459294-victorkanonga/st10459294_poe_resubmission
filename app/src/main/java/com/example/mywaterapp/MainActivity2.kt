package com.example.mywaterapp




import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val showDataButton = findViewById<Button>(R.id.showb)

        showDataButton.setOnClickListener {
            val intent = Intent(this, thirdActivity::class.java)
            intent.putExtra("hydrationData", getHydrationData())
            startActivity(intent)
        }
    }

    private fun getHydrationData(): String {
        val days = arrayOf(
            "2024-04-02",
            "2024-04-03",
            "2024-04-04",
            "2024-04-05",
            "2024-04-06",
            "2024-04-07",
            "2024-04-08"
        )
        val morningIntake = arrayOf(0.6, 2.0, 1.5, 1.0, 0.8, 1.2, 0.5)
        val afternoonIntake = arrayOf(8.0, 7.0, 6.0, 7.0, 6.5, 6.8, 7.0)
        val notes = arrayOf(
            "Drank water with meals",
            "Infused water with citrus fruits",
            "Stayed hydrated during exercise",
            "Drank herbal tea in the evening",
            "Increased intake during work",
            "Drank electrolyte water",
            "Forgot water bottle at home"
        )

        val hydrationData = StringBuilder()
        for (i in days.indices) {
            hydrationData.append("${days[i]}: Morning ${morningIntake[i]}L, Afternoon ${afternoonIntake[i]}L - ${notes[i]}\n")
        }
        return hydrationData.toString()
    }
}
