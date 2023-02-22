package com.example.myapplication.data

import com.example.myapplication.R
import com.example.myapplication.model.Affirmation


class Datasource {
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.url1),
            Affirmation( R.string.url2),
            Affirmation(R.string.url3),
            Affirmation(R.string.url4),
            Affirmation(R.string.url5),
            Affirmation(R.string.url6),
            Affirmation( R.string.url1),
            Affirmation(R.string.url2),
            Affirmation(R.string.url3),
            Affirmation(R.string.url4)
        )
    }
}