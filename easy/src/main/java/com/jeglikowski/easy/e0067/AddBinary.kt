package com.jeglikowski.easy.e0067

import java.lang.Integer.max

internal class Solution67 {
    fun addBinary(
        a: String,
        b: String,
    ): String {
        var result = ""
        var indexConsidered = 1
        var maxSize = max(a.length, b.length)
        var summaryObBits: Int = 0
        do {
            var valueOfBitFromA = getIntFromString(a, indexConsidered)

            var valueOfBitFromB = getIntFromString(b, indexConsidered)
            summaryObBits = summaryObBits + valueOfBitFromA + valueOfBitFromB
            //   println("val a $valueOfBitFromA val b $valueOfBitFromB sum $summaryObBits")

            result = "${summaryObBits % 2}" + result
            summaryObBits = if (summaryObBits > 1) 1 else 0
            indexConsidered++
        } while (--maxSize > 0)

        if (summaryObBits == 1) {
            result = "1$result"
        }

        return result
    }

    private fun getIntFromString(
        text: String,
        index: Int,
    ): Int {
        return if (text.length - index >= 0) {
            if (text[text.length - index] == '1') 1 else 0
        } else {
            0
        }
    }
}