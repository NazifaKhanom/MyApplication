package android.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import android.example.myapplication.Adapter.LabReportAdapter
import android.example.myapplication.Model.LabReportModel

class MainActivity : AppCompatActivity() {

    private var LabReportList = ArrayList<LabReportModel>()
    private lateinit var rvLabReport: RecyclerView
    private lateinit var adapter: LabReportAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvLabReport = findViewById(R.id.rvlabReport)
        rvLabReport.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        adapter = LabReportAdapter(this, LabReportList)
        rvLabReport.adapter = adapter

        LabReportAssemble()

    }

    private fun LabReportAssemble() {
        val LabReport1 = LabReportModel(R.drawable.a, "a")
        LabReportList.add(LabReport1)

        val LabReport2 = LabReportModel(R.drawable.b, "b")
        LabReportList.add(LabReport2)

        val LabReport3 = LabReportModel(R.drawable.c, "c")
        LabReportList.add(LabReport3)

        val LabReport4 = LabReportModel(R.drawable.d, "d")
        LabReportList.add(LabReport4)

        val LabReport5 = LabReportModel(R.drawable.e, "e")
        LabReportList.add(LabReport5)

        val LabReport6 = LabReportModel(R.drawable.f, "f")
        LabReportList.add(LabReport6)

        val LabReport7 = LabReportModel(R.drawable.g, "g")
        LabReportList.add(LabReport7)

        val LabReport8 = LabReportModel(R.drawable.h, "h")
        LabReportList.add(LabReport8)


    }
}