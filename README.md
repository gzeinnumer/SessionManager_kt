# SessionManager_kt

#### Make Class Session
```kotlin
class SessionManager(contex: Context){
    val PREF_NAME = "SIMPAN"
    val KEY_TOKEN = "TOKEN"
    val prefs: SharedPreferences = contex.getSharedPreferences(PREF_NAME,0)
    val default:String = ""

    var TOKEN: String
        get() = prefs.getString(KEY_TOKEN,default)
        set(value) = prefs.edit().putString(KEY_TOKEN, value).apply()

}
```

#### Use Session
```kotlin
lateinit var sessionManager: SessionManager

override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    sessionManager = SessionManager(this)
    sessionManager.TOKEN = str

    val str = sessionManager.TOKEN
}
```

---

```
Copyright 2020 M. Fadli Zein
```
