package com.example.horoscopo.data

import com.example.horoscopo.R

class HoroscopeProvider {
    companion object {
        private val horoscopeList: List<Horoscope> = listOf(
            Horoscope("aries", R.string.horoscope_name_aries, R.string.horoscope_date_aries, R.drawable.aries_icon, R.color.tint_aries),
            Horoscope("taurus", R.string.horoscope_name_taurus, R.string.horoscope_date_taurus, R.drawable.taurus_icon, R.color.tint_taurus),
            Horoscope("gemini", R.string.horoscope_name_gemini, R.string.horoscope_date_gemini, R.drawable.gemini_icon, R.color.tint_gemini),
            Horoscope("cancer", R.string.horoscope_name_cancer, R.string.horoscope_date_cancer, R.drawable.cancer_icon, R.color.tint_cancer),
            Horoscope("leo", R.string.horoscope_name_leo, R.string.horoscope_date_leo, R.drawable.leo_icon, R.color.tint_leo),
            Horoscope("virgo", R.string.horoscope_name_virgo, R.string.horoscope_date_virgo, R.drawable.virgo_icon, R.color.tint_virgo),
            Horoscope("libra", R.string.horoscope_name_libra, R.string.horoscope_date_libra, R.drawable.libra_icon, R.color.tint_libra),
            Horoscope("scorpio", R.string.horoscope_name_scorpio, R.string.horoscope_date_scorpio, R.drawable.scorpio_icon, R.color.tint_scorpio),
            Horoscope("sagittarius", R.string.horoscope_name_sagittarius, R.string.horoscope_date_sagittarius, R.drawable.sagittarius_icon, R.color.tint_sagittarius),
            Horoscope("capricorn", R.string.horoscope_name_capricorn, R.string.horoscope_date_capricorn, R.drawable.capricorn_icon, R.color.tint_capricorn),
            Horoscope("aquarius", R.string.horoscope_name_aquarius, R.string.horoscope_date_aquarius, R.drawable.aquarius_icon, R.color.tint_aquarius),
            Horoscope("pisces", R.string.horoscope_name_pisces, R.string.horoscope_date_pisces, R.drawable.pisces_icon, R.color.tint_pisces)
        )

        fun findAll() : List<Horoscope> {
            return horoscopeList
        }

        fun findById(id: String) : Horoscope {
            return horoscopeList.find { it.id == id }!!
        }
    }
}