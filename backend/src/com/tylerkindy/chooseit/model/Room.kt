package com.tylerkindy.chooseit.model

import me.liuwj.ktorm.entity.Entity
import me.liuwj.ktorm.schema.Table
import me.liuwj.ktorm.schema.boolean
import me.liuwj.ktorm.schema.varchar

interface Room : Entity<Room> {
    val id: String
    var flip: Boolean?
}

object Rooms : Table<Room>("rooms") {
    val id by varchar("id").primaryKey().bindTo { it.id }
    val flip by boolean("flip").bindTo { it.flip }
}