package com.droidmob.album

import com.bluelinelabs.logansquare.annotation.JsonField
import com.bluelinelabs.logansquare.annotation.JsonObject

/**
 * Created by Guru karthik on 10-06-2017.
 */
@JsonObject
class AlbumDto(
        @JsonField(name = arrayOf("id"))
        var _id: Int = -1,
        var albumId: Int = -1,
        var title: String? = null,
        var url: String? = null,
        var thumbnailUrl: String? = null
)