package ru.pantheon.api.converter.dto

/**
 * Обёртка над результатами обработки изображения.
 */
data class ConverterImageDTO(

    /**
     * Название файла.
     */
    val fileName: String,

    /**
     * Расширение файла.
     */
    val extension: String,

    /**
     * Размер файла в байтах.
     */
    val fileSize: Long,

    /**
     * Ширина изображения.
     */
    val width: Int,

    /**
     * Высота изображения.
     */
    val height: Int,

    /**
     * Коллекция обёрток над уменьшенными копиями изображения.
     */
    val thumbs: Set<ConverterThumbDTO> = emptySet()
)
