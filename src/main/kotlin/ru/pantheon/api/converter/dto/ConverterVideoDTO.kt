package ru.pantheon.api.converter.dto

/**
 * Обёртка над результатами обработки видео-файла.
 */
data class ConverterVideoDTO(

    /**
     * Название файла.
     */
    val name: String,

    /**
     * Расширение файла.
     */
    val extension: String,

    /**
     * Ширина видео-изображения.
     */
    val width: Int,

    /**
     * Высота видео-изображения.
     */
    val height: Int,

    /**
     * Длительность видео в миллисекундах.
     */
    val duration: Long,

    /**
     * Размер файла в байтах.
     */
    var fileSize: Long,

    /**
     * Коллекция уменьшенных копий превью видео.
     */
    val thumbs: Set<ConverterThumbDTO> = emptySet(),
)
