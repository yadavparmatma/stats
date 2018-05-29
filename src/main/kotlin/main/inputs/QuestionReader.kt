package main.inputs

import java.io.FileInputStream
import java.io.InputStreamReader

class QuestionReader {
    companion object {
        fun read(fileName: String) {
            val inputStream = FileInputStream(fileName)
            val reader = InputStreamReader(inputStream, "UTF-8")
            var character: Int?
            do {
                character = inputStream.read()
                if (character == -1)
                    break
                print(character.toChar())
            } while (true)
            reader.close()
        }
    }
}