package com.devbuvan.textgenerator.presentation.onbording

import androidx.annotation.DrawableRes
import com.devbuvan.textgenerator.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int,
)

val pages = listOf(
    Page(title = "Lorem Ipsum is simply dummy",
        description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
        R.drawable.onboarding1),
    Page(title = "Lorem Ipsum is simply dummy",
        description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
        R.drawable.onboarding2),
    Page(title = "Lorem Ipsum is simply dummy",
        description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
        R.drawable.onboarding3),
)