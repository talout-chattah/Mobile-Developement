package com.example.dogglers.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dogglers.R
import com.example.dogglers.const.Layout
import com.example.dogglers.data.DataSource

/**
 * Adapter to inflate the appropriate list item layout and populate the view with information
 * from the appropriate data source
 */
class DogCardAdapter(
    private val context: Context?,
    private val layout: Int
): RecyclerView.Adapter<DogCardAdapter.DogCardViewHolder>() {



    val dataset= DataSource.dogs

    /**
     * Initialize view elements
     */
    class DogCardViewHolder(view: View?): RecyclerView.ViewHolder(view!!) {

        val imageView: ImageView = view!!.findViewById(R.id.imageView)
        val textName : TextView = view!!.findViewById(R.id.textName)
        val textAge : TextView = view!!.findViewById(R.id.textAge)
        val textHobbies :TextView = view!!.findViewById(R.id.textHobbies)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogCardViewHolder {

        return when(layout){

            Layout.GRID ->{
                val adapterLayout = LayoutInflater.from(parent.context)
                    .inflate(R.layout.grid_list_item, parent, false)
                DogCardViewHolder(adapterLayout)
            }

            else ->{
                val adapterLayout = LayoutInflater.from(parent.context)
                    .inflate(R.layout.vertical_horizontal_list_item, parent, false)
                DogCardViewHolder(adapterLayout)
            }
        }

    }

    override fun getItemCount(): Int = dataset.size

    override fun onBindViewHolder(holder: DogCardViewHolder, position: Int) {

        val item = dataset[position]

        holder.imageView.setImageResource(item.imageResourceId)

        holder.textName.text = item.name

        val resources = context?.resources

        holder.textAge.text = resources?.getString(R.string.dog_age, item.age)

        holder.textHobbies.text = resources?.getString(R.string.dog_hobbies, item.hobbies)
    }
}
