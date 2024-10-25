package com.example.fantasybooksapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BookAdapter(private val bookList: List<Book>) : RecyclerView.Adapter<BookAdapter.BookViewHolder>() {

    inner class BookViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val bookImage: ImageView = itemView.findViewById(R.id.book_image)
        private val bookTitle: TextView = itemView.findViewById(R.id.book_title)
        private val bookDescription: TextView = itemView.findViewById(R.id.book_description)
        private val dayText: TextView = itemView.findViewById(R.id.day_text) // Reference to the day TextView

        fun bind(book: Book, day: Int) {
            bookImage.setImageResource(book.imageResId)
            bookTitle.text = book.title
            bookDescription.text = book.description

            // Set the day information
            dayText.text = "Day $day"
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_book, parent, false)
        return BookViewHolder(view)
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        val book = bookList[position]
        holder.bind(book, position + 1) // Pass the day number (1-indexed)
    }

    override fun getItemCount() = bookList.size
}
