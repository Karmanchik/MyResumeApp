package app.nocamelstyle.myresumeapp

import java.io.Serializable

//projects list:
//KnowMe
//FinishWorker
//IPHK
//Judebo
//Friendzone
//Cryptostumped
//Irregular

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
        skills = listOf("kotlin", "OOP", "Firebase", "Glide", "Retrofit", "Billing system",
            "Facebook SDK", "Google Map", "Intercom"),
        description = "FriendZone is an application designed to bring like-minded people together. " +
                "We all want to meet someone who shares our interests and make a lasting connection. " +
                "Finding that connection can be a daunting task in this age where everyone " +
                "lives in the fast lane.",
        websiteUrl = "https://thefriendzone.app/",
        androidUrl = "https://play.google.com/store/apps/details?id=com.app.friendzone",
        iOSUrl = null
    ),
    Project(
        name = "IPHK",
        fileName = "1.jpg",
        skills = listOf("kotlin", "OOP"),
        description = "Мобильное приложение для пациентов ИПХиК (Институт пластической хирургии и косметологии).\n" +
                "В приложении вы сможете узнать об услугах, докторах и технологиях Института красоты на Ольховке в удобном формате.\n" +
                "Выбирайте нужное время и записывайтесь к доктору прямо в приложении.\n" +
                "Приложение вовремя напомнит о приёме, а также пришлет вам результаты вашего посещения после приёма у доктора.",
        websiteUrl = null,
        androidUrl = "https://play.google.com/store/apps/details?id=com.iphk.mobile",
        iOSUrl = null
    ),
    Project(
        name = "FinishWorker",
        fileName = "1.jpg",
        skills = listOf("kotlin", "OOP"),
        description = "Finish Worker — это удобный онлайн-сервис, через который\n" +
                "клиенты могут заказать, оплатить и получить отчеты о финишных\n" +
                "ремонтно-строительных работах.\n" +
                "Теперь при необходимости заказать финишные работы больше\n" +
                "не надо искать незнакомых исполнителей и верить сомнительным\n" +
                "сметам!\n" +
                "Приложение точно рассчитает сколько необходимо работ,\n" +
                "материалов и специалистов для реализации проекта. Перед заказом\n" +
                "услуг клиент точно знает сколько продлиться выполнение работ, кто\n" +
                "будет оказывать услуги и какие материалы будут использованы.",
        websiteUrl = null,
        androidUrl = "https://play.google.com/store/apps/details?id=com.finishworker",
        iOSUrl = null
    ),
    Project(
        name = "Irregular",
        fileName = "1.jpg",
        skills = listOf("kotlin", "OOP"),
        description = "Для изучающих английский язык наше приложение поможет легко освоить тему " +
                "irregular verbs. Уникальная методика запоминания позволит быстро и без особых " +
                "проблем выучить неправильные глаголы английского языка.",
        websiteUrl = null,
        androidUrl = "https://play.google.com/store/apps/details?id=com.xayccone.irregular",
        iOSUrl = null
    ),
    Project(
        name = "Judebo - работа, вакансии, резюме",
        fileName = "1.jpg",
        skills = listOf("kotlin", "OOP"),
        description = "Вакансии, резюме, курсы повышения квалификации, образовательные программы.",
        websiteUrl = "https://ru.judebo.com/search_job/",
        androidUrl = "https://play.google.com/store/apps/details?id=com.byte4b.judebo",
        iOSUrl = null
    ),
    Project(
        name = "KnowMe",
        fileName = "1.jpg",
        skills = listOf("kotlin", "OOP"),
        description = "Приложение повышает безопасность сотрудников строительных и других компаний, " +
                "деятельность которых находится в зоне повышенного риска. Благодаря этому приложению " +
                "вы можете получить быстрый доступ к жизненно важной информации о человеке в случае " +
                "чрезвычайной ситуации, когда сам сотрудник находится без сознания или не может ответить.\n" +
                "Доступ к информации осуществляется сотрудником экстренной службы по предварительному " +
                "разрешению на передачу и хранение полученных нами персональных данных. " +
                "Приложение работает через браслет NFC.",
        websiteUrl = "http://knowmesos.com/",
        androidUrl = "https://play.google.com/store/apps/details?id=com.app.knowme",
        iOSUrl = "https://apps.apple.com/us/app/knowmesos/id1499710935"
    ),
    Project(
        name = "CryptoStumped",
        fileName = "1.jpg",
        skills = listOf("kotlin", "OOP"),
        description = "The app is a client part of the Cryptostamped service, and allows you to scan " +
                "QR and DATAMATRIX codes created by us, as well as NFC tags. The content of the " +
                "codes we created opens in a structured form. The app also allows you to scan all " +
                "other QR codes and NFC tags, not just our own. In this case, their web content is " +
                "opened by the built-in browser. Other content is simply displayed on the screen. " +
                "The app allows you to manually enter our service IDs, in cases when it is no longer " +
                "possible to read them from the QR code. The ID can be find on a sticker next to the " +
                "QR code. The app optimizes the device's camera settings to read QR codes more " +
                "efficiently, unlike other apps.",
        websiteUrl = "https://cryptostamped.com/",
        androidUrl = "https://play.google.com/store/apps/details?id=com.alt.karman.cryptostamped",
        iOSUrl = "https://apps.apple.com/us/app/cryptostamped/id1458860901"
    )
)