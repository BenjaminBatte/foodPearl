package com.benjamin.foodiepal_culinarycompanion

data class BlogPost(
    val title: String,
    val content: String,
    val comments: MutableList<Comment> = mutableListOf()
)

data class Comment(
    val author: String,
    val text: String
)

