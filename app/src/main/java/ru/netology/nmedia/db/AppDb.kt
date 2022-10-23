package ru.netology.nmedia.db

import androidx.room.Database
import androidx.room.RoomDatabase
import ru.netology.nmedia.entity.PostEntity
import ru.netology.nmedia.entity.ReadedPostsEntity
import ru.netology.nmedia.dao.PostDao

@Database(entities = [PostEntity::class, ReadedPostsEntity::class], version = 1)
abstract class AppDb : RoomDatabase() {
    abstract fun postDao(): PostDao
}