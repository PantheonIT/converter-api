package ru.pantheon.api.converter.dto

/**
 * Обертка над результатами обработки документа.
 */
data class ConverterDocumentDTO(

    /**
     * Содержимое документа в HTML-формате.
     */
    val content: String,

    /**
     * Коллекция обёрток над извлечёнными из документа файлами.
     */
    val images: Set<ConverterImageDTO> = emptySet()
)