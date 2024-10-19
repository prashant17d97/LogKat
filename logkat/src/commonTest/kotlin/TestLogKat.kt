import logkat.LogKat
import kotlin.test.Test

class TestLogKat {

    @Test
    fun testInfo(){
        LogKat.i("TestLogKat", "testInfo")
    }
    @Test
    fun testDebug(){
        LogKat.d("TestLogKat", "testDebug")
    }
    @Test
    fun testWarning(){
        LogKat.w("TestLogKat", "testWarning")
    }
    @Test
    fun testVerbose(){
        LogKat.v("TestLogKat", "testVerbose")
    }
    @Test
    fun testError(){
        LogKat.e("TestLogKat", "testError")
    }

}