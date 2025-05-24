package core.file.provider
import core.util.AudioType
import java.io.File

class FileProvider {

    fun generateFile(parentPath: String, fileName: String, type: AudioType): File? {
        if(parentPath.isEmpty() || fileName.isEmpty()) return null
        if(!File(parentPath).isFile && !File(parentPath).exists()) return null
        return when(type) {
            AudioType.WAV -> generateWavFile(parentPath, fileName)
            AudioType.MP3 -> generateMp3File(parentPath, fileName)
            AudioType.AAC -> generateAacFile(parentPath, fileName)
            AudioType.OGG -> generateOogFile(parentPath, fileName)
            AudioType.AMR -> generateAmrFile(parentPath, fileName)
        }
    }

    // For more info , read this article : http://www.topherlee.com/software/pcm-tut-wavformat.html
    private fun generateWavFile(parentPath: String, fileName: String) : File {
        // .wav
        return File("")
    }

    private fun generateMp3File(parentPath: String, fileName: String) : File {
        // .mp3
        return File("")
    }

    private fun generateAacFile(parentPath: String, fileName: String) : File {
        // .m4a
        return File("")
    }

    private fun generateOogFile(parentPath: String, fileName: String) : File {
        // .ogg
        return File("")
    }

    private fun generateAmrFile(parentPath: String, fileName: String) : File {
        // .amr
        return File("")
    }
}