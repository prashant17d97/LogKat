package logkat

import platform.Foundation.NSLog

/**
 * Logcat utility class for iOS platform.
 * Provides methods for logging different types of messages.
 */
@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
actual class LogKat {
    /**
     * Companion object containing actual logging functions.
     */
    actual companion object {

        /**
         * Logs an error message with the specified tag and message.
         * @param tag The tag for identifying the source of the log message.
         * @param msg The message to be logged.
         */
        actual fun e(
            tag: String,
            msg: String,
        ) {
            NSLog("\uD83D\uDD34 E   $tag        $msg")
        }

        /**
         * Logs a warning message with the specified tag and message.
         * @param tag The tag for identifying the source of the log message.
         * @param msg The message to be logged.
         */
        actual fun w(
            tag: String,
            msg: String,
        ) {
            NSLog("🟡 W   $tag        $msg")
        }

        /**
         * Logs a verbose message with the specified tag and message.
         * @param tag The tag for identifying the source of the log message.
         * @param msg The message to be logged.
         */
        actual fun v(
            tag: String,
            msg: String,
        ) {
            NSLog("\uD83D\uDFE3 V   $tag        $msg")
        }

        /**
         * Logs an informational message with the specified tag and message.
         * @param tag The tag for identifying the source of the log message.
         * @param msg The message to be logged.
         */
        actual fun i(
            tag: String,
            msg: String,
        ) {
            NSLog("\uD83D\uDFE2 I   $tag        $msg")
        }


        /**
         * Logs a debug message with the specified tag and message.
         * @param tag The tag for identifying the source of the log message.
         * @param msg The message to be logged.
         */
        actual fun d(
            tag: String,
            msg: String,
        ) {
            NSLog("\uD83D\uDD35 D   $tag        $msg")
        }
    }
}
