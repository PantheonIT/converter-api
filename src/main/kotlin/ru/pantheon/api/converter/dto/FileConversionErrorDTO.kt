package ru.pantheon.api.converter.dto

/**
 * Обёртка над ошибкой конвертации файла.
 */
data class FileConversionErrorDTO(
    /**
     * Идентификатор файла.
     */
    val fileId: Long,

    /**
     * Идентификатор версии файла.
     */
    val fileVersionId: Long,

    /**
     * Сообщение об ошибке.
     */
    val errorMessage: String
)
