package app.nocamelstyle.myresumeapp

import java.io.Serializable

class Project(
    val name: String,
    private val fileName: String,
    val skills: List<String>,
    val description: String,
    val websiteUrl: String?,
    val androidUrl: String?,
    val iOSUrl: String?
): Serializable {
    val imgFromAssets get() = "assets//$fileName"
}

val projects = listOf(
    Project(
        name = "FriendZone",
        fileName = "1.jpg",
        skills = listOf("kotlin", "java"),
        description = "App for find friends",
        websiteUrl = null,
        androidUrl = null,
        iOSUrl = null
    ),
    Project(
        name = "FriendZone1",
        fileName = "1.jpg",
        skills = listOf("kotlin", "OOP"),
        description = "App for find friends1111",
        websiteUrl = null,
        androidUrl = null,
        iOSUrl = null
    )
)