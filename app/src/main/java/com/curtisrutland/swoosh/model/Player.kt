package com.curtisrutland.swoosh.model

import android.os.Parcel
import android.os.Parcelable

/**
 * Created by inser on 11/10/2017.
 */
class Player constructor(var league: String, var skill: String) : Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readString())

    override fun toString(): String {
        return "League: $league Skill: $skill"
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(league)
        parcel.writeString(skill)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Player> {
        override fun createFromParcel(parcel: Parcel): Player {
            return Player(parcel)
        }

        override fun newArray(size: Int): Array<Player?> {
            return arrayOfNulls(size)
        }
    }
}