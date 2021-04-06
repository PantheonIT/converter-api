package ru.pantheon.api.converter.dto

/**
 * Обёртка над результатами обработки уменьшенной копии изображения.
 */
data class ConverterThumbDTO (

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
    val height: Int
)