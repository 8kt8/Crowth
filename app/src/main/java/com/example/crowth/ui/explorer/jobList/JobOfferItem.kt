package com.example.crowth.ui.explorer.jobList

import androidx.annotation.DrawableRes
import com.example.crowth.R
import com.example.crowth.ui.ListItem

data class JobOfferItem(
    override val id: Int,
    val whoInterestText: String,
    @DrawableRes
    val imageId: Int,
    val title: String,
    val subTitle: String,
    val details: String
): ListItem {

    override val type: Int = R.id.job_offer_item

}