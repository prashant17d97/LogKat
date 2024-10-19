package logkat


import android.util.Log

/**
 * Android-specific implementation of logging functionality using Android's Log class.
 *
 * @author Prashant Singh
 */

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
actual class LogKat {
    /**
     * Companion object containing actual logging functions.
     */
    actual companion object {
        /**
         * Logs an error message with the specified tag and message.
         * @param tag The tag to identify the log message.
         * @param msg The message to be logged.
         */
        actual fun e(tag: String, msg: String) {
            Log.e(tag, msg)
        }

        /**
         * Logs a warning message with the specified tag and message.
         * @param tag The tag to identify the log message.
         * @param msg The message to be logged.
         */
        actual fun w(tag: String, msg: String) {
            Log.w(tag, msg)
        }

        /**
         * Logs a verbose message with the specified tag and message.
         * @param tag The tag to identify the log message.
         * @param msg The message to be logged.
         */
        actual fun v(tag: String, msg: String) {
            Log.v(tag, msg)
        }

        /**
         * Logs an info message with the specified tag and message.
         * @param tag The tag to identify the log message.
         * @param msg The message to be logged.
         */
        actual fun i(tag: String, msg: String) {
            Log.i(tag, msg)
        }

        /**
         * Logs a debug message with the specified tag and message.
         * @param tag The tag to identify the log message.
         * @param msg The message to be logged.
         */
        actual fun d(tag: String, msg: String) {
            Log.d(tag, msg)
        }
    }
}
