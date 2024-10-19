package logkat

/**
 * Defines an expect class for logging messages with different log levels.
 * This class should be implemented in platform-specific code to provide actual logging functionality.
 *
 * @property LogKat The expect class for logging messages.
 *
 * @author Prashant Singh
 */
@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
expect class LogKat {
    companion object {

        /**
         * Logs an error message with the specified tag and message.
         *
         * @param tag The tag identifying the source of the log message.
         * @param msg The log message to be logged.
         */
        fun e(
            tag: String,
            msg: String,
        )

        /**
         * Logs a warning message with the specified tag and message.
         *
         * @param tag The tag identifying the source of the log message.
         * @param msg The log message to be logged.
         */
        fun w(
            tag: String,
            msg: String,
        )

        /**
         * Logs a verbose message with the specified tag and message.
         *
         * @param tag The tag identifying the source of the log message.
         * @param msg The log message to be logged.
         */
        fun v(
            tag: String,
            msg: String,
        )

        /**
         * Logs an info message with the specified tag and message.
         *
         * @param tag The tag identifying the source of the log message.
         * @param msg The log message to be logged.
         */
        fun i(
            tag: String,
            msg: String,
        )

        /**
         * Logs a debug message with the specified tag and message.
         *
         * @param tag The tag identifying the source of the log message.
         * @param msg The log message to be logged.
         */
        fun d(
            tag: String,
            msg: String,
        )
    }
}
