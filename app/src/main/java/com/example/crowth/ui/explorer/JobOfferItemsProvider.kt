package com.example.crowth.ui.explorer

import com.example.crowth.R
import com.example.crowth.ui.explorer.jobList.JobOfferItem
import javax.inject.Inject

class JobOfferItemsProvider @Inject constructor() {

    fun provide() = listOf(
        JobOfferItem(
            1,
            "Maya is interested in",
            R.drawable.image2,
            "Sr. Business Manager",
            "Chief of Staff",
            "London Remotely"
        ),
        JobOfferItem(
            2,
            "Gabriela is interested in",
            R.drawable.image2,
            "Sr. Business Manager",
            "Chief of Staff",
            "London Remotely"
        ),
        JobOfferItem(
            3,
            "Kate is interested in",
            R.drawable.image2,
            "Flutter Developer",
            "Chief of Staff",
            "€ 400/day"
        ),
        JobOfferItem(
            4,
            "Simon is interested in",
            R.drawable.image2,
            "Sr. Business Manager",
            "Chief of Staff",
            "London Remotely"
        ),
        JobOfferItem(
            5,
            "Eddy is interested in",
            R.drawable.image2,
            "QA Team Lead",
            "Team Lead",
            "New York Remotely"
        )
    )
}