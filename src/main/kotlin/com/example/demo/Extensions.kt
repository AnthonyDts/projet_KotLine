package com.example.demo

import com.example.demo.dto.ArticleDto
import com.example.demo.dto.PersonDto
import com.example.demo.model.Article
import com.example.demo.model.Person
import java.util.*

fun String.toSlug() = lowercase(Locale.getDefault())
    .replace("\n", " ")
    .replace("[^a-z\\d\\s]".toRegex(), " ")
    .split(" ")
    .joinToString("-")
    .replace("-+".toRegex(), "-")

fun Article.toDto() = ArticleDto(
    slug = this.slug,
    title = this.title,
    headline = this.headline,
    content = this.content,
    addedAt = this.addedAt.toString(),
    authorId = author.id,
    id = this.id
)

fun Person.toDto() = PersonDto(
    firstname = this.firstname,
    lastname = this.lastname,
    description = this.description,
    id = this.id
)