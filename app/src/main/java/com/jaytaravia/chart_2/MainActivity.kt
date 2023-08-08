package com.jaytaravia.chart_2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jaytaravia.chart_2.BarChartActivity
import com.jaytaravia.chart_2.DonutChartActivity
import com.jaytaravia.chart_2.LineChartActivity
import com.jaytaravia.chart_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            btnBarChart.setOnClickListener {
                startActivity(Intent(this@MainActivity, BarChartActivity::class.java))
            }
            btnDonutChart.setOnClickListener {
                startActivity(Intent(this@MainActivity, DonutChartActivity::class.java))

            }
            btnLineChart.setOnClickListener {
                startActivity(Intent(this@MainActivity, LineChartActivity::class.java))

            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}