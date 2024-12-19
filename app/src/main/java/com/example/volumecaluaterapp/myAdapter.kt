package com.example.volumecaluaterapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

// context : request for access currter screen
// 0: resoucese id
// step 1
class myAdapter( context: Context, val shape: List<Appdata>):ArrayAdapter<Appdata>(context,0,shape)
{
    // step 2 create over write getview
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var itemView= convertView
        val holder: viewHolder

        if(convertView == null)
        {
            itemView= LayoutInflater.from(context).inflate(R.layout.grid_item_layout,parent,false)
            // create a view holder
            holder = viewHolder()
            holder.imageView = itemView.findViewById<ImageView>(R.id.imageView)
            holder.textView = itemView.findViewById<TextView>(R.id.Title)

            // tag : it is Associating viewholder to the object with created view
            // avoid to create a new viewholder everytime
            //
            itemView.tag = holder
        }

        else
        {
            // reuse
            holder = convertView?.tag as viewHolder
        }

        // binding data
        val currentitem = shape[position]
        holder.imageView.setImageResource(currentitem.shapeImage)
        holder.textView.text = currentitem.shapeName


        return itemView!!
    }


    // step 2 create a class
    private class viewHolder {
        // view is used for increasing the perfrom of listview , gridview , recycleview for smooth scrolling
        // it is reducing the number of time call the findmyid method
        lateinit var imageView: ImageView
        lateinit var textView: TextView
    }

}