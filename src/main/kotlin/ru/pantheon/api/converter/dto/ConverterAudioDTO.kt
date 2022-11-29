package ru.pantheon.api.converter.dto

/**
 * Обёртка над результатами конвертации аудио-файла.
 */
data class ConverterAudioDTO(

    /**
     * Название файла.
     */
    val name: String,

    /**
     * Расширение файла.
     */
    val extension: String,

    /**
     * Длительность звуковой дорожки в миллисекундах.
     */
    val duration: Long,

    /**
     * Размер файла в байтах.
     */
    var fileSize: Long
)
