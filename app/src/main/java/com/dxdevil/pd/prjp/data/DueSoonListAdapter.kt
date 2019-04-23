package com.dxdevil.pd.prjp.data

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.dxdevil.pd.prjp.R
import com.dxdevil.pd.prjp.Model.DueSoon

class DueSoonListAdapter(private val list: ArrayList<DueSoon>, private val context: Context) :
    RecyclerView.Adapter<DueSoonListAdapter.ViewHolder>() {

//    override fun onCreateViewHolder(parent: ViewGroup, position: Int): ViewHolder {

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.row_doclist, parent, false)
        return DueSoonListAdapter.ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder?.bindItem(list[position])

    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItem(document: DueSoon) {
            var docname: TextView = itemView.findViewById(R.id.txt_doc) as TextView
            //var bt_sign: Button = itemView.findViewById(R.id.bt_sign) as Button
            docname.text = document.docname
        }
    }

}