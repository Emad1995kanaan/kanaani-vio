package com.ipvio.stream

/**
 * KANAANI VIO: the app signs in to Kanaani's servers only. The customer types username and password;
 * the server and its backup servers are built in (the app switches to a backup by itself, see HostFailover).
 */
object Kanaani {
    const val NAME = "KANAANI VIO"
    const val HOST = "http://amlive.cc"
    val BACKUPS = listOf(
        "http://lyvanta.store:80", "http://aro-analytics.com:80", "http://8ksh1856.site:8080", "http://bhsat8kkap.site:8080",
        "http://var21.com:80", "http://baghdadi.fun:80", "http://s1.1234.ninja:80", "http://baghdadi.store:80", "http://kanaani.site:80",
    )
}

/** Texts added by KANAANI VIO (German key ¦ English); Arabic is in DictAr. */
val DictKanaani = """
Anmelden¦Sign in
Gib den Benutzernamen und das Passwort deines Kanaani-Abos ein.¦Enter the username and password of your Kanaani subscription.
Willkommen bei KANAANI VIO¦Welcome to KANAANI VIO
"""
