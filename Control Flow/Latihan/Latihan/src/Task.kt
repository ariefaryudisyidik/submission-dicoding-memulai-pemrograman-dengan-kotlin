/**
 * Untuk menyelesaikan tugas latihan, Anda tidak diperbolehkan mengubah struktur kode yang sudah ada. Kecuali:
 *    - Untuk melakukan improvisasi kode
 *    - Mengikuti perintah yang ada
 *
 * Cukup tambahkan kode berdasarkan perintah yang sudah ditentukan.
 *
 */

fun main() {
    val listNumber = 1.rangeTo(100)

    for (number in listNumber) {
        // TODO 1
        if (number % 2 == 0) continue

        // TODO 2
        if (number > 15) break

        // TODO 3
        val result = number * (number + 10)
        println("range result is $result")
    }
}

/*
   output:
       range result is 11
       range result is 39
       range result is 75
       range result is 119
       range result is 171
       range result is 231
       range result is 299
       range result is 375
*/