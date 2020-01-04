package com.atwzj.pixivlib.features

import com.atwzj.pixivlib.features.Artwork
import com.atwzj.pixivlib.features.Rank

interface Pixiv {
    suspend fun getRank(rankMode: String): Rank
    suspend fun getArtwork(id: String): Artwork
}