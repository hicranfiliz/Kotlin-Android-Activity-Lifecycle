package com.example.helloandroid

import android.content.Intent
import androidx.core.content.ContextCompat.startActivity
import androidx.lifecycle.Lifecycle
import androidx.test.core.app.launchActivity
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.helloandroid.ui.SettingsActivity
import junit.framework.TestCase.assertEquals

import org.junit.Test
import org.junit.runner.RunWith
@RunWith(AndroidJUnit4::class)
class MainActivityTest {

   /* @Test
    fun testActivity1(){
        // bu sekilde activity'ye erismis oluyoruz..
        // test class icinde bir activity kullaniyorsak, bu activity referanslarini daha sonradan silmek gerekir.
        // Bunun icin tyrwith resource kullanarak, kullandiktan sonra sil demis oluyoruz.. (use kullanmak.)
        launchActivity<MainActivity>().use { scenario ->
            // bu fonks ile lifecycleın o anki state'ini degistirebiliriz.
            scenario.moveToState(Lifecycle.State.RESUMED)
        }
    }

    // recreate ile uyg tekrar recreate old durumlarda, ui'daki verilerin eski verilerle dogru bir sekilde
    // guncellenip guncellenmedigii ya da viewmodeldan data dogru gelip gelmedigini test eder.
    fun testActivity2(){
        launchActivity<MainActivity>().use { scenario ->
            scenario.recreate()
        }
    }

    // bir activity baska activity.2yi dogru sekilde aciyor mu?
    fun testActivity3(){
        launchActivity<MainActivity>().use { scenario ->
            scenario.onActivity { activity ->
                val intent = Intent(activity, SettingsActivity::class.java)
                startActivity(activity,intent, null)
            }
        }
    }

    // buttn gibi componentlere erisilebilir..
    // perform tiklama eventidir. Btn dogru calisiyor mu kontrol eder.
    fun testActivity4(){
        launchActivity<MainActivity>().use { scenario ->
            onView(withId(R.id.btnopenSecondActivity)).perform(click())
        }
    }
*/
    // activity uzerinde public fonksiyonlara da erisebiliyoruz.
    // Bu aslinda unit testttir.

    // Unit testlerin Android ile ilgili birsey icermeyip,
    // activity uzerinden yapmak istedigimizde test sureleri cok uzuyor.
    // Bu yuzden ui da , activity'de , fragmentda, custom viewlarda anroid spesifik veri ihtiyacı olan yere
    // business logic gerektiren bir kod yazma!!

    // Bu business lgic'i view modelda , repository'de , use case de vs yazmak gerekir.
    @Test
    fun testActivity5(){
        launchActivity<MainActivity>().use { scenario ->
            val name = "Hicran"
            val surName = "Filiz"
            scenario.onActivity { activity ->
                val result = activity.someBusinessLogic(name,surName)
                assertEquals("Hello Hicran Filiz", result)
            }
        }
    }

    @Test
    fun testActivity6(){
        launchActivity<MainActivity>().use { scenario ->
            val name = "Hicran"
            scenario.onActivity { activity ->
                val result = activity.someBusinessLogic(name, null)
                assertEquals("Hello Hicran null", result)
            }
        }
    }

    @Test
    fun testActivity7(){
        launchActivity<MainActivity>().use { scenario ->
            val surName = "Filiz"
            scenario.onActivity { activity ->
                val result = activity.someBusinessLogic(null,surName)
                assertEquals("Hello null Filiz", result)
            }
        }
    }

    @Test
    fun testActivity8(){
        launchActivity<MainActivity>().use { scenario ->
            scenario.onActivity { activity ->
                val result = activity.someBusinessLogic(null,null)
                assertEquals("Hello null null", result)
            }
        }
    }
}