package com.example.fantasybooksapp

data class Book(
    val title: String,
    val description: String,
    val imageResId: Int, // Reference to the book cover image
    val day: Int
)
