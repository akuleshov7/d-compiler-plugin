/**
 * Utility methods to format stuff to string
 */

package com.akuleshov7.cli.common.logging

/**
 * Produces a string with [this] [Throwable]'s class and message
 *
 * @return a string with Throwable's description
 */
fun Throwable.describe(): String = "${this::class.simpleName}: $message"
