package android.example.myapplication.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import android.example.myapplication.Model.LabReportModel
import android.example.myapplication.R

class LabReportAdapter(private val context: Context, private var LabReportList: List<LabReportModel>): RecyclerView.Adapter<LabReportAdapter.LabReportViewModel>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LabReportViewModel {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.each_row, parent, false)
        return LabReportViewModel(view)
    }

    override fun onBindViewHolder(holder: LabReportViewModel, position: Int) {
        val LabReportList = LabReportList[position]
        holder.ivLabReport.setImageResource(LabReportList.image)
        holder.tvName.setText(LabReportList.name)

        holder.itemView.setOnClickListener {
            Toast.makeText(context, ""+LabReportList.name, Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return LabReportList.size
    }

    class LabReportViewModel(itemView: View): RecyclerView.ViewHolder(itemView) {
        val ivLabReport = itemView.findViewById<ImageView>(R.id.ivLabReport)
        val tvName = itemView.findViewById<TextView>(R.id.tvName);
    }
}