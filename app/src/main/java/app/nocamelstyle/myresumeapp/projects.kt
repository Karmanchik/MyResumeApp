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
    val id: Int,
    val name: String,
    val fileName: String,
    val iconName: String,
    val skills: List<String>,
    val description: String,
    val websiteUrl: String?,
    val androidUrl: String?,
    val iOSUrl: String?
): Serializable

val projects = listOf(
    Project(
        id = 0,
        name = "FriendZone",
        fileName = "friendzone_image.png",
        iconName = "friendzone_logo.png",
        skills = listOf("kotlin", "OOP", "Firebase Crashlitics", "Glide", "Retrofit", "Billing system",
            "Facebook SDK", "Google Map", "Intercom", "Coroutines", "Synthetics", "ViewBinding",
            "Admob", "InMobi", "Firebase RealtimeDatabase", "Firebase Remote Config",
            "Firebase Analytics", "Firebase Cloud Messaging", "Firebase In-App Messaging"),
        description = "FriendZone - приложение, предназначенное для объединения единомышленников. " +
                "Мы все хотим встретить кого-то, кто разделяет наши интересы, и установить прочную связь. " +
                "Найти эту связь может быть непростой задачей в наш век, когда все живут в быстром темпе.",
        websiteUrl = "https://thefriendzone.app/",
        androidUrl = "https://play.google.com/store/apps/details?id=com.app.friendzone",
        iOSUrl = null
    ),
    Project(
        id = 1,
        name = "IPHK",
        fileName = "iphk_image.png",
        iconName = "iphk_logo.png",
        skills = listOf("kotlin", "OOP", "RxJava", "Navigation Component", "Glide", "Dagger", "swift",
            "retrofit", "Groupie", "Timber", "Firebase Crashlitics", "Firebase Analytics", "Biometric"
        ), //todo: add iOS stack
        description = "Мобильное приложение для пациентов ИПХиК (Институт пластической хирургии и косметологии).\n" +
                "В приложении вы сможете узнать об услугах, докторах и технологиях Института красоты на Ольховке в удобном формате.\n" +
                "Выбирайте нужное время и записывайтесь к доктору прямо в приложении.\n" +
                "Приложение вовремя напомнит о приёме, а также пришлет вам результаты вашего посещения после приёма у доктора.",
        websiteUrl = "https://iphk.ru/",
        androidUrl = "https://play.google.com/store/apps/details?id=com.iphk.mobile",
        iOSUrl = "https://apps.apple.com/us/app/%D0%B8%D0%BF%D1%85%D0%B8%D0%BA-%D0%BB%D0%B8%D1%87%D0%BD%D1%8B%D0%B9-%D0%BA%D0%B0%D0%B1%D0%B8%D0%BD%D0%B5%D1%82-%D0%BF%D0%B0%D1%86%D0%B8%D0%B5%D0%BD%D1%82%D0%B0/id1516518539"
    ),
    Project(
        id = 2,
        name = "FinishWorker",
        fileName = "finish_worker_image.jpg",
        iconName = "finish_worker_logo.png",
        skills = listOf("kotlin", "OOP", "MVVM", "Dagger", "Coroutines", "Glide", "Realm",
            "Retrofit", "Gson", "Firebase Analytics", "Firebase Realtime Database",
            "Firebase Messaging", "Firebase Crashlytics", "DataBinding"
        ), //todo: add stack iOS
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
        iOSUrl = "https://apps.apple.com/us/app/finish-worker/id1499489035"
    ),
    Project(
        id = 3,
        name = "Irregular",
        fileName = "irregular_image.jpg",
        iconName = "irregular_logo.png",
        skills = listOf("Java", "OOP", "Glide", "Retrofit", "Realm", "Butterknife", "Dagger",
            "Firebase ads", "Firebase Messaging", "Firebase Analytics", "Billing system"),
        description = "Для изучающих английский язык наше приложение поможет легко освоить тему " +
                "irregular verbs. Уникальная методика запоминания позволит быстро и без особых " +
                "проблем выучить неправильные глаголы английского языка.",
        websiteUrl = null,
        androidUrl = "https://play.google.com/store/apps/details?id=com.xayccone.irregular",
        iOSUrl = null
    ),
    Project(
        id = 4,
        name = "Judebo - работа, вакансии, резюме",
        fileName = "judebo_image.png",
        iconName = "judebo_logo.jpg",
        skills = listOf("kotlin", "OOP", "Firebase Crashlitics", "Admob", "Google Maps",
            "Retrofit", "Realm", "Synthetics"
        ),
        description = "Вакансии, резюме, курсы повышения квалификации, образовательные программы.",
        websiteUrl = "https://ru.judebo.com/search_job/",
        androidUrl = "https://play.google.com/store/apps/details?id=com.byte4b.judebo",
        iOSUrl = null
    ),
    Project(
        id = 5,
        name = "KnowMe",
        fileName = "knowme_image.png",
        iconName = "knowme_logo.jpg",
        skills = listOf("kotlin", "OOP", "NFC", "Retrofit", "Firebase Crashlitics",
            "Camera", "QRScaner", "Firebase ML", "swift"
        ), //todo: add stack iOS
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
        id = 6,
        name = "CryptoStumped",
        fileName = "cryptostamped_image.png",
        iconName = "cryptostamped_logo.jpg",
        skills = listOf("kotlin", "OOP", "NFC", "Retrofit", "Firebase Crashlitics",
            "Camera", "QRScaner", "Firebase ML", "swift"
        ), //todo: add stack iOS
        description = "Приложение является клиентской частью сервиса Cryptostamped и позволяет " +
                "сканировать созданные нами QR-коды и коды DATAMATRIX, а также NFC-метки. " +
                "Содержание созданных нами кодов открывается в структурированном виде. Приложение " +
                "также позволяет сканировать все другие QR-коды и NFC-теги, а не только наши " +
                "собственные. В этом случае их веб-контент открывается встроенным браузером. " +
                "Другой контент просто отображается на экране. Приложение позволяет вручную вводить " +
                "наши сервисные идентификаторы в тех случаях, когда считывать их с QR-кода уже " +
                "невозможно. Идентификатор можно найти на наклейке рядом с QR-кодом. Приложение " +
                "оптимизирует настройки камеры устройства для более эффективного считывания " +
                "QR-кодов, в отличие от других приложений.",
        websiteUrl = "https://cryptostamped.com/",
        androidUrl = "https://play.google.com/store/apps/details?id=com.alt.karman.cryptostamped",
        iOSUrl = "https://apps.apple.com/us/app/cryptostamped/id1458860901"
    )
)